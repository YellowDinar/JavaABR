import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by ma on 18.04.14.
 */
public class SetterAdvice implements MethodInterceptor{

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("SETTER");
        return methodInvocation.proceed();
    }
}
