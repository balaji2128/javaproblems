import java.util.*;


public class Pairs {
    static void findAllPairs(int array[],int sum)
    {
        HashSet<Integer> hm=new HashSet<Integer>();
        for(int i=0;i< array.length;i++)
        {
            int temp=sum-array[i];
            if(hm.contains(temp))
            {
                System.out.println("The Pairs with given sum is "+array[i]+" and "+temp);
            }
            else hm.add(array[i]);

        }


    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size=sc.nextInt();
        int array[]=new int[size];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<size;i++)
        {
            array[i]=sc.nextInt();
        }
        System.out.println("Enter the sum to find in array: ");
        int sum=sc.nextInt();
        findAllPairs(array,sum);

    }
}
