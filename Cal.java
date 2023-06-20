
import java.util.*;
class Cal{
    public static void main(String Args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("operator must be *,%.-,+....");
        int result= 0;
        int number1=0;
        int number2=0;
        char operator=' ';
       
        try{
          number1=sc.nextInt();
          operator=sc.next().charAt(0);
          number2=sc.nextInt();
        }
        
        catch(InputMismatchException e){
            System.out.println("Invalid");
        }
        
        switch(operator){
        case '*':
        result = number1 * number2;
        System.out.println(number1 + " * " +number2 + " = " + result);
        break;
        
        case '+':
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        break;
        
        case '-':
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        break;
        
        case '%':
        result = number1 % number2;
        System.out.println(number1 + " % " + number2 + " = " + result);
        break;
        
       
        
        }
    }
}