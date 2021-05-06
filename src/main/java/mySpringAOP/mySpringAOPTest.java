package mySpringAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mySpringAOPTest {
    public static void main(String args[])
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:mySpringAOP.xml");
        ArithmeticCalculatorImpl ac = (ArithmeticCalculatorImpl)ctx.getBean("mathImpl");
        ac.add(3,5);
    }
}
