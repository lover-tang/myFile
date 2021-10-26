package com.itheima;

import java.io.File;
import java.io.IOException;

public class FileDemo02 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\StudyData\\IDEA\\itcast\\java.txt");
        System.out.println(f1.createNewFile());
        System.out.println("----------------");

        File f2 = new File("D:\\StudyData\\IDEA\\itcast\\JavaSE");
        System.out.println(f2.mkdir());
        System.out.println("----------------");

        File f3 = new File("D:\\StudyData\\IDEA\\itcast\\JavaWEB\\HTML");
//        System.out.println(f3.mkdir());
        System.out.println(f3.mkdirs());
        System.out.println("----------------");

        File f4 = new File("D:\\StudyData\\IDEA\\itcast\\Javase.txt");
//        System.out.println(f4.mkdir());
        System.out.println(f4.createNewFile());
    }

}
