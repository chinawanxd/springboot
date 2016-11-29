package wan.excute;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import wan.javaconfig.JavaConfig;

@ComponentScan("wan.javaconfig")
public class ExcuteBean {

	/**
	 * @param args
	 */  
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=
        	new AnnotationConfigApplicationContext(JavaConfig.class);
//		UseFunctionService useFunctionService = 
//			context.getBean(UseFunctionService.class);
		JavaConfig javaConfig = 
			context.getBean(JavaConfig.class);
		//System.out.println(useFunctionService.SayHello("java config"));
		System.out.println(javaConfig.userFunctionService().SayHello("java config"));
		context.close();
	}

}
