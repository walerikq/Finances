package finances.Personality;

import finances.Personality.Person;

public class Kate extends Person {

    private int income;
    private int expense;
    private boolean sex;

    public Kate(int income,int expense){
        super(expense,income, false);

    }

    @Override
    public void spendingMoney() {

    }

}
