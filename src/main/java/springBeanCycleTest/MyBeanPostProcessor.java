package springBeanCycleTest;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

    public MyBeanPostProcessor() {
        super();
        // 1.3 获取BeanPostProcessor实现类构造器
        System.out.println("1.3     【BeanPostProcessor类的构造方法】 初始化类构造器 ！！");
        // TODO Auto-generated constructor stub
    }

    @Override
    public Object postProcessAfterInitialization(Object arg0, String arg1)
            throws BeansException {
        // 1.？ 获取BeanPostProcessor实现类构造器
        System.out
                .println("1.16     【BeanPostProcessor接口方法 After】 postProcessAfterInitialization对属性进行更改！");
        return arg0;
    }

    @Override
    public Object postProcessBeforeInitialization(Object arg0, String arg1)
            throws BeansException {
        System.out
                .println("1.13     【BeanPostProcessor接口方法 Before】postProcessBeforeInitialization对属性进行更改！");
        return arg0;
    }
}