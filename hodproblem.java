import java.util.Scanner;
public class hodproblem{
    public static void main(String[]args){
        System.out.print("Enter the number of students : ");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[]ranks = new int[n];
            System.out.print("Enter the student numbers : ");
            for(int i=0;i<n;i++){
                ranks[i] = sc.nextInt();
            }
            int cuts = 0;
            int prev = ranks[0];
            
            for(int i = 0;i<n;i++){
                if(ranks[i]<prev){
                    cuts++;
                    prev = ranks[i];
                }
                else{
                    prev = ranks[i];
                }
            }
            
            System.out.println("The number of cuts for the students is : "+ cuts );
        }
    }
}