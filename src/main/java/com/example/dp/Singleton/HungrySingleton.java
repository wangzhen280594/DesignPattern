package com.example.dp.Singleton;

//饿汉式单例模式：类创建好的时候就创建一个静态的对象供系统使用，线程安全。
public class HungrySingleton {
    private static final  HungrySingleton singleton=new HungrySingleton();

    private HungrySingleton(){};

    public void run(){
        System.out.println("饿汉式单例模式运行");
    }

    public static HungrySingleton getSingleton(){
        return singleton;
    }

}
