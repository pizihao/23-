package com.liu.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * @author shidacaizi
 * @date 2020/5/27 10:40
 */
public class ProxyFactory {
    //维护目标对象，Object
    private Object target;

    //构建构造器时对target进行初始化
    public ProxyFactory(Object target) {
        this.target = target;
    }
    //给目标对象生成代理对象
    /**
     * ClassLoader loader : 指定当前目标对象使用的类加载器，获取加载器的方法固定
     * Class<?> interfaces : 目标对象实现的接口类型，使用泛型方法确认类型
     * InvocationHandler h : 事件处理，执行目标对象的方法时，会触发事件处理器的方法，会把当前执行目标对象方法传入
     * @Param: []
     * @return: java.lang.Object
     * @Author: shidacaizi
     * @Date: 2020/5/27
     */
    public Object getProxyInstance() {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("JDK代理开始");
                    return method.invoke(target, args);
                });
    }
}
