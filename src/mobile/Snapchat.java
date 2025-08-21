package mobile;

import java.util.Scanner;

public class Snapchat {
    void display2() {
        Scanner sc = new Scanner(System.in);
        char ch;

        do {
            System.out.println("--Snapchat--");
            System.out.println("1. Chats");
            System.out.println("2. Send a Snap");
            System.out.println("3. Click a snap");
            System.out.println("4. Installing");

            System.out.println("Enter Your Choice: ");
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    System.out.println("Open a Chat");
                    break;
                case 2:
                    System.out.println("Send a snap sucessfully");
                    break;
                case 3:
                    System.out.println("Click the snap");
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

        System.out.println("Thank you for using Snapchat!");
    }

    public static void main(String[] args) {
        Snapchat st=new Snapchat();
        st.display2();
    }
}
