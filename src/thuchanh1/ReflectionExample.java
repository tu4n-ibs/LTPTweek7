package thuchanh1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) throws ClassNotFoundException {
        //        lay doi tuong Class cua MyClass
        Class<?> newClass = Class.forName("thuchanh1.JavaReflection");

//     lay ten day du cua lop
        String className = newClass.getName();
        System.out.println("Class Name: " + className);

//        lay thong tin thuoc tinh cua lop
        int modifiers = newClass.getModifiers();
        System.out.println("Modifiers: " + modifiers);

//        lay danh sach cach truong public cu lop
        Field[] fields = newClass.getFields();
        System.out.println("public Fields: ");
        for (Field field : fields) System.out.println("-" + field.getName());

//        lay danh sach cac phuong thuc public cua lop
        Method[] methods = newClass.getMethods();
        System.out.println("public method: ");
        for (Method method : methods
        ) {
            System.out.println("- " + method.getName());
        }

//        lay danh sach cac ham khoi tao public cua lop
        Constructor<?>[] constructors = newClass.getConstructors();
        System.out.println("Public Constructors:");
        for (Constructor<?> constructor : constructors) {
            System.out.println("- " + constructor.getName());
        }
    }
}
