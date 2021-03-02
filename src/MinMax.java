import java.util.*;

public class MinMax {
    public static void main(String[]args) {
        String[] array = new String[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            array[i]=sc.next();
        }
        String small[]=new String[1];
        String greater[]=new String[1];
        small[0]=array[0];
        greater[0]=array[0];
        for(int i=1;i<10;i++)
        {
            if(small[0].length() > array[i].length())
            {
                small[0]=array[i];
            }
            if(greater[0].length() <array[i].length())
            {
                greater[0]=array[i];
            }
        }
        System.out.println(small[0]+"  "+greater[0]);

    }

}
