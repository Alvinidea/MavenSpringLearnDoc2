package springBeanCycleTest;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    public MyBeanFactoryPostProcessor() {
        super();
        // 1.1 初始化类构造器
        System.out.println("1.1 【MyBeanFactoryPostProcessor类的构造方法】 初始化类构造器");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0)
            throws BeansException {
        System.out.println("1.2 【MyBeanFactoryPostProcessor类的postProcessBeanFactory方法】获取 id=person 的 BeanDefinition");
        // 1.2 获取 id=person 的 BeanDefinition
        BeanDefinition bd = arg0.getBeanDefinition("person");
        bd.getPropertyValues().addPropertyValue("phone", "110");
        // 在这儿修改了 person 的属性phone的值
    }

}