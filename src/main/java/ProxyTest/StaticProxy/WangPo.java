package ProxyTest.StaticProxy;

public class WangPo implements KindWomen {

    private KindWomen kindWomen;        // 被代理对象

    public WangPo()
    {
        this.kindWomen = new JLPan();
    }

    public WangPo(KindWomen kindWomen)
    {
        this.kindWomen = kindWomen;
    }

    @Override
    public void makeEyesWithMan() {
        System.out.println(">>>>>>before method.invoke(), 这里代表代理对象在主业务逻辑方法执行前织入的代码");
        kindWomen.makeEyesWithMan();
        System.out.println(">>>>>>>after method.invoke()，这里代表代理对象在主业务逻辑方法执行后织入的代码");
    }

    @Override
    public void happyWithMan() {
        kindWomen.happyWithMan();
    }
}
