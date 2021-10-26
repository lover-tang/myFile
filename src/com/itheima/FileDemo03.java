package com.itheima;

import java.io.File;
import java.io.IOException;

public class FileDemo03{
    public static void main(String[] args) throws IOException {
//        File f1 = new File("D:\\StudyData\\IDEA\\itcast");
        File f1 = new File("java.txt");
//        System.out.println(f1.createNewFile());
//        File f = new File("myFile.iml");
//        System.out.println(f.isFile());

        System.out.println(f1.delete());
        System.out.println("-----------------");

        File f2 = new File("itcast");
//        System.out.println(f2.mkdir());

        System.out.println(f2.delete());
        System.out.println("-----------------");

        File f3 = new File("itcast");
//        System.out.println(f3.mkdir());
        File f4 = new File("itcast\\java.txt");
//        System.out.println(f4.createNewFile());


        System.out.println(f4.delete());
        System.out.println(f3.delete());



    }
}