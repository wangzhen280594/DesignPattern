package com.example.dp.Builder;

public class main {
    //建造者模式
    public static void main(String[] args) {
        AbstractBuilder ab=new ConcreteBuilder();
        ab.createPart1();
        ab.createPart2();
        ab.createPart3();
        ab.show().show();
    }
}
