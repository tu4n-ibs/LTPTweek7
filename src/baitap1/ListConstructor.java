package baitap1;

import java.lang.reflect.Constructor;

public class ListConstructor {
    public String name;
    public int age;
    public boolean sex;

    public ListConstructor(String name, int age, boolean sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public ListConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public ListConstructor() {
    }
}
