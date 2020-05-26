package com.liu.flyweight;

import java.util.HashMap;

/**
 * @author shidacaizi
 * @date 2020/5/26 13:42
 */
//网站工厂类
public class WebSiteFactory {
    //集合 充当池的作用
    private HashMap<String, ConcreteWebSite> pool = new HashMap<>();

    //根据网站的类型，返回一个网站，如果没有就创建一个网站
    public WebSite getWebSite(String type){
        if (!pool.containsKey(type)){
            //没有就创建一个并放入池中
            pool.put(type, new ConcreteWebSite(type));
        }
        return (WebSite)pool.get(type);
    }

    //获取池中网站分类的总数(池中有多少个网站类型)
    public int getWebSiteCount(){
        return pool.size();

    }
}
