public class DoWhile 
{
    public static void main(String[]args)
    {
        int k=0;
        while(k>5)
        {
            System.out.println("Inside while loop");
            k++;
        }
        do
        {
            System.out.println("Inside do while");
            k++;
        }
        while(k>5);
    }
}
