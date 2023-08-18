package thuchanh3;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        Calculator calculator = new Calculator();

        int result = calculator.add(2, 3);
        System.out.println("addition: " + result);


        if (Calculator.class.getMethod("sum", int.class, int.class).isAnnotationPresent(Calculator.DeprecatedAPI.class)) {
            System.out.println("Warning: this method is deprecated.");
            Calculator.DeprecatedAPI api = Calculator.class.getMethod("sum", int.class, int.class).getAnnotation(Calculator.DeprecatedAPI.class);
            System.out.println("Deprecated in version: " + api.version());
            System.out.println("reason: " + api.reason());
        }
    }
}
