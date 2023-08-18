package baitap1;

import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) {
        ListConstructor newClass = new ListConstructor();
        Constructor<?>[] constructors = newClass.getClass().getConstructors();
        System.out.println("list Constructor: ");
        for (Constructor constructor : constructors
        ) {
            System.out.println(constructor.getName());
        }
    }

}
