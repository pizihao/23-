package com.liu.proxy.staticproxy;

/**
 * @author shidacaizi
 * @date 2020/5/26 19:14
 */
public class Client {
    public static void main(String[] args) {
        //创建目标对象
        TeacherDao teacherDao = new TeacherDao();
        //创建代理对象 同时将被代理对象传递给代理对象
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);
        //通过代理对象，调用被代理对象的方法
        //即执行的是代理对象的方法。代理对象再去执行目标对象的方法
        teacherDaoProxy.teach();

    }
}
