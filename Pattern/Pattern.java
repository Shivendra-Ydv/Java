import java.util.Scanner;

public class Pattern {
    public static void row(int i,int n,int p)
    {
        if(i<=n)
        {
            col(1,n,p);
            System.out.println();
            row(i+1,n,p+n);
        }
        return;
    }
    public static void col(int j,int n,int p)
    {
        if(j<=n)
        {
            System.out.print(p);
            col(j+1,n,p+1);
        }
        return;
    }
    public static void main(String[] args) {
        Scanner ob =new Scanner(System.in);
        System.out.println("Enter value of n:");
        int n=ob.nextInt();
        row(1,n,1);
    }
}

