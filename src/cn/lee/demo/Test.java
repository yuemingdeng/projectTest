package cn.lee.demo;

import com.test.o2.Student;

import java.io.*;

public class Test{

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student = new Student("ming",20,"femal");
        FileOutputStream fileOutputStream = new FileOutputStream("E:\\001.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(student);

        objectOutputStream.flush();
        objectOutputStream.close();
//        getBy16();

        student.setName("haha");

       FileInputStream fileInputStream  = new FileInputStream("E:\\001.txt");
       ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream) ;
       Student student1 = (Student) objectInputStream.readObject();

        System.out.println(student1.getName());
        System.out.println(student1.getAge());
        System.out.println(student1.getSex());

    }

    public static void getBy16() throws IOException {
        //字节byte读取
        FileInputStream fis = new FileInputStream("E:\\001.txt");
        //将文件数据读取到字节数组byte中,数组大小由fis的可读大小决定
        byte[] bytes = new byte[fis.available()];
        while( fis.read(bytes) != -1){
        }
        //确定十六进制的书写方式
        String HEX = "0123456789ABCDEF";
        //将字节转化为十六进制
        for(byte b:bytes){
            //取字节的高四位,与0x0f与运算,得到该十六进制数据对应的索引(0~15)
            System.out.print(HEX.charAt((b >> 4) & 0x0f));
            //字节的低四位
            System.out.print(HEX.charAt(b & 0x0f));
            System.out.print(" ");//AC ED ......
        }
        fis.close();
    }


}
