package patterns;

import java.util.Scanner;

public class p7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int n= sc.nextInt();
            for (int i=0;i<n;i++)
            {
                for(int j=0;j<(n-i-1);j++)
                {
                    System.out.print(" ");
                }
                for(int k=0;k<(2*i+1);k++)
                {
                    System.out.print("*");
                }
                for(int l=0;l<(n-i-1);l++)
                {
                    System.out.print(" ");
                }
                System.out.print("\n");
            }
    }
}
