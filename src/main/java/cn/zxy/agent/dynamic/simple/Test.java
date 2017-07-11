package cn.zxy.agent.dynamic.simple;

import java.lang.reflect.Proxy;

/**
 * @author Silence 000996
 * @data 17/6/30
 */
public class Test {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Hello h = new HelloImpl();
        Hello hello = (Hello) Proxy.newProxyInstance(h.getClass().getClassLoader(),h.getClass().getInterfaces(),new MyInvoker(h));
        String content = hello.sayHello("haha");
        System.out.println(content);
    }
}
