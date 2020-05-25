package com.liu.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shidacaizi
 * @date 2020/5/25 17:14
 */
public class College extends OrganizationComponent {

    //这个list中存放的是Department
    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    //构造器
    public College(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    //输出University包含的学院
    @Override
    protected void print() {
        System.out.println("=== "+ getName() +" ===");
        //遍历organizationComponents
        organizationComponents.forEach(OrganizationComponent::print);
    }
}
