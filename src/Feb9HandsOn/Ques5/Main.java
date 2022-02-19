package  Feb9HandsOn.Ques5;

import java.util.Scanner;

class Main
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int k= sc.nextInt();
            testClass p = new testClass();
            p.display(k);
        }
    }
}

