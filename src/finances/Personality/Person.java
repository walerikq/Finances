package finances.Personality;

public abstract class Person {

    private int income;
    private int expense;
    private boolean sex;

    public Person(int income,int expense, boolean sex){
        this.expense = expense;
        this.income = income;
        this.sex = sex;
    }

    public abstract void spendingMoney();

}
