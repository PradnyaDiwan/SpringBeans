package components;

import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.stereotype.Component;

@Component
public class SeniorCitizenScheme {
    private final float interest_rate = 8.0f;
    public void printSeniorCitizenInterest(long balance, long account_no, int age) {
        float interest = (balance*1*interest_rate)/100.0f;
        StandardEvaluationContext evaluationContext = new StandardEvaluationContext();
        evaluationContext.setVariable("interest",interest);
        evaluationContext.setVariable("acc_no",account_no);
        evaluationContext.setVariable("age",age);
        String exp = (String) new SpelExpressionParser()
                .parseExpression("'components.User with Account Number : ' + #acc_no + ' has age of ' + #age + ', So will get Interest of Rs. ' + #interest").getValue(evaluationContext);
        System.out.println(exp);
    }
}
