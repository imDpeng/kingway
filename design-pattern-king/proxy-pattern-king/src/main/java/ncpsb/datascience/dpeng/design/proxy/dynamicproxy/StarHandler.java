package ncpsb.datascience.dpeng.design.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHandler implements InvocationHandler {
    private Star realStar;

    public StarHandler(Star realStar) {
        this.realStar = realStar;
    }

    public StarHandler() {
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before method");
        if("sing".equals(method.getName())){
            method.invoke(realStar, args);
        }
        System.out.println("after method");


        return null;
    }
}
