package com.example.dp.Prototype;

public class main {
    //原型模式
    public static void main(String[] args)throws CloneNotSupportedException {
        Prototype p1=new Prototype(12,1,"张三");
        Prototype p2=(Prototype)p1.clone();
        p1.setName("hahahahahahahahaha");
        System.out.println(p1.getName()==p2.getName());
    }
}
