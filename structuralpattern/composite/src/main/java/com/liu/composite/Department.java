package com.liu.composite;

/**
 * @author shidacaizi
 * @date 2020/5/25 17:16
 */
public class Department extends OrganizationComponent {

    //构造器
    public Department(String name, String des) {
        super(name, des);
    }

    //add， remove 就不用写了，因为是叶子节点，不需要去管理其他单位
    @Override
    protected void print() {
        System.out.println("==="+ getName() +"===");
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }
}
