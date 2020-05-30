package com.liu.Iterator;

import java.util.ArrayList;

/**
 * @author shidacaizi
 * @date 2020/5/30 15:16
 */
public class Client {
    public static void main(String[] args) {
        //创建学院
        ArrayList<College> colleges = new ArrayList<>();
        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();

        colleges.add(computerCollege);
        colleges.add(infoCollege);

        OutPutImpl outPut = new OutPutImpl(colleges);
        outPut.printCollege();
    }
}
