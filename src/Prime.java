import java.util.*;

public class Prime {

    public static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;

        else if (n == 2)
            return true;

        else if (n % 2 == 0)
            return false;

        for (int i = 3; i <= Math.sqrt(n);  i+= 2)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    public static int isPassingFormula(int m,int n)
    {
        int x=(int)Math.pow(2,m);
        int y=(int)Math.pow(3,n);
        int result=(x*y)+1;

        return result;
    }
    public static void main(String[]args)
    {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Range M and N: ");
         int m=sc.nextInt();
         int n=sc.nextInt();
         int count=0;
         if(m<n) {
             for (int i = 0; i <=Math.sqrt(n); i++) {
                 for (int j = 0; j <=Math.sqrt(n); j++) {
                     int number = isPassingFormula(i, j);
                     if (isPrime(number) && number >= m && number <= n) {
                         count++;
                     } //else if (number > n) break;

                 }
             }
             System.out.println(count);
         }
         else System.out.println("Give proper range (maximum limit 1500000)");

    }
}
