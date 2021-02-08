package com.example.dp.Strategy;

import com.sun.deploy.si.SingleInstanceImpl;

public class StrategyPattern {
    interface Strategy{
        public void run();
    }

    static class Strategy1 implements Strategy{

        @Override
        public void run() {
            System.out.println("执行策略1");
        }
    }

    static class Strategy2 implements Strategy{

        @Override
        public void run() {
            System.out.println("执行策略2");
        }
    }

    static class excute{
        private Strategy strategy;

        public void setStrategy(Strategy strategy) {
             this.strategy = strategy;
         }

        public void excute(){
            strategy.run();
        }
    }




}
