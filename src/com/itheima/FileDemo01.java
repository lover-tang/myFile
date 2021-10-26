package com.itheima;

import java.io.File;

public class FileDemo01 {
    public static void main(String[] args) {
        File f1 = new File("D:\\StudyData\\IDEA\\itcast\\java.txt");
        System.out.println(f1);

        File f2 = new File("D:\\StudyData\\IDEA\\itcast", "java.txt");
        System.out.println(f2);

        File f3 = new File("D:\\StudyData\\IDEA\\itcast");
        File f4 = new File(f3, "java.txt");
        System.out.println(f4);

    }
}
