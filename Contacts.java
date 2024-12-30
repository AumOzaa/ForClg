import java.util.Arrays;
import java.util.Scanner;

class Contacts{
    String name;
    long mobNumber;
    static Contacts[] favList;
    Contacts[] ListOfContacts;

    Scanner sc = new Scanner(System.in);

    void set() {
        System.out.print("Enter the contact name : ");
        name = sc.nextLine();

        System.out.print("Enter the contact number : ");
        mobNumber = sc.nextLong();
        long check = mobNumber/1000000000;

        while(check!=9 && check!=8 && check!=7 && check!=6) {
            System.out.println("Enter correct number! ");
            mobNumber = sc.nextLong();
        }
    }

    void get() {
        System.out.println("Name : "+name);
        System.out.println("Contact Number : "+mobNumber);
    }

    void create_Fav(Contacts[] listContacts) { // Only adding to the favourite list.
        Contacts[] temp_FavList = new Contacts[1];

        System.out.println("Enter the name of the contact you want to add : ");
        String favName = sc.nextLine();

        boolean isTheir = true;
        for (int i = 0; i < listContacts.length; i++) {
            if(listContacts[i].name.equalsIgnoreCase(favName)) {
                temp_FavList[0] = listContacts[i]; // This change in reference is only for particular object and not the whole array.
                isTheir = false;
            }
        }
        if (isTheir) {
            System.out.println("Contact not found! Enter the correct name !");
        }

        favList=temp_FavList;

    }

    void addFav(Contacts[] listContacts) {
        
        System.out.print("Enter the name of the contact you want to add in Favourite list: ");
        String fav_name=sc.nextLine();

        Contacts[] temp_FavList = new Contacts[favList.length+1];

        boolean checkIsThere = true;
        for (int i = 0; i < listContacts.length; i++) {
            if(listContacts[i].name.equalsIgnoreCase(fav_name)) {
                for (int j = 0; j < favList.length; j++) {
                    temp_FavList[j] = favList[j];
                }
                temp_FavList[favList.length] = listContacts[i];
                checkIsThere=false;
                break;
            }
        }
        if (checkIsThere) {
            System.out.println("Name not found! ");
        }
        favList = temp_FavList;
    }
}

class Mainn{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of contacts you want to add : ");
        int num_Of_Contacts = in.nextInt();

        Contacts obj = new Contacts();
        Contacts[] listContacts = new Contacts[num_Of_Contacts];
        for (int i = 0; i < num_Of_Contacts; i++) {
            listContacts[i] = new Contacts();
            listContacts[i].set();
            System.out.println();
        }
    }
}
