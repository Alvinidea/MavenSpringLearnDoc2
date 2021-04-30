package ProxyTest.JDKDynamicProxy;

public class JDKDaGuanRen {
    public static void main(String args[])
    {
        JDKKindWomen kindWomen = JDKWangPoHandler.createProxy();
        kindWomen.makeEyesWithMan();
    }
}
