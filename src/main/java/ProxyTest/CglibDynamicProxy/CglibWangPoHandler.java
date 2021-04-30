package ProxyTest.CglibDynamicProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibWangPoHandler implements MethodInterceptor {
    /**
     *
     * @param o cglib生成的代理对象
     * @param method 被代理对象的方法
     * @param objects     传入方法的参数
     * @param methodProxy 代理的方法
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println(">>>>>>before method.invoke(), 这里代表代理对象在主业务逻辑方法执行前织入的代码");
        Object obj = methodProxy.invokeSuper(o, objects);
        System.out.println(">>>>>>>after method.invoke()，这里代表代理对象在主业务逻辑方法执行后织入的代码");
        return obj;
    }

    public static CglibJLPan createProxy()
    {
        Enhancer enhancer = new Enhancer();             // 通过CGLIB动态代理获取代理对象的过程
        enhancer.setSuperclass(CglibJLPan.class);       // 设置需要处理的对象父类
        enhancer.setCallback(new CglibWangPoHandler()); // 设置enhancer回调对象
        return (CglibJLPan) enhancer.create();          // 创建并且返回代理对象
    }

    public static CglibOtherGirls createProxy2()
    {
        Enhancer enhancer = new Enhancer();             // 通过CGLIB动态代理获取代理对象的过程
        enhancer.setSuperclass(CglibOtherGirls.class);       // 设置需要处理的对象父类
        enhancer.setCallback(new CglibWangPoHandler()); // 设置enhancer回调对象
        return (CglibOtherGirls) enhancer.create();          // 创建并且返回代理对象
    }
}
