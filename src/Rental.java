public class Rental {
    private final RentalContext context; //declare the variables
    private final InterceptorDispatcher dispatcher;
    
    //constructor with two parameters
    public Rental(RentalContext context, InterceptorDispatcher dispatcher) {
        this.context = context; //initialize the value
        this.dispatcher = dispatcher;
    }

    public RentalContext getContext() { //get the rental context
        return context;
    }

    public double getCharge() { //calculate the rental charge based on the rental context
        return context.getPrice().getCharge(context.getDaysRented());
    }
    
    

    public int getFrequentRenterPoints() { //calculate the frequent renter points based on the rental context and dispatch the result to any attach interceptor
        int points = context.getPrice().getFrequentRenterPoints(context.getDaysRented());
        dispatcher.dispatch(String.format("Customer: %s, Movie: %s, Points: %d", context.getCustomer().getName(),
                context.getMovie().getTitle(), points));
        return points;
    }
}
