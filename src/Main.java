import java.util.Scanner;

class Mathem {
    static int sqrt(int val1) {
        return val1 * val1;
    }

    static int plus(int val1) {
        return val1 += val1;
    }

}


public class Main {

    public static void main(String[] args) {
        int button;
        Mathem sum = new Mathem();
        Scanner scan = new Scanner(System.in);
        while (true) {
            button = scan.nextInt();
            if (button == 1) {
                System.out.println(sum.sqrt(scan.nextInt()));
            }
            if (button == 2) {
                System.out.println(sum.plus(scan.nextInt()));
            }
            if (button ==0 ) {
                System.out.println("Exit");
                break;
            }

        }
    }
}
