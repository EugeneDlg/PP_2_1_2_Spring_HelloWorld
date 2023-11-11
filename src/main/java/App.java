import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld hwBean0 =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld hwBean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(hwBean0.getMessage());
        System.out.println(hwBean0 == hwBean1);
        Cat catBean0 = (Cat) applicationContext.getBean("cat");
        Cat catBean1 = (Cat) applicationContext.getBean("cat");
        System.out.println(catBean0.getName());
        System.out.println(catBean0 == catBean1);
    }
}