package com.liu.proxy.staticproxy;

/**
 * @author shidacaizi
 * @date 2020/5/26 17:01
 */
//代理对象，静态代理
public class TeacherDaoProxy implements ITeacherDao{

    //目标对象
    private ITeacherDao iTeacherDao;

    //构造器
    public TeacherDaoProxy(ITeacherDao iTeacherDao) {
        this.iTeacherDao = iTeacherDao;
    }

    @Override
    public void teach() {
        System.out.println("代理开始");

        iTeacherDao.teach();

        System.out.println("提交。代理结束");
    }
}
