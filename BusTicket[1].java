import java.util.*;
import java.lang.*;
public class BusTicket
{
    private int ticketNo;
    private float ticketPrice;
    private float totalAmount;
    private Person person;
    public int getTicketNo()
    {
        return ticketNo;
    }
    public float getTicketPrice()
    {
        return ticketPrice;
    }
    public float getTotalAmount()
    {
        return totalAmount;
    }
    public Person getPerson()
    {
        return person;
    }
    public void setTicketNo(int ticketNo)
    {
        this.ticketNo=ticketNo;
    }
    public void setTicketPrice(float ticketPrice)
    {
        this.ticketPrice=ticketPrice;
    }
    public void setTotalAmount(float totalAmount)
    {
        this.totalAmount=totalAmount;
    }
    public void setPerson(Person person)
    {
        this.person=person;
    }
    public void calculateTotal()
    {
        Person p=getPerson();
        float amount=0;
        if(p.getAge()<16)
        {
            amount=(ticketPrice*50)/100;
            ticketPrice=ticketPrice-amount;
            totalAmount=ticketPrice;
        }
        else if(p.getAge()>=60)
        {
            amount=(ticketPrice*25)/100;
            ticketPrice=ticketPrice-amount;
            totalAmount=ticketPrice;
        }
        else if(p.getGender()=='f' || p.getGender()=='F')
        {
            amount=(ticketPrice*10)/100;
            ticketPrice=ticketPrice-amount;
            totalAmount=ticketPrice;
        }
        else{
            totalAmount=ticketPrice;
        }
    }
}