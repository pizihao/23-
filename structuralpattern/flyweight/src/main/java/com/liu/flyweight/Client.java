package com.liu.flyweight;

/**
 * @author shidacaizi
 * @date 2020/5/26 13:47
 */
public class Client {

    public static void main(String[] args) {
        //创建一个工厂类
        WebSiteFactory factory = new WebSiteFactory();
        //客户要一个以新闻形式发布的网站
        WebSite webSite1 = factory.getWebSite("新闻");
        WebSite webSite2 = factory.getWebSite("博客");
        WebSite webSite3 = factory.getWebSite("媒体");
        WebSite webSite4 = factory.getWebSite("书籍");
        webSite1.use();
        webSite2.use();
        webSite3.use();
        webSite4.use();

        System.out.println(factory.getWebSiteCount());
    }
}
