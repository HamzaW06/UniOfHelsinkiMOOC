
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        this.money = 1000.0;
    }

    public double eatAffordably(double payment) {
        if (payment >= 2.5){
            this.money += 2.5;
            affordableMeals ++;
            return payment - 2.5;
        }else{
            return payment;
        }

    }

    public double eatHeartily(double payment) {
        if (payment >= 4.30){
            this.money += 4.3;
            heartyMeals ++;
            return payment - 4.3;
        }else{
            return payment;
        }
    }
    public boolean eatAffordably(PaymentCard card){
        if (card.balance() >= 2.50){
            card.takeMoney(2.5);
            affordableMeals ++;
            return true;
        }
        return false;
    }

    public boolean eatHeartily(PaymentCard card){
        if (card.balance() >= 4.30){
            card.takeMoney(4.30);
            heartyMeals ++;
            return true;
        }
        return false;
    }
    public void addMoneyToCard(PaymentCard card, double sum){
        if (sum > 0){
            card.addMoney(sum);
            this.money += sum;
        }

    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
