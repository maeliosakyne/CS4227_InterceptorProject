import java.util.List;
import java.util.ArrayList;

public class InterceptorDispatcher {
    private List<LoggingInterceptor> interceptors = new ArrayList<>();
 


public void attachInterceptor(LoggingInterceptor interceptor) {
    interceptors.add(interceptor);
}

public void detatchInterceptor(LoggingInterceptor interceptor) {
    interceptors.remove(interceptor);
}

public void dispatchInterceptor(String message) {
    for(LoggingInterceptor interceptor : interceptors ) {
        interceptor.log(message);
    }

}

}