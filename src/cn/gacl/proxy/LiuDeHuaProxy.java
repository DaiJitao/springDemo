package cn.gacl.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by daijitao on 2018/6/19.
 */
public class LiuDeHuaProxy {
    private Person ldh = new LiuDeHua();

    public Person getProxy(){
        return (Person) Proxy.newProxyInstance(LiuDeHuaProxy.class.getClassLoader(), ldh.getClass().getInterfaces(),
                new InvocationHandler()
                {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                       if (method.getName().equals("sing")) {
                           System.out.println("我是他的经纪人，先给十万块钱唱歌！");
                           System.out.println("args: " + args[0].toString() + "   end");
                           return method.invoke(ldh, args);
                       } else if (method.getName().equals("dance")) {
                           System.out.println("我是他的经纪人，先给十万块钱跳舞！");
                           System.out.println("args: " + args[0].toString() + " end!");
                           return method.invoke(ldh, "wu");
                       }
                       return null;
                    }
                });
    }
}
