

package ahmadproject;
import java.util.Scanner;


public class AhmadProject {

 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
           int randomNumber = (int)(Math.random()*100);
       
        int guess = -1;
        System.out.println("guess a number between 0 and 100");
        while (guess!=0){
             
     guess = input.nextInt();
            
        if (guess < randomNumber)
            System.out.println("the number is low");
        else if (guess > randomNumber)
            System.out.println("the number is high");
        else if (guess == randomNumber)
            System.out.println("You entered correct number. the number was" + randomNumber );
          guess++;
        }
        
               
    }
    
}
