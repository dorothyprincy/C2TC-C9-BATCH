package annotations;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation{
int value();
}

//Applying annotation

public class Hello {
	@MyAnnotation(value=10)
	public void sayHello(){System.out.println("hello annotation");
	}
	

}
