import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ma on 11.04.14.
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        Performer marat = (Performer) ac.getBean("progger1");
        marat.perform();
        Performer yura = (Performer) ac.getBean("progger2");
        yura.perform();
    }
}
