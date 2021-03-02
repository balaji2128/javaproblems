import java.util.*;
public class MobilePhone {

    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        Contacts object=new Contacts();
        while (true) {
               System.out.println("1) Add Contact\n"+"2) Update contact\n"+"3) Remove contact\n"+"4) Search contact\n"+"5) List All Contacts\n"+"6) Quit");
               int action=sc.nextInt();
               if(action==6) break;
               if(action==1)  object.addContact();
               if(action==2) object.updateContact();
            if(action==3) object.removeContact();
            if(action==4) object.searchContact();
            if(action==5) object.listContact();
        }
    }

}
