package ProxyTest.JDKDynamicProxy;

public class DaGuanRenTest {
    public static void main(String args[])
    {
        PanTest kindWomen = WangPoTest.createProxy();
        kindWomen.makeEyesWithMan(); // 没有实现代理接口   出现错误
    }
}
/*
* Exception in thread "main" java.lang.ClassCastException: com.sun.proxy.$Proxy0 cannot be cast to ProxyTest.JDKDynamicProxy.PanTest
	at ProxyTest.JDKDynamicProxy.WangPoTest.createProxy(WangPoTest.java:39)
	at ProxyTest.JDKDynamicProxy.DaGuanRenTest.main(DaGuanRenTest.java:6)
* */