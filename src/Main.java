public class Main 
{
    public static void main(String[] args) {
       
        //object of customer class
        Customer customer = new Customer("Maeliosa Kyne");
        // object of movie class
        Movie movie = new Movie("Harry Potter", Movie.REGULAR);
        //object of price class
        Price price = new RegularPrice();
        //object of rentalcontext 
        RentalContext context = new RentalContext(customer, movie, price, 3);


        //Call the dispatcher 
        InterceptorDispatcher dispatcher = new InterceptorDispatcher();
        ///call the attatchinterceptor method using the dispatcher object created above
        dispatcher.attachInterceptor(new FrequentRenterPointsLoggingInterceptor());

        //create a rental object of class rental
        Rental rental = new Rental(context, dispatcher);
        //store the charge value in the charge variable
        double charge = rental.getCharge();
        //store the frequent rental points in the frequentrenterPoints varaible
        int frequentRenterPoints = rental.getFrequentRenterPoints();
        
        //Print charge and frequent renter points for test case
        System.out.println(String.format("Charge: %.2f, Frequent Renter Points: %d", charge, frequentRenterPoints));
    }
}
