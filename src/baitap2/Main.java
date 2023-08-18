package baitap2;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) {
        MethodStatic methodStatic = new MethodStatic();
        Method[] method = methodStatic.getClass().getMethods();
        System.out.println("static method: ");
        for (Method methods : method
        ) {

            System.out.println("- " + methods.getName() + " la phuong thuc static dung khong : " + Modifier.isStatic(methods.getModifiers()));
        }
    }
}
