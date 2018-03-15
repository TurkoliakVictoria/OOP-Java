import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("a*x^2 + b*x + c = 0");
        System.out.print("a = ");
        double a = in.nextDouble();
        System.out.print("b = ");
        double b = in.nextDouble();
        System.out.print("c = ");
        double c = in.nextDouble();

        double x1, x2;
        double D = b*b - (4 * a * c);
        if (D > 0) {
            x1 = (-b + Math.sqrt(D))/(2*a);
            x2 = (-b - Math.sqrt(D))/(2*a);
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
        }
        else if (D == 0){
            double x = (-b)/(2*a);
            System.out.println("x1=" + x);
            System.out.println("x2=" + x);
        }
        else {
            System.out.println("Error");
        }
    }
}
