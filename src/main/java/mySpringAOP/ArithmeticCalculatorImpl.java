package mySpringAOP;

import org.springframework.stereotype.Component;

// 将实现类加入Spring的IOC容器进行管理
@Component("mathImpl") // "ArithmeticCalculator"
public class ArithmeticCalculatorImpl {

    public int add(int i, int j) {
        System.out.println(i+" + "+ j +" = " + (i+j));
        return i+j;
    }
}
