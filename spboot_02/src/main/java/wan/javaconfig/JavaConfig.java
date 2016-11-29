package wan.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//配置类
@Configuration
public class JavaConfig {
	@Bean
	public FunctionService functionService(){
		return new FunctionService();
	}
	
	//注入functionService的bean，方式1
	public UseFunctionService userFunctionService(){
		UseFunctionService useFunctionService = new UseFunctionService();
		useFunctionService.setFunctionService(functionService());
		return useFunctionService;
	}
    
	//注入functionService的bean，方式2
//	@Bean
//	public UseFunctionService userFunctionService(FunctionService functionService){
//		UseFunctionService useFunctionService = new UseFunctionService();
//		useFunctionService.setFunctionService(functionService());
//		return useFunctionService;
//	}
	
}
