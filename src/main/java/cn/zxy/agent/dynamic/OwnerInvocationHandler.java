package cn.zxy.agent.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Silence 000996
 * @data 17/6/30
 */
public class OwnerInvocationHandler implements InvocationHandler {
    PersonBean personBean;

    public OwnerInvocationHandler(PersonBean personBean) {
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Exception {
        if(method.getName().startsWith("get")){
            return method.invoke(personBean,args);
        }else if(method.getName().equals("setHotOrNotRating")){
            throw new IllegalAccessException();
        }else if(method.getName().startsWith("set")){
            return method.invoke(personBean,args);
        }
        return null;
    }
}
