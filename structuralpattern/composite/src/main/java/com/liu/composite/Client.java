package com.liu.composite;

/**
 * @author shidacaizi
 * @date 2020/5/25 17:19
 */
public class Client {
    public static void main(String[] args) {
        //从大到小创建对象
        //学校
        OrganizationComponent university = new University("清华大学","中国大学");
        //创建学院
        OrganizationComponent computerCollege = new College("计算机学院", "最牛的学院");
        OrganizationComponent infoEngineerCollege = new College("信息工程学院", "一般的学院");
        //创建各个学院下的专业
        computerCollege.add(new Department("软件工程","软件工程"));
        computerCollege.add(new Department("网络工程","网络工程"));
        computerCollege.add(new Department("计算机科学与技术","计算机科学与技术"));

        infoEngineerCollege.add(new Department("通信工程","通信工程"));
        infoEngineerCollege.add(new Department("信息工程","信息工程"));

        //将两个学院加入到学校
        university.add(computerCollege);
        university.add(infoEngineerCollege);

        university.print();

    }
}
