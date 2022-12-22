package components;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SpringBeanApplication {

	public static void main(String[] args) {
		//SpringApplication.run(components.SpringBeanApplication.class, args);
		ApplicationContext context = SpringApplication.run(SpringBeanApplication.class, args);
		User user = context.getBean(components.User.class);
		user.setAccount_no(26980);
		user.setName("Ramesh");
		user.setAge(66);
		user.setBalance(50000);

		if(user.getAge() >= 60) {
			components.SeniorCitizenScheme seniorCitizen = context.getBean(components.SeniorCitizenScheme.class);
			seniorCitizen.printSeniorCitizenInterest(user.getBalance(), user.getAccount_no(), user.getAge());
		}
		else {
			components.NormalCitizenScheme normalCitizen = context.getBean(components.NormalCitizenScheme.class);
			normalCitizen.printNormalCitizenInterest(user.getBalance(), user.getAccount_no(), user.getAge());
		}

	}

}
