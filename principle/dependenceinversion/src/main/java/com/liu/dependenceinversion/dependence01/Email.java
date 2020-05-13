package com.liu.dependenceinversion.dependence01;

/**
 * @author shidacaizi
 * @date 2020/5/12 21:38
 */
public class Email implements IReceiver {
    public String getInfo(){
        return "电子邮件信息：hello,world";
    }
}
