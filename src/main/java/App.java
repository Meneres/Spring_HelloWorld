import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld beanHw = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanHw2 = (HelloWorld) applicationContext.getBean("helloworld");

        Cat beanCat = applicationContext.getBean("cat", Cat.class);
        Cat beanCat2 = applicationContext.getBean("cat", Cat.class);

        System.out.println("Сравним Hello World: " + (beanHw == beanHw2));
        System.out.println("Сравним Котов: " + (beanCat == beanCat2));




    }
}