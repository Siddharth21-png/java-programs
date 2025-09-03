import java.util.Scanner;
public class reversed{
    public static void main(String[]args){
        System.out.print("Enter the String : ");
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            String reversed_string ="";
            
            for(int i=s.length()-1;i>=0;i--){
                reversed_string = reversed_string + s.charAt(i);
            }
            
            System.out.println("The reversed String : " + reversed_string);
        }
        
    }
}