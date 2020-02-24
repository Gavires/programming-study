public class Card extends BankAccount {
    private static final float TAX_PERCENTAGE = 0.01f;
    public Card( float money ) {
        super( money );
    }

    @Override
    public boolean withdrawMoney( float money ) {
        float tax = money * TAX_PERCENTAGE;
        float total = tax + money;
        if ( total <= this.money ){
            this.money -= total;
            System.out.println( "Снято денег: " + money + "\nКомиссия: " + tax + "\nОстаток: " + this.money );
            return true;
        } else {
            System.out.println( "Операция не выполнена! Недостаточно средств на счете");
        }
        return false;
    }
}
