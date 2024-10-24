// Fibonacci series program in java
import java.util.Scanner;
public class Project
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        int a;
        System.out.println("enter the number of terms that you want to diaplay");
        a= sc.nextInt();
        int x=0;
        int y=1;
        for(int i=0;i<=a;i++)
        {
            System.out.println(x);
            int z= x+y;
            x= y; 
            y= z;
        }

    }
}


 

