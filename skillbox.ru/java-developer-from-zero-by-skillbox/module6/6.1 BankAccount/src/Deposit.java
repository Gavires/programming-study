public class Deposit extends BankAccount
{
    public Deposit( float money ) {
        super( money );
    }

    @Override
    public boolean withdrawMoney(float money ) {
        if ( currentDepositDate.isAfter( nextWithdrawDate )) {
            if (money <= this.money) {
                this.money -= money;
                System.out.println("Снято денег: " + money + "\nОстаток: " + this.money);
                return true;
            } else
                System.out.println("Операция не выполнена! Недостаточно средств на счете");
        } else
            System.out.println( "Операция не выполнена! Вы ранее внесли деньги на счет.\nСледущее списание возможно:\n" + nextWithdrawDate.plusMonths(1).format( DATE_FORMAT ) + "\nТекущая дата:\n" + currentDepositDate.format( DATE_FORMAT ) );

        return false;
    }

    @Override
    public void depositMoney( float money ){
        this.money += money;
        nextWithdrawDate.plusMonths(1);
        System.out.println( "Внесено: " + money + "\nДенег на счете: " + this.money +"\nДата операции:\n" + currentDepositDate.format( DATE_FORMAT ));
    }
}
