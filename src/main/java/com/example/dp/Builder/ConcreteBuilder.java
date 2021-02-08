package com.example.dp.Builder;

public class ConcreteBuilder extends AbstractBuilder{
    @Override
    public void createPart1() {
        product.setPart1("制造第一部分完成");
    }

    @Override
    public void createPart2() {
        product.setPart2("制造第二部分完成");
    }

    @Override
    public void createPart3() {
        product.setPart3("制造第三部分完成");
    }
}
