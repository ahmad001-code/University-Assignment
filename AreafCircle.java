
package areafcircle;
import java.util.Scanner;

public class AreafCircle {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the r"); // r shows the raduis.//
        double r = input.nextDouble();
        double A = Math.PI*r*r; // A shows the area.//
        System.out.println("The area of circle is"+A);
       
 
    }
    
}
