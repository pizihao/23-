package com.liu.prototype.deepclone;

import java.io.*;

/**
 * @author shidacaizi
 * @date 2020/5/20 14:24
 */
public class DeepProtoType implements Serializable, Cloneable {
    //String类型
    public String name;
    //引用类型
    public DeepCloneableTarget deepCloneableTarget;
    //深拷贝 - 方式一 clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        //这里是对基本数据类型和字符串的克隆
        deep = super.clone();
        //引用类型变多后会很麻烦
        //需要对引用类型的属性进行单独处理
        DeepProtoType deepProtoType = (DeepProtoType) deep;
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
        return deepProtoType;
    }
    //深拷贝 - 方式2 通过对象的序列化实现 （推荐）
    public Object deepClone(){
        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            //当前这个流对象以对象流的方式输出
            oos.writeObject(this);
            
            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);

            return (DeepProtoType) ois.readObject();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            //关闭流
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
