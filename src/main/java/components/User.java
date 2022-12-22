package components;

import org.springframework.stereotype.Component;

@Component
public class User {
    private long account_no;
    private String name;
    private int age;
    private long balance;

    public User() {
    }

    public User(long account_no, String name, int age, long balance) {
        this.account_no = account_no;
        this.name = name;
        this.age = age;
        this.balance = balance;
    }

    public long getAccount_no() {
        return account_no;
    }

    public void setAccount_no(long account_no) {
        this.account_no = account_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
}
