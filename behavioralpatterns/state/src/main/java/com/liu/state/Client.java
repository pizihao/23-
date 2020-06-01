package com.liu.state;

/**
 * @author shidacaizi
 * @date 2020/6/1 14:57
 */
public class Client {
    public static void main(String[] args) {
        //创建活动对象 奖池有5个奖品
        RaffleActivity activity = new RaffleActivity(1);

        //连续抽奖3次
        for (int i = 0; i < 10; i++){
            System.out.println("====第" + (i+1) + "次抽奖====");
            //参加抽奖 第一步点击扣除积分
            activity.debuctMoney();
            //第二次抽奖
            activity.raffle();
        }
    }
}
