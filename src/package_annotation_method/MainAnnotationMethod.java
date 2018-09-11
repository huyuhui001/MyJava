/*
 * it's to practice annotation type with METHOD
 */

package package_annotation_method;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

//Declaring annotation
@interface MyAnnotation{
	String value();
}

//Initializing annotation
class Name{
	@MyAnnotation(value="James")
	
	public void getName(){
		System.out.println("Annotation type METHOD");
	}
}

//Accessing annotation
class MainAnnotationMethod{
	public static void main(String args[]) throws Exception {
		Name myName = new Name();
		Method myMethod = myName.getClass().getMethod("getName");

		MyAnnotation ma = myMethod.getAnnotation(MyAnnotation.class);
		System.out.println("name is: "+ ma.value());
		myName.getName();
	}
}
