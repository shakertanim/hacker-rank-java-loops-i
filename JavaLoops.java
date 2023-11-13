import java.util.Scanner;

public class JavaLoops {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        int N;

        N = input.nextInt();
        int i = 1;
        while (i>=1 && i<=10) {
            System.out.println(N+" x "+i+ " = "+(N*i));
            i+=1;
        }
    }
}
