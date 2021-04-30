package ProxyTest.CglibDynamicProxy;

public class CglibDaGuanRen {
    public static void main(String args[])
    {
        // 创建代理对象（这个方法是自己实现的）
        CglibJLPan jlPan = CglibWangPoHandler.createProxy();
        jlPan.makeEyesWithMan();

        CglibOtherGirls otherGirls = CglibWangPoHandler.createProxy2();
        otherGirls.makeEyesWithMan();
    }
}
