package ClassConcept;

public class Flight {
    Passenger p;
    {
        p=new Passenger();
    }
    private String FlightName= "Vistara Airline";

    public String getFlightName() {
        return FlightName;
    }

    public void setFlightName(String flightName) {
        FlightName = flightName;
    }

    public void displayFlightDetails(){
        System.out.println("Fligt Name is " + getFlightName());
    }
    public void displayDetails()
    {
        System.out.println("The Name of the Passenger is : " + p.getName());
        System.out.println("The Age of the Passenger is : " + p.getAge());
        System.out.println("Gender : " + p.getGender());
        System.out.println("Flight number is : " + p.t.getFlightno());
        System.out.println("To : " + p.t.getDestination());
        System.out.println("From : " + p.t.getSource());
        System.out.println("The Date of flight : " + p.t.getDate());
    }
}

