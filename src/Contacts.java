import java.util.*;
class Phone
{
    String name,number;
    Phone(String name,String number)
    {
        this.name=name;
        this.number=number;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setNumber(String number)
    {
        this.number=number;
    }
    public String getName()
    {
        return name;
    }
    public String getNumber()
    {
        return number;
    }
}
public class Contacts{
    public static Scanner sc=new Scanner(System.in);
    ArrayList<Phone> contact=new ArrayList<Phone>();
    public void addContact() {
        System.out.println("Enter the contact name and mobile number:");
        String name = sc.next();
        String mobileNo = sc.next();
        Phone ob=new Phone(name,mobileNo);
        contact.add(ob);
        //System.out.println(contact.size());
    }
    public void removeContact()
    {
        System.out.println("Enter the contact name:");
        String name=sc.next();
        int flag=0;
        for(int i=0;i<contact.size();i++)
        {
            Phone n=contact.get(i);
            String rem=n.getName();
            if(rem.equals(name))
            {
                contact.remove(i);
                System.out.println("Contact Deleted");
                flag=1;
                break;
            }
        }
        if(flag==0) System.out.println("Match not found");
    }
    public  void updateContact()
    {
        System.out.println("Enter the contact name and mobile number to update:");
        String name=sc.next();
        String num=sc.next();
        Phone obj=new Phone(name,num);
        for(int i=0;i<contact.size();i++)
        {
            Phone n=contact.get(i);
            String sear=n.getName();
            if(sear.equals(name))
            {
                contact.remove(i);
                contact.add(obj);
            }
        }

    }
    public  void searchContact()
    {
        //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the contact name to Search :");
        String name=sc.next();

        int flag=0;
        for(int i=0;i<contact.size();i++)
        {
            Phone n=contact.get(i);
            String rem=n.getName();
            if(rem.equals(name))
            {
                //contact.remove(i);
                System.out.println("Contact Found");
                flag=1;
                break;
            }
        }
        if(flag==0) System.out.println("Match not found");

    }
    public  void listContact()
    {
        for(Phone i:contact)
        {
            System.out.println(i.getName()+" - "+i.getNumber());
        }
    }






}



