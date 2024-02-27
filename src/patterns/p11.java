package patterns;

import java.util.Scanner;

public class p11 {
    public static void main(String[] args) {
        int tg=0;
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<i+1;j++)
            {
                if (tg==1)
                {
                    tg=0;
                }
                else
                {
                    tg=1;
                }
                System.out.print(tg+" ");
            }
            System.out.print("\n");
        }
    }
}
