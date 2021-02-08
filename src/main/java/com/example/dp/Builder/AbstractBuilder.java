package com.example.dp.Builder;

public abstract class AbstractBuilder {
    protected Product product=new Product();

    public abstract void createPart1();

    public abstract void createPart2();

    public abstract void createPart3();

    public Product show(){
       return product;
    }
}
