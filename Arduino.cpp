// Removed Arduino.h import to avoid conflicting linkage errors

// Pin definitions
const int buttonPin = 2;      // Latching push button pin
const int irSensorPin = 7;    // IR sensor pin
const int trigPin = 9;        // Ultrasonic sensor trigger pin
const int echoPin = 10;        // Ultrasonic sensor echo pin
const int buzzerPin = 5;      // Buzzer pin

bool systemState = false;    // Tracks the ON/OFF state of the helmet
bool buttonPressed = false;  // Tracks the button press state
bool isUltrasonicBeeping = false; // Tracks if ultrasonic is controlling the buzzer
int eyeClosureCount = 0;     // Tracks the number of times eyes were closed
unsigned long eyeClosureStartTime = 0; // Start time of eye closure

void setup() {
  pinMode(buttonPin, INPUT);         // Button connected with external resistor to 5V
  pinMode(irSensorPin, INPUT);      
  pinMode(trigPin, OUTPUT);
  pinMode(echoPin, INPUT);
  pinMode(buzzerPin, OUTPUT);

  digitalWrite(buzzerPin, LOW);      // Ensure buzzer is off at startup
  Serial.begin(9600);
  Serial.println("System Initialized. Press the button to toggle.");
}

void loop() {
  handleButtonPress();

  if (systemState) {
    handleIRSensors();
    handleUltrasonicSensor();
  } else {
    digitalWrite(buzzerPin, LOW); // Ensure buzzer is off when system is off
  }
}

void handleButtonPress() {
  if (digitalRead(buttonPin) == LOW) { // Button pressed
    delay(50); // Debounce delay
    if (!buttonPressed) {
      systemState = !systemState; // Toggle system state
      Serial.println(systemState ? "System ON" : "System OFF");
      buttonPressed = true;
    }
  } else {
    buttonPressed = false; // Reset when button released
  }
}

void handleIRSensors() {
  if (digitalRead(irSensorPin) == LOW) {  // Eyes closed detected
    if (eyeClosureStartTime == 0) {
      eyeClosureStartTime = millis(); // Start timing
    }

    // Check if eyes are closed for more than 5 seconds
    if (millis() - eyeClosureStartTime >= 5000) {
      eyeClosureCount++;
      Serial.print("Eyes closed for 5 seconds. Count: ");
      Serial.println(eyeClosureCount);

      if (eyeClosureCount == 1) {
        beepBuzzer(1000); // Beep for 1 second on first occurrence
      } else if (eyeClosureCount >= 2) {
        beepBuzzer(5000); // Beep for 5 seconds on second occurrence and beyond
      }
      
      eyeClosureStartTime = 0; // Reset timer after action
    }
  } else {
    eyeClosureStartTime = 0; // Reset if eyes open before 5 seconds
  }
}

void handleUltrasonicSensor() {
  long duration = getUltrasonicDistance();

  if (duration > 0) { // Valid reading
    int distance = duration * 0.0343 / 2; // Distance in cm

    Serial.print("Ultrasonic: Object detected at: ");
    Serial.print(distance);
    Serial.println(" cm");

    if (distance <= 200) {
      isUltrasonicBeeping = true;
      beepBuzzer(1000); // Beep for 1 second when object is near
    } else {
      isUltrasonicBeeping = false; // Release control if object is far
      digitalWrite(buzzerPin, LOW); 
    }
  } else {
    Serial.println("Ultrasonic: No object detected or out of range.");
    isUltrasonicBeeping = false;
    digitalWrite(buzzerPin, LOW); 
  }
}

long getUltrasonicDistance() {
  digitalWrite(trigPin, LOW);
  delayMicroseconds(2);
  digitalWrite(trigPin, HIGH);
  delayMicroseconds(10);
  digitalWrite(trigPin, LOW);

  long duration = pulseIn(echoPin, HIGH, 30000); // 30ms timeout for ~500cm max distance
  return duration == 0 ? -1 : duration; // Return -1 for invalid measurement
}

void beepBuzzer(int duration) {
  digitalWrite(buzzerPin, HIGH); // Buzzer ON
  delay(duration);               // Beep duration based on parameter
  digitalWrite(buzzerPin, LOW);  // Buzzer OFF
}
