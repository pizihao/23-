package com.liu.state;

/**
 * @author shidacaizi
 * @date 2020/6/1 14:59
 */
//这里是一个抽象类，也可以是一个接口
//
public abstract class State {
//    扣除积分
    public abstract void deductMoney();
//    是否抽中奖品
    public abstract boolean raffle();
//    发放奖品
    public abstract void dispensePrize();
}
