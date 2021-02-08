package com.example.dp.Prototype;

public class Prototype implements Cloneable{
    private int age;
    private int sex;
    private String name;//String类型不需要深拷贝。


    public Prototype(int age,int sex,String name){
        this.age = age;
        this.sex = sex;
        this.name= name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return (this.age);
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
    public int getSex() {
        return (this.sex);
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return (this.name);
    }

    public Object clone() throws CloneNotSupportedException {
            return (Prototype)super.clone();
    }
}
