package ClassConcept;

public class CarDrink {
    String brand;
    String Name;
    double cost;
    double mileage;
    String Name1;
    int qty;
    double price;
    public static void main(String [] args){
        CarDrink C1 = new CarDrink();
        C1.brand="Maruti Suzuki";
        C1.Name="Ciaz";
        C1.cost= 1200000;
        C1.mileage=20;
        System.out.println(C1.brand);
        System.out.println(C1.Name);
        System.out.println(C1.cost);
        System.out.println(C1.mileage);
        CarDrink D1 = new CarDrink();
        D1.Name1="Old monk";
        D1.qty= 2;
        D1.price=2400;
        System.out.println(D1.Name1);
        System.out.println(D1.qty);
        System.out.println(D1.price);
    }
}
