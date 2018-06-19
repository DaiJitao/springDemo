package cn.gacl.proxy;

/**
 * Created by daijitao on 2018/6/19.
 */
public class ProxyTest {
    public static void main(String[] args) {
        LiuDeHuaProxy proxy = new LiuDeHuaProxy();
        Person p = proxy.getProxy();
        String retValue = p.sing("冰雨");
        System.out.println("retValue " + retValue);
        String dance = p.dance("迪斯科");
        System.out.println("dance " + dance);
    }
}
