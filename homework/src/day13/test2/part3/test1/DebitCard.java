package day13.test2.part3.test1;

public class DebitCard {
    private String accountNumber;
    private int money;

    public DebitCard() {
    }

    public DebitCard(String accountNumber, int money) {
        setAccountNumber(accountNumber);
        setMoney(money);
    }


    public void setMoney(int money) {
        if(money < 0) {
            throw new NoException("余额不能为负数");
        }
        this.money = money;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getMoney() {
        return money;
    }

}
