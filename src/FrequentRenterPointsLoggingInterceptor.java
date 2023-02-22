public class FrequentRenterPointsLoggingInterceptor implements LoggingInterceptor {

    @Override
   
    public void log(String message){
        System.out.println("Frequent Renter Points" + message);
    }

}
