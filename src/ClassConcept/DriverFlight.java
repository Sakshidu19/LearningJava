package ClassConcept;

public class DriverFlight {
    public static void main(String[] args) {
        Flight a=new Flight();
        a.setFlightName("Luftansa Airline");
        a.displayFlightDetails();
        a.p.displayPassengerDetails();
        a.p.t.displayTicket();
        a.displayDetails();
    }
}
