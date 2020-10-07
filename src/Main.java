import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        int button;
        Scanner x = new Scanner(System.in);

        // test test

        while (true){
            button = x.nextInt();

            if (button == 1) {
                System.out.println("Language selection");
            } else if (button == 2) {
                System.out.println("Customer support");
            } else if (button == 3) {
                System.out.println("Check the balance");
            } else if (button == 4) {
                System.out.println("Check the load balance");
            } else if (button == 0) {
                System.out.println("Exit");
                break;
            }
        };
    }
}
