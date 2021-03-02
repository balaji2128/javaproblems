import java.util.*;


public class RailwayPlatform {
    public static void main(String[]args)
    {
        String arrival[]={"1:00","1:40","1:50","2:00","2:15","4:00"};
        String departure[]={"1:10","3:00","2:20","2:30","3:15","6:00"};
        int platform_count=1,i;
        String[] s=new String[2];
        for(i=1;i< arrival.length;i++)
        {
            s=arrival[i].split(":");
            int arrival_time=Integer.parseInt(s[0]+s[1]);

            s=departure[i-1].split(":");
            int dep_time=Integer.parseInt(s[0]+s[1]);

            if(arrival_time<dep_time)
                platform_count++;

        }
        s=arrival[i-1].split(":");
        int arrival_time=Integer.parseInt(s[0]+s[1]);

        s=departure[i-1].split(":");
        int dep_time=Integer.parseInt(s[0]+s[1]);
        if(arrival_time>dep_time) platform_count++;
  System.out.println("Platform needed : "+platform_count);
    }



}
