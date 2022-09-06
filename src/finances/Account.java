package finances;

public class Account {
    private int score;
    private int expence;
    private int income;

    public Account(int score,int expence, int income){
        this.expence = expence;
        this.score = score;
        this.income = income;
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
        return "Счёт" +
                "score=" + score +
                ", expence=" + expence +
                ", income=" + income +
                '}';
    }
}
