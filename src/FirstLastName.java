import java.util.*;

public class FirstLastName {
    public static void main(String[]args)
    {
        String original="Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjorn:Tornbull;Rapheal:Corwill;Alfred:Corwill";
        String[] splited=original.toUpperCase().split(";");
        Map<String,TreeSet<String>> hm=new TreeMap<String,TreeSet<String>>();

        for(String i:splited)
        {
            String []array=i.split(":");
            if(!hm.containsKey(array[1]))
            {
                TreeSet<String> ts=new TreeSet<String>();
                ts.add(array[0]);
                hm.put(array[1],ts);

            }
            else{
                TreeSet<String> ts=hm.get(array[1]);
                ts.add(array[0]);
                hm.put(array[1],ts);
            }
        }
        for(String i:hm.keySet())
        {
            for(String j: hm.get(i))
            {
                System.out.println("( "+i+","+j+" )");

            }
        }

    }



}
