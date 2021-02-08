package com.example.dp.Singleton;

//懒汉式双重检查锁单例模式
public class DCLSingleton {
   private static volatile DCLSingleton singleton=null;

   private DCLSingleton(){};


   public void run(){
       System.out.println("懒汉式双重检查锁单例模式运行");
   }


   public static DCLSingleton getSingleton(){
    if(singleton==null){
        synchronized (DCLSingleton.class){
            if(singleton==null){
                singleton=new DCLSingleton();
            }
        }
    }
    return singleton;
   };




}
