package com.liu.template;

/**
 * @author shidacaizi
 * @date 2020/5/28 12:37
 */
public abstract class SoyaMilk {
    //模板方法，make，模板方法可以做成final 不让子类去覆盖
    final void make(){
        select();
        customerWantCondiments();
        addCondimerts();
        soak();
        beat();
    }
    //选材料
    void select(){
        System.out.println("第一步选择好新鲜的黄豆");
    }
    //添加不同的配料 抽象方法
    abstract void addCondimerts();
    //浸泡
    void soak(){
        System.out.println("第三布，黄豆和配料开始浸泡需要三小时");
    }
    void beat(){
        System.out.println("第四步，黄豆和配料放到豆浆机里去了");
    }
    //钩子方法，决定是否需要添加配料
    boolean customerWantCondiments(){
        return true;
    }
}
