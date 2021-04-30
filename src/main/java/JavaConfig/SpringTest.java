package JavaConfig;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringTest {

    public static void main(String srgs[]) {
        //读取配置文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:JavaConfig.xml");
        Car car = ctx.getBean("myCar", Car.class);
        System.out.println(car);
        Person person = ctx.getBean("person", Person.class);
        System.out.println(person);
    }
}
