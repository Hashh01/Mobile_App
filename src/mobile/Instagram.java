package mobile;

import java.util.Scanner;

public class Instagram {
    void display() {
        Scanner sc = new Scanner(System.in);
        char ch;

        do {
            System.out.println("--Instagram--");
            System.out.println("1. Reels");
            System.out.println("2. Story");
            System.out.println("3. Post");
            System.out.println("4. Installing");

            System.out.println("Enter Your Choice: ");
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    System.out.println("Start a reel");
                    break;
                case 2:
                    System.out.println("Story Uploaded");
                    break;
                case 3:
                    System.out.println("Post Uploaded");
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

        System.out.println("Thank you for using Instagram!");
    }

    public static void main(String[] args) {
        Instagram ig = new Instagram();
        ig.display();
    }
}
