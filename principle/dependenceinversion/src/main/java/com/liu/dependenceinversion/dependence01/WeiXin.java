package com.liu.dependenceinversion.dependence01;

/**
 * @author shidacaizi
 * @date 2020/5/12 22:01
 */
public class WeiXin implements IReceiver {
    @Override
    public String getInfo() {
        return "微信消息---Hellowould";
    }
}
