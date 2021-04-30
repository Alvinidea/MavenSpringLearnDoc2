package springBeanCycleTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycle {

    public static void main(String[] args) {
        System.out.println("1. 现在开始初始化容器");
        // 1. 容器初始化
        ApplicationContext factory = new ClassPathXmlApplicationContext("classpath:springBeanCycleTest.xml");
        System.out.println("2. 容器初始化成功");
        // 2. 获取person对象（通过反射实现）
        Person person = factory.getBean("person",Person.class);
        System.out.println("    "+person);
        System.out.println("3. 现在开始关闭容器！");
        // 3. 销毁容器
        ((ClassPathXmlApplicationContext)factory).registerShutdownHook();
    }
}