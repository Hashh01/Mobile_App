package mobile;

import java.util.Scanner;

public class Whatsapp {
    void display1() {
        Scanner sc = new Scanner(System.in);
        char ch;

        do {
            System.out.println("--Whatsapp--");
            System.out.println("1. Chats");
            System.out.println("2. Status");
            System.out.println("3. Call");
            System.out.println("4. Installing");

            System.out.println("Enter Your Choice: ");
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    System.out.println("Open a Chat");
                    break;
                case 2:
                    System.out.println("Status Uploadd");
                    break;
                case 3:
                    System.out.println("Calling to another Person");
                    break;
                case 4:
                    System.out.println("Installation Starting");
                    break;
                default:
                    System.out.println("---Invalid choice---");
            }

            System.out.println("Do you want to continue? (y/n): ");
            ch = sc.next().charAt(0);

        } while (ch == 'y' || ch == 'Y');

        System.out.println("Thank you for using Whatsapp!");
    }

    public static void main(String[] args) {
        Whatsapp wt=new Whatsapp();
        wt.display1();
    }
}
