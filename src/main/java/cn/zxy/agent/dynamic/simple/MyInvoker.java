package cn.zxy.agent.dynamic.simple;

import org.omg.CORBA.portable.InvokeHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Silence 000996
 * @data 17/6/30
 */
public class MyInvoker implements InvocationHandler {
    private Hello hello;

    public MyInvoker(Hello hello) {
        this.hello = hello;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(hello,args);
    }
}
