package mySpringAOP;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component // 类上使用 @Component 注解 把切面类加入到IOC容器中
@Aspect     // 使用 @Aspect 注解 使之成为切面类
public class SpringAOPAspect {
    // 切点（连接点的集合）
    @Pointcut("execution(* mySpringAOP.*.*(..))") // 使用Execution表达式表示连接点的集合
    private void justPointCut(){}

    /** 通知：
     * ("justPointCut()") : 通知的位置（目标方法）
     * Before : 通知的时间
     * public void before{ ... } : 通知的内容
    */
    @Before("justPointCut()") //
    public void before()
    {
        System.out.println("============ Before ============");
    }

    @After("justPointCut()")
    public void after()
    {
        System.out.println("============ After  ============");
    }

    @AfterReturning("justPointCut()")
    public void afterReturning()
    {
        System.out.println("======= AfterReturning ========");
    }

    // 连接点方法执行抛出异常之后调用
    @AfterThrowing("justPointCut()")
    public void afterThrowing()
    {
        System.out.println("======= AfterThrowing ========");
    }

    /*
    *  org.springframework.aop.AopInvocationException: Null return value from advice does not match primitive return type for...
    *  环绕监听会对有返回值的方法做处理 !!!
    @Around("justPointCut()")
    public void Around()
    {
        System.out.println("============ Around ============");

    }
    */
}
