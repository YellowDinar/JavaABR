import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.BeforeAdvice;

import java.lang.reflect.Method;
import java.util.Date;

/**
 * Created by ma on 18.04.14.
 */
public class LogAllMethodsAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("Method " + methodInvocation.getMethod().getName() +
                            " called." + new Date());

        return methodInvocation.proceed();
    }
}
