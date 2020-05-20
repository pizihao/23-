package com.liu.prototype.deepclone;

import java.io.Serializable;

/**
 * @author shidacaizi
 * @date 2020/5/20 14:24
 */
public class DeepCloneableTarget implements Serializable, Cloneable {
    private static final long serialVersionUID = 1L;
    private String cloneName;
    private String cloneClass;

    //构造器
    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    //因为该类属性都是String，因此我们这里使用默认的clone完成即可

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
