import java.util.Scanner;
public class Even 
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a natural number to display the even numbers before the entered value");
    int m= sc.nextInt();
    for(int i=0;i<=m;i=i+2)
    {
        System.out.println(i);
    }
   int j=1; //while loop
   while(j<=m)
   {
    System.out.println(j);
    j=j+2;
   }
   int k=1;
   do{
    System.out.println(k);
   } while(k<=m);
   } 
}