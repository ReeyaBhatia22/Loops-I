import java.util.Scanner;
public class Sum
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to find the sum of first n natural numbers");
        int m= sc.nextInt(); 
        int sum=0;
        for(int i=0;i<=m;i++)
        {
          sum=sum+i; 
          
  
        }
        System.out.println("Sum of first n natural numbers is:"+sum);
        sc.close();
    }
    
}