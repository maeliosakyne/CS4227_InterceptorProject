public class FrequentRenterPointsLoggingInterceptor implements LoggingInterceptor {

    @Override
    // call log function from Logginginterceptor using override
    public void log(String message){
        System.out.println("Frequent Renter Points ---- " + message);
    }

}
