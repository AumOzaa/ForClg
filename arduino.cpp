const int ldrPin = A0;    // LDR on A0
const int ledPin = 9;     // LED on PWM pin 9
int threshold = 500;      // Adjust via Serial Monitor

void setup() {
  pinMode(ledPin, OUTPUT);
  Serial.begin(9600);     // Start Serial Monitor
}

void loop() {
  int lightValue = analogRead(ldrPin);
  Serial.print("Light: ");
  Serial.println(lightValue);

  // Auto ON/OFF Logic (adjust threshold as needed)
  if (lightValue > threshold) { // Use > instead of <
  analogWrite(ledPin, 255); // Turn ON in dark
} else {
  analogWrite(ledPin, 0); // Turn OFF in light
}

  // Calibrate via Serial Monitor
  if (Serial.available() > 0) {
    threshold = Serial.parseInt();
    Serial.print("New threshold: ");
    Serial.println(threshold);
  }
  delay(100);
}
