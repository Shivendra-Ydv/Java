import java.util.Scanner;

public class Pattern11 {
    public static void row(int i,int n)
    {
        if(i<=n)
        {
            space(1,n-i);
            star(65,64+i);
            System.out.println();
            row(i+1,n);
        }
        return;
    }
    public static void space(int j,int n)
    {
        if(j<=n)
        {
            System.out.print(" ");
            space(j+1,n);
        }
        return;
    }
    public static void star(int j,int n)
    {
        if(j<=n)
        {
            System.out.print((char) n);
            star(j+1,n);
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