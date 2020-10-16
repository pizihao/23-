package com.liu.state;

import java.util.Random;

/**
 * @author shidacaizi
 * @date 2020/6/1 14:57
 */
//可以抽奖的状态
public class CanRaffleState extends State {
    RaffleActivity raffleActivity;

    public CanRaffleState(RaffleActivity raffleActivity){
        this.raffleActivity = raffleActivity;
    }

    @Override
    public void deductMoney(){
        System.out.println("已经扣过积分");
    }

    @Override
    public boolean raffle(){
        System.out.println("正在抽奖，请稍等");
        Random random = new Random();
        int num = random.nextInt(10);
        //10%的中奖机会
        if (num == 0){
            //改变活动状态为发放奖品
            raffleActivity.setState(raffleActivity.getDispenseState());
            return true;
        }else {
            System.out.println("很遗憾没有抽中奖");
            //修改状态为不能抽奖
            raffleActivity.setState(raffleActivity.getNoRaffleState());
            return false;
        }
    }

    @Override
    public void dispensePrize() {
        System.out.println("没中奖，不能发放奖品");
    }
}
