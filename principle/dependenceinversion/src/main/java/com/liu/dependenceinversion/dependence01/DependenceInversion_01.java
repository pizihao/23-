package com.liu.dependenceinversion.dependence01;

/**
 * @author shidacaizi
 * @date 2020/5/12 21:33
 */
public class DependenceInversion_01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeiXin());
    }
}
