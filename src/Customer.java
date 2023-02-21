public class Customer {
   
    private final String name; //private field to store customer name

    public Customer(String name) { //constructor passing one parameter through it
        this.name = name;
    }

    public String getName() { //get customer name
        return name;
    }
}
