package finances;

public class Account {
    private int score;
    private int expence;
    private int income;
    private String name;

    public Account(int score, int expence, int income, String name){
        this.expence = expence;
        this.score = score;
        this.income = income;
        this.name = name;
    }

    public int getExpence() {
        return expence;
    }

    public int getIncome() {
        return income;
    }

    public int getScore() {
        return score;
    }

    public void setExpence(int expence) {
        this.expence = expence;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Счёт: " + name + " | " +
                "Баланс " + score;
    }
}
