package com.liu.dependency.clsss;

/**
 * @author shidacaizi
 * @date 2020/5/13 19:29
 */
public class PersonServiceBean extends PersonDao {
    private PersonDao personDao; //类
    public void save(Person person){

    };
    public IdCard getDCard(Integer personid){
        return null;
    }
    public void modify(){
        Dependency dependency = new Dependency();
    }
}
