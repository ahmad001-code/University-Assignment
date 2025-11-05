
package pkgthis.program.enter.the.weekday.names;
import java.util.Scanner;

public class ThisProgramEnterTheWeekdayNames {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for(int tries = 1; tries<=7;tries++){
        System.out.println("Enter numbers from 1 to 7");
        int num = input.nextInt();
       
        if (num==1 ){
            System.out.println("this is satarday");
        }
        
        else if (num == 2 ){
            System.out.println("this is sunday");
        }
        else if (num == 3){
            System.out.println("this is monday");
        }
        else if (num==4){
            System.out.println("this is thirsday");
        }
        else if (num==5){
            System.out.println("this is wednsday");
        }
        else if (num == 6){
            System.out.println("this is THUESDAY");
        }
        else if (num == 7){
            System.out.println("this is friday");
        }
        else {System.out.println("invalid number");
               
    }}
    
}}
