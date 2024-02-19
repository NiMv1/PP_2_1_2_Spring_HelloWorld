import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());

        Cat bean3 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(bean3.getMessage());

        Cat bean4 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(bean4.getMessage());

        boolean result = bean.equals(bean2);
        boolean result2 = bean3.equals(bean4);

        System.out.println(result);
        System.out.println(result2);
    }
}