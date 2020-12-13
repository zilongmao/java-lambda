package com.idol;


/**
 * TODO:
 *
 * @Author 邻座旅客
 * Create by 湖南爱豆 on 2020/12/1 15:02
 */
public class LambdaTest03 {

    public static void main(String[] args) {
        CXK cxk = new BasketballBoy1();
        cxk.playBasketball(2D);
    }

}

class BasketballBoy1 implements CXK, Jordan {
    // 同时实现了两个有相同默认方法的接口，需要做出自己的选择
    @Override
    public void playBasketball(Double money) {
        // 调用父接口的打篮球
        Jordan.super.playBasketball(2D);
        // 可以调用父接口的静态方法
        CXK.cry();
        Jordan.cry();
    }
}

class BasketballBoy2 implements CXK {
}

interface CXK {

    /**
     * 打篮球
     * @param money 收费
     */
    default void playBasketball(Double money) {
        System.out.println( this.getClass().getSimpleName() + "： 唱跳rap篮球，music~(打响指), 收费 " + money + " 元。");
    }
    // 静态方法
    static void cry(){
        System.out.println("嘤嘤嘤!!!");
    }
}

interface Jordan {
    /**
     * 打篮球
     * @param money 收费
     */
    default void playBasketball(Double money) {
        System.out.println( this.getClass().getSimpleName() + "： 看我一手大风车~ 收费 " + money + " 元。");
    }
    // 静态方法
    static void cry(){
        System.out.println("男儿有泪不轻弹。");
    }
}
