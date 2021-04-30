package ProxyTest.JDKDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKWangPoHandler  implements InvocationHandler {

    private JDKKindWomen kindWomen;

    public  JDKWangPoHandler(){
        kindWomen = new JDKJLPan();
    }

    public  JDKWangPoHandler(JDKKindWomen kindWomen){
        this.kindWomen = kindWomen;
    }

    /**
     *  这个方法不会被我们显示的去调用
     *
     * 第一个参数就是 代理者，如果你想对代理者做一些操作可以使用这个参数；
     * 第二个就是 被执行的方法，
     * 第三个是 执行该方法所需的参数。
     * */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(">>>>>>before method.invoke(), 这里代表代理对象在主业务逻辑方法执行前织入的代码");
        method.invoke(kindWomen, args);
        System.out.println(">>>>>>>after method.invoke()，这里代表代理对象在主业务逻辑方法执行后织入的代码");
        return null;
    }

    // 自定义一个构建代理对象的方法
    public static JDKKindWomen createProxy()
    {
        JDKJLPan jlPan = new JDKJLPan();
        JDKWangPoHandler wangPoHandler = new JDKWangPoHandler(jlPan);
        return (JDKKindWomen) Proxy.newProxyInstance(
                JDKJLPan.class.getClassLoader(), // jlPan.getClass().getClassLoader(),//
                JDKJLPan.class.getInterfaces(), //jlPan.getClass().getInterfaces(),
                wangPoHandler
        );
    }
}
