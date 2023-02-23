import java.util.List;
import java.util.ArrayList;

public class InterceptorDispatcher {

    //call the interceptor 
    private List<LoggingInterceptor> interceptors = new ArrayList<>();
 
    //attach the interceptor
    public void attachInterceptor(LoggingInterceptor interceptor) {
        interceptors.add(interceptor);
    }
    //detatch the inteceptor
    public void detatchInterceptor(LoggingInterceptor interceptor) {
        interceptors.remove(interceptor);
    }
    
    //dispatch a message to all the interceptors in the list
    public void dispatchInterceptor(String message) {
        for(LoggingInterceptor interceptor : interceptors ) {
            interceptor.log(message);
        }

    }

}