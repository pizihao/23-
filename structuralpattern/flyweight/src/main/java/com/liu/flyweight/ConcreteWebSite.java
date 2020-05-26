package com.liu.flyweight;

/**
 * @author shidacaizi
 * @date 2020/5/26 12:02
 */
//具体的网站
public class ConcreteWebSite extends WebSite {

    private String type = "";

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use() {
        System.out.println("网站的发布形式为：" + type);
    }
}
