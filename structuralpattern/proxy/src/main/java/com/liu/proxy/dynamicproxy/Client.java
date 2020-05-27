package com.liu.proxy.dynamicproxy;

/**
 * @author shidacaizi
 * @date 2020/5/26 19:14
 */
public class Client {
    public static void main(String[] args) {
       //创建目标对象
        ITeacherDao target = new TeacherDao();
        //给目标对象创建代理对象 可以转成ITeacherDao
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();
        System.out.println("proxyInstance:" + proxyInstance);
    }
}
