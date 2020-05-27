package com.liu.proxy.dynamicproxy;

/**
 * @author shidacaizi
 * @date 2020/5/26 17:00
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师正在授课");
    }
}
