package com.liu.composite;

/**
 * @author shidacaizi
 * @date 2020/5/24 22:03
 */
public abstract class OrganizationComponent {
    private String name; //名字
    private String des; //说明

    protected void add(OrganizationComponent organizationComponent){
        //默认实现
        //抛出不支持操作的异常
        throw new UnsupportedOperationException();
    }

   protected void remove(OrganizationComponent organizationComponent){
        //默认实现
       throw new UnsupportedOperationException();
   }

    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    //子类都需要实现
    protected abstract void print();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
