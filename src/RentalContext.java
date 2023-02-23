public class RentalContext {
	//declare the instances of Customer, movie and price classes
    private final Customer customer;
    private final Movie movie;
    private final Price price;
    //declare a constant variable named daysRented
    private final int daysRented;

    //constructor passing through 4 parameters, customer, movie, price, daysRented
    public RentalContext(Customer customer, Movie movie, Price price, int daysRented) {
        this.customer = customer;
        this.movie = movie;
        this.price = price;
        this.daysRented = daysRented;
    }
    
    //get the customer
    public Customer getCustomer() {
        return customer;
    }

    //get the movie
    public Movie getMovie() {
        return movie;
    }
    
    //get the price
    public Price getPrice() {
        return price;
    }

    
    //get the days rented
    public int getDaysRented() {
        return daysRented;
    }
}
