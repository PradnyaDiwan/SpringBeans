package components;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import java.util.Scanner;

@SpringBootApplication
public class SpringBeanApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBeanApplication.class, args);
		User user = context.getBean(components.User.class);
		Scanner scannerObject=new Scanner(System.in);
		System.out.println("Enter the Account No");
		int accountNo=scannerObject.nextInt();
		user.setAccount_no(accountNo);
		System.out.println("Enter the account holder name");
		String name=scannerObject.next();
		user.setName(name);
		System.out.println("Enter the Age of acoount holder");
		int age=scannerObject.nextInt();
		user.setAge(age);
		System.out.println("Enter the Balaance of above account holder");
		long balance=scannerObject.nextLong();
		user.setBalance(balance);
		if(user.getAge() >= 60) {
			components.SeniorCitizenScheme seniorCitizen = context.getBean(components.SeniorCitizenScheme.class);
			double interest=seniorCitizen.printSeniorCitizenInterest(user.getBalance(), user.getAccount_no(), user.getAge());
		}
		else {
			components.NormalCitizenScheme normalCitizen = context.getBean(components.NormalCitizenScheme.class);
			double interest=normalCitizen.printNormalCitizenInterest(user.getBalance(), user.getAccount_no(), user.getAge());
		}
	}
}
