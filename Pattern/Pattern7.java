import java.util.Scanner;

public class Pattern7 {
    public static void row(int i,int n)
    {
        if(i<=n)
        {
            col(65,64+i);
            System.out.println();
            row(i+1,n);
        }
        return;
    }
    public static void col(int j,int n)
    {
        if(j<=n)
        {
            System.out.print((char) n);
            col(j+1,n);
        }
        return;
    }
    public static void main(String[] args) {
        Scanner ob =new Scanner(System.in);
        System.out.println("Enter value of n:");
        int n=ob.nextInt();
        row(1,n);
    }
}