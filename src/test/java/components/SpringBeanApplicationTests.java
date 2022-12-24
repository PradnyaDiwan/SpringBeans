package components;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;
@SpringBootTest
class SpringBeanApplicationTests {
	@Autowired
	private NormalCitizenScheme normalCitizenSchemeObject;
	@Autowired
	private SeniorCitizenScheme seniorCitizenSchemeObject;
	@Test
	void itShouldCheckIfAgeIsBelow60AndBalanceIs50000ThanInterestIs2000() {
		User userObject = new User(26980, "Ramesh", 59, 50000);
		if (userObject.getAge() <= 60) {
			double expected = 2000;
			double actual = normalCitizenSchemeObject.printNormalCitizenInterest(userObject.getBalance(), userObject.getAccount_no(), userObject.getAge());
			assertThat(actual).isEqualTo(expected);
		}


	}
	@Test
	void itShouldCheckIfAgeIsBelow60AndBalanceIsMinus50000ThanInterestIsNot2000() {
			User userObject = new User(26980, "Ramesh", 59, -50000);
			if (userObject.getAge() <= 60) {
				double expected = 2000;
				double actual = normalCitizenSchemeObject.printNormalCitizenInterest(userObject.getBalance(), userObject.getAccount_no(), userObject.getAge());
				assertThat(actual).isNotEqualTo(expected);
			}
	}

	@Test
	void itShouldCheckIfAgeIsBelow60AndBalanceIs5000ThanInterestIsNot200(){
		User userObject=new User(26980,"Ramesh",59,-50000);
		if(userObject.getAge()<=60){
			double expected=200;
			double actual=normalCitizenSchemeObject.printNormalCitizenInterest(userObject.getBalance(),userObject.getAccount_no(),userObject.getAge());
			assertThat(actual).isNotEqualTo(expected);
		}
	}
	@Test
	void itShouldCheckIfAgeIsAbove60AndBalanceIs50000ThanInterestIs4000() {
		User userObject = new User(26980, "Ramesh", 59, 50000);
		if (userObject.getAge() >= 60) {
			double expected = 4000;
			double actual = seniorCitizenSchemeObject.printSeniorCitizenInterest(userObject.getBalance(), userObject.getAccount_no(), userObject.getAge());
			assertThat(actual).isEqualTo(expected);
		}


	}
	@Test
	void itShouldCheckIfAgeIsAbove60AndBalanceIsMinus50000ThanInterestIsNot2000() {
		User userObject = new User(26980, "Ramesh", 59, -50000);
		if (userObject.getAge() >= 60) {
			double expected = 2000;
			double actual =  seniorCitizenSchemeObject.printSeniorCitizenInterest(userObject.getBalance(), userObject.getAccount_no(), userObject.getAge());
			assertThat(actual).isNotEqualTo(expected);
		}
	}

	@Test
	void itShouldCheckIfAgeIsAbove60AndBalanceIs5000ThanInterestIsNot400(){
		User userObject=new User(26980,"Ramesh",59,-50000);
		if(userObject.getAge()>=60){
			double expected=400;
			double actual= seniorCitizenSchemeObject.printSeniorCitizenInterest(userObject.getBalance(),userObject.getAccount_no(),userObject.getAge());
			assertThat(actual).isNotEqualTo(expected);
		}
	}
	@Test
	void contextLoads() {
	}
}
