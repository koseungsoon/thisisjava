package exam05;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//이 어노테이션을 어디(Method)에 사용할 것인가(대상, target)
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME) // 자바에서 컴파일 하는 과정(소스-컴파일-클래스파일-실행-)
public @interface PrintAnnotation {

	//요소 (element) : 속성명(value)과 속성값("-") 
	String value() default "-";
	
	int name() default 15;
	
}
