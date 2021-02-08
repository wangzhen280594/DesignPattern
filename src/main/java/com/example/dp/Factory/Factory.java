package com.example.dp.Factory;

public class Factory {
    interface Product{
        public void show();
    }

    class Product1 implements Product{
        @Override
        public void show() {
            System.out.println("生产第一种产品");
        }
    }

    class Product2 implements Product{
        @Override
        public void show() {
            System.out.println("生产第二种产品");
        }
    }

    interface  AbstractProduct{
        public Product createProduct();
    }

    class ConcreteFactory1 implements AbstractProduct{
        @Override
        public Product createProduct() {
            return new Product1();
        }
    }

    class ConcreteFactory2 implements  AbstractProduct{
        @Override
        public Product createProduct() {
            return new Product2();
        }
    }
}
