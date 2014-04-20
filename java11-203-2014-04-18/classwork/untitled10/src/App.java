import org.springframework.aop.Advisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

/**
 * Created by ma on 18.04.14.
 */
public class App {
    public static void main(String[] args) {
        Student s1 = new Student("Nail");
        s1.setScore(50);
        System.out.println(s1.getScore());

        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(s1);
        pf.addAdvice(new LogAllMethodsAdvice());
        Advisor ad = new DefaultPointcutAdvisor(new SetterPointCut(),
                new SetterAdvice());
        pf.addAdvisor(ad);

        Student s2 = (Student) pf.getProxy();
        s2.setScore(20);
        System.out.println(s2.getScore());
    }
}
