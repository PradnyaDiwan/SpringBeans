package components;

import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class NormalCitizenScheme {
   private final float interest_rate = 4.0f;
   public double printNormalCitizenInterest(long balance, long account_no, int age) {
       float interest = (balance*1*interest_rate)/100.0f;
       System.out.println("User with Account Number: "+ account_no+" has age"+age+" So will get Interest of Rs."+interest);
       return interest;
   }
}
