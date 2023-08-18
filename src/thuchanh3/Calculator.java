package thuchanh3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Calculator {
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    public @interface DeprecatedAPI {
        String version() default "";

        String reason() default "";
    }

    public int add(int a, int b) {
        return a + b;
    }

    @DeprecatedAPI(version = "1.0", reason = "use the 'add' method instead")
    public int sum(int a, int b) {
        return a + b;
    }
}
