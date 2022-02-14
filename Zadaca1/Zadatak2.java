
//import java.lang.Math;
import java.util.Scanner;
public class Zadatak2 {
    public static void main(String[] args) {
        final double PI=3.14;
        System.out.print("Enter the radius of your circle in cm: ");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextFloat();
        System.out.print("\nThe surface are of the circle is: "+radius*radius*PI+" cm^2.");
        System.exit(0);
    }

}
