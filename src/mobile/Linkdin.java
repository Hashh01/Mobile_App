package mobile;

import java.util.Scanner;

public class Linkdin {
    void display3() {
        Scanner sc = new Scanner(System.in);
        char ch;

        do {
            System.out.println("--Linkdin--");
            System.out.println("1. Profile");
            System.out.println("2. Post");
            System.out.println("3. Invitation");
            System.out.println("4. Installing");

            System.out.println("Enter Your Choice: ");
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    System.out.println("Profile Create Successfully");
                    break;
                case 2:
                    System.out.println("Send a post successfully");
                    break;
                case 3:
                    System.out.println("New One Invitation Added");
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

        System.out.println("Thank you for using Linkdin!");
    }

    public static void main(String[] args) {
        Linkdin ld=new Linkdin();
        ld.display3();
    }
}
