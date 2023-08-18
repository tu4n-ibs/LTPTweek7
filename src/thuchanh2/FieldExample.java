package thuchanh2;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class FieldExample {
    public static void main(String[] args) throws IllegalAccessException {
        Class<MyClass1> clazz = MyClass1.class;

        Field[] fields = clazz.getFields();
        for (Field filed: fields
             ) {
            String filedName = filed.getName();
            System.out.println(filedName);

            Class<?> filedType = filed.getType();
            System.out.println(filedType);

            int modifiers = filed.getModifiers();
            System.out.println("Modifiers: " + Modifier.toString(modifiers));

            // Tạo đối tượng MyClass
            MyClass1 instance = new MyClass1();

            // Lấy giá trị của trường sau khi thay đổi
            Object fieldValue = filed.get(instance);
            System.out.println("Field Value: " + fieldValue);

            System.out.println();

        }
    }



    static class MyClass1{
        public String publicField = "public Field";
        private int privateFiled = 33;

        public final String finalField = "Final Field";

        public void printField(){
            System.out.println(publicField);
            System.out.println(privateFiled);
            System.out.println(finalField);
        }
    }
}
