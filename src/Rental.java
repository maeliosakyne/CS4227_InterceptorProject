public class Rental {
    private final RentalContext context;
    private final InterceptorDispatcher dispatcher;
    
    
    public Rental(RentalContext context, InterceptorDispatcher dispatcher) {
        this.context = context;
        this.dispatcher = dispatcher;
    }

    public RentalContext getContext() {
        return context;
    }

    public double getCharge() {
        return context.getPrice().getCharge(context.getDaysRented());
    }
    
    

    public int getFrequentRenterPoints() {
        int points = context.getPrice().getFrequentRenterPoints(context.getDaysRented());
        dispatcher.dispatch(String.format("Customer: %s, Movie: %s, Points: %d", context.getCustomer().getName(),
                context.getMovie().getTitle(), points));
        return points;
    }
}
