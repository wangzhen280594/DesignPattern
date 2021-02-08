package com.example.dp.Decorator;

public class DecoratorPattern {
    //装饰者模式
    public static void main(String[] args) {
        Component p = new ConcreteComponent();
        //p.operation();
        System.out.println("---------------------------------");
        Component d = new ConcreteDecorator(p);
        d.operation();
    }


    interface Component {
        public void operation();
    }

    static class ConcreteComponent implements Component {

        @Override
        public void operation() {
            System.out.println("主件本体");
        }
    }

    static class Decorator implements Component {
        private Component component;

        public Decorator(Component component) {
            this.component = component;
        }

        @Override
        public void operation() {
            component.operation();
        }
    }


    static class ConcreteDecorator extends Decorator {
        public ConcreteDecorator(Component component) {
            super(component);
        }

        public void operation() {
            super.operation();
            addedFunction();
        }

        public void addedFunction() {
            System.out.println("为具体构件角色增加额外的功能addedFunction()");
        }

    }
}
