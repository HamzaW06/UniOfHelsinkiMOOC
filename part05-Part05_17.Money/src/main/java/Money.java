
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    public Money plus(Money addition){
        Money newMoney = new Money((this.euros + addition.euros), (this.cents + addition.cents));
        return newMoney;
    }
    public boolean lessThan(Money compared){
        if (this.euros > compared.euros){
            return false;
        }else if (this.euros == compared.euros){
            if (this.cents > compared.cents){
                return false;
            }
        }
        return true;

    }
    public Money minus(Money decreaser){
        Money brokeMoney = new Money(0,0);
        int m1 = (this.euros * 100) + this.cents;
        int m2 = (decreaser.euros * 100) + decreaser.cents;
        int sum = m1 - m2;
        if (sum < 0){
            return brokeMoney;
        }
        int tempEuros = sum / 100;
        int tempCents = sum % 100;
        Money newMoney = new Money(tempEuros, tempCents);
//        Money newMoney = new Money((this.euros - decreaser.euros), (this.cents - decreaser.cents));
//        Money brokeMoney = new Money(0,0);
//        return newMoney;
        return newMoney;
    }

}
