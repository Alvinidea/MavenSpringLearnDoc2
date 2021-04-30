package example.controller;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

    @RequestMapping("/home")
    public String index(){
        System.out.println("sadddds");
        return "home";
        // DefaultListableBeanFactory
        // ClassPathXmlApplicationContext
        //ApplicationContext
    }
}