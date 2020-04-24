import java.lang.*;
import java.util.*;
public class TestMain{
    public static BusTicket getTicketDetails()
    {
        BusTicket bt=new BusTicket();
        Person person=new Person();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the passenger name:");
        String n=in.next();
        System.out.println("Enter the gender(M or F / m or f):");
        char g=in.next().charAt(0);
        System.out.println("Enter the age:");
        int a=in.nextInt();
        System.out.println("Enter the ticket no:");
        int t=in.nextInt();
        System.out.println("Enter the ticket price:");
        float p=in.nextFloat();
        
        person.setName(n);
        person.setGender(g);
        person.setAge(a);
        bt.setPerson(person);
        bt.setTicketNo(t);
        bt.setTicketPrice(p);
        
        return bt;
    }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        BusTicket b=getTicketDetails();
        Person p=b.getPerson();
        System.out.println("Ticket no:"+b.getTicketNo());
        System.out.println("Passenger Name:"+p.getName());
        System.out.println("Price of a ticket:"+b.getTicketPrice());
        b.calculateTotal();
        System.out.println("Total Amount:"+b.getTotalAmount());
    }
}