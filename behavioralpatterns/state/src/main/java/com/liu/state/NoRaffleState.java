package com.liu.state;

/**
 * @author shidacaizi
 * @date 2020/6/1 14:58
 */
//不能抽奖的状态
public class NoRaffleState extends State {

    //初始化时传入活动引用，扣除积分后改变其状态
    RaffleActivity raffleActivity;

    public NoRaffleState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

//    当前状态是可以扣积分的扣除后将状态变为可以抽奖状态
    @Override
    public void deductMoney() {
        System.out.println("扣除50积分成功，你可以抽奖了");
        raffleActivity.setState(raffleActivity.getCanRaffleState());
    }

    @Override
    public boolean raffle() {
        System.out.println("扣除积分后才能抽奖");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("不能发放奖金");
    }
}
