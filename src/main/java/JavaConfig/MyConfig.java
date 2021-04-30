package JavaConfig;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//该注解表示这个类为javaConfig类
@Configuration
public class MyConfig {
    //该注解表示：向容器中注册一个叫做myCar的对象
    @Bean("myCar")
    public Car getCar() {
        return new Car("保时捷","911",300);
    }
    //该注解表示：向容器中注册一个叫做person的对象
    //并且通过byType的方式注入car
    @Bean(name="person",autowire=Autowire.BY_TYPE)
    public Person getPerson() {
        return new Person(1001,"望穿秋水见伊人");
    }
}