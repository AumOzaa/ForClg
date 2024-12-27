import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        BankSys top = new BankSys();

        BankSys[] bar = new BankSys[4]; // Entered 4 right now but it was user input

        for (int i = 0; i < bar.length; i++) {
            bar[i] = new BankSys();
        }

        bar[0].acc_Number=1234568798;
        bar[0].acc_Holder="fewrf";
        bar[0].balance=100;

        bar[1].acc_Number=3287;
        bar[1].acc_Holder="fwefgea";
        bar[1].balance=200;

        bar[2].acc_Number=846;
        bar[2].acc_Holder="ar";
        bar[2].balance=300;


        bar[3].acc_Number=3854;
        bar[3].acc_Holder="afwrf";
        bar[3].balance=400;

        top.findTop(bar);
    }
}

class BankSys{
    Scanner sc = new Scanner(System.in);

    int acc_Number;
    String acc_Holder;
    int balance;

    void get() {
        System.out.println("Acc num : "+acc_Number);
        System.out.println("Acc holder name : "+acc_Holder);
        System.out.println("Acc balance : "+balance);

    }

    void set() {
        System.out.println("Enter the acc num : ");
        acc_Number=sc.nextInt();

        System.out.println("Enter the acc holder name :" );
        sc.nextLine();
        acc_Holder=sc.nextLine();

        System.out.println("Enter the balance  : ");
        balance=sc.nextInt();
    }

    void findTop(BankSys[] arr) {
        int[] balance = new int[arr.length]; // Created balance array for storing the array
        for (int i = 0; i < arr.length; i++) {
            balance[i]=arr[i].balance;
        }
        Arrays.sort(balance); // Balance stored in the array
        System.out.println(Arrays.toString(balance));

        for (int i = arr.length-1; i > arr.length-4; i--) {
            if(arr[i].balance==balance[i]) {
                arr[i].get();
                System.out.println();
            }
        }

//        for(int i = arr.length-1; i>arr.length-4; i--) {
//            arr[i].get();
//        }
    }
}
