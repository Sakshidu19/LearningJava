package ClassConcept;
import java.util.Scanner;
public class Ticket {
    Scanner sc= new Scanner(System.in);
    private String Flightno;
    private String source;
    private String Destination;
    private String Date;

    public String getFlightno()
    {
        return this.Flightno;
    }

    public String getSource()
    {
        return this.source;
    }

    public void setFlightno(String flightno)
    {
        this.Flightno = flightno;
    }

    public void setSource(String source)
    {
        this.source = source;
    }

    public void setDestination(String destination)
    {
        this.Destination = destination;
    }

    public void setDate(String date)
    {
        this.Date = date;
    }

    public String getDestination()
    {
        return Destination;
    }

    public String getDate()
    {
        return Date;
    }

    public void displayTicket()
    {
        System.out.println("Enter the Flight no." );
        this.Flightno=sc.nextLine();
        System.out.println("Enter the source :");
        this.source=sc.nextLine();
        System.out.println("Enter the Destination :");
        this.Destination=sc.nextLine();
        System.out.println("Enter the Date:");
        this.Date=sc.nextLine();
    }


}
