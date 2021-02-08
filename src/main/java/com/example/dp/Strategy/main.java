package com.example.dp.Strategy;

public class main {
    //策略模式
    public static void main(String[] args) {
        StrategyPattern.excute e=new StrategyPattern.excute();
        StrategyPattern.Strategy strategy=new StrategyPattern.Strategy2();
        e.setStrategy(strategy);
        e.excute();
    }
}
