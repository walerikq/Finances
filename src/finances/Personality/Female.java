package finances.Personality;

import finances.Personality.Person;

public class Female extends Person {

    private int income;
    private int expense;

    private boolean sex;

    public Female(int income,int expense){
        super(expense,income, false);

    }

    @Override
    public void spendingMoney() {

    }

}
