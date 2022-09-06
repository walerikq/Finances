package finances.Personality;

public class Male extends Person {

    private int income;
    private int expense;
    private boolean sex;

    public Male(int income, int expense){
        super(expense,income,true);

    }

    @Override
    public void spendingMoney() {

    }
}
