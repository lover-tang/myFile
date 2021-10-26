package com.itheima;


import java.io.File;

public class FileDemo04 {
    public static void main(String[] args) {
//        File f1 = new File("D:\\StudyData\\IDEA\\itcast\\java.txt");
        File f = new File("myFile\\java.txt");

        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
        System.out.println(f.exists());

        System.out.println(f.getAbsolutePath());
        System.out.println(f.getPath());
        System.out.println(f.getName());
        System.out.println("----------------------");

        File f2 = new File("D:\\StudyData\\IDEA\\itcast");

        String[] strArray = f2.list();
        for(String str : strArray){
            System.out.println(str);
        }

        System.out.println("-----------------------");

        File[] fileArray = f2.listFiles();
        for(File file : fileArray){
//            System.out.println(file);
//            System.out.println(file.getName());
            if(file.isFile()){
                System.out.println(file.getName());
            }
        }

    }
}

