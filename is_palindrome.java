import java.util.Scanner;
public class is_palindrome{
    public static void main(String[]args){
        System.out.print("Enter the number : ");
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            int original_num = num;
            int reversed_num = 0;
            
            while(num>0){
                int digit = num % 10;
                reversed_num = reversed_num * 10 + digit;
                num = num/10;
            }
            
            if(original_num == reversed_num){
                System.out.println("The number is a palindrome:");
            }
            else{
                System.out.println("The number is not a palindrome:");
            }
        }
    }
}