import java.util.*;
public class Permute {
    static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
    static void permutation(String str, int l, int r)
    {
        if (l == r)
            System.out.println(str);
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permutation(str, l+1, r);
                str = swap(str,l,i);
            }
        }
    }
    public static void main(String[]args)
    {
                String str = "ABC";
                int n = str.length();

                permutation(str, 0, n-1);
            }








    }

