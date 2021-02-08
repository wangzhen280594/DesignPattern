package com.example.dp.Singleton;

public enum  EnumSingleton {
    SINGLETON;
    public EnumSingleton getSingleton(){
        return SINGLETON;
    }

public void run(){
    System.out.println("枚举单例模式运行");
}

}
