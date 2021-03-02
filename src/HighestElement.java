import java.util.*;
public class HighestElement {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<String,Integer> hm = new TreeMap<>();
       int i=0;
        while (i<3) {

            String m= sc.next();
            int n = sc.nextInt();

               hm.put(m,n);
            i++;
        }
        System.out.println(hm.lastKey()+" - "+hm.get(hm.lastKey()));


    }

}
