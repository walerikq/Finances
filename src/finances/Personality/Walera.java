package finances.Personality;

import finances.Personality.Person;

public class Walera extends Person {

    private int income;
    private int expense;
    private boolean sex;

    public Walera(int income,int expense){
        super(expense,income,true);

    }

    @Override
    public void spendingMoney() {

    }
}
