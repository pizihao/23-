package com.liu.facade;

/**
 * @author shidacaizi
 * @date 2020/5/26 9:15
 */
    public class TheaterLight {
        //使用单例模式，使用饿汉式
        private static TheaterLight instance = new TheaterLight();

        public static TheaterLight getInstance() {
            return instance;
        }

        public void on(){
            System.out.println("Stereo on");
        }

        public void off(){
            System.out.println("Stereo off");
        }

        public void dim(){
            System.out.println("Stereo dim");
        }

        public void bright(){
            System.out.println("Stereo bright");
        }
    }
