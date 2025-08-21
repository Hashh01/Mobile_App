package mobile;

import java.util.Scanner;

public class Main {
    

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        char ch;

        do {
            System.out.println("--Application--");
            System.out.println("1. Instagram");
            System.out.println("2. Whatsapp");
            System.out.println("3. Snapchat");
            System.out.println("4. Linkdin");

            System.out.println("Enter Your Choice: ");
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    Instagram insta=new Instagram();
                    insta.display();
                    break;
                case 2:
                	Whatsapp wt=new Whatsapp();
                    wt.display1();
                   break;
                case 3:
                	Snapchat st=new Snapchat();
                    st.display2();
                    break;
                case 4:
                	 Linkdin ld=new Linkdin();
                     ld.display3();
                    break;
                default:
                    System.out.println("---Invalid choice---");
            }

            System.out.println("Do you want to continue? (y/n): ");
            ch = sc.next().charAt(0);

        } while (ch == 'y' || ch == 'Y');

        System.out.println("Thank you for using Applications!");
        
    }
}
