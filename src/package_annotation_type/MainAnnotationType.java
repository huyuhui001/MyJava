/*
 * it's to practice annotation type with TYPE
 */
package package_annotation_type;

import java.lang.annotation.*;
import java.lang.reflect.*;

//import package_annotation_method.MyAnnotation;
//import package_annotation_method.Name;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)

//Declaring annotation
@interface MyAnnotation{
	String value();
}

//Initializing annotation
@MyAnnotation(value="James")
class Name{
	public void getName(){
		System.out.println("Annotation type METHOD");
	}
}

//Accessing annotation
class MainAnnotationType{
	public static void main(String args[]) throws Exception {
		Name myName = new Name();
		Method myMethod = myName.getClass().getMethod("getName");

		MyAnnotation ma = myMethod.getAnnotation(MyAnnotation.class);
		System.out.println("name is: "+ ma.value());
		myName.getName();
	}
}