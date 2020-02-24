import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class BankAccount
{
    protected float money;

    protected LocalDateTime currentDepositDate = LocalDateTime.now();
    protected LocalDateTime nextWithdrawDate = LocalDateTime.now();
    protected final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("E, dd.MM.yyyy HH:mm");

    public BankAccount( float money ){
        System.out.println( currentDepositDate.format( DATE_FORMAT ));
        this.money = money;
    }

    public abstract boolean withdrawMoney( float money );

    public void viewMoney() {
        System.out.println( "Денег на счете: " + this.money );
    }

    public void depositMoney( float money ){
        this.money += money;
        System.out.println( "Внесено: " + money + "\nДенег на счете: " + this.money +"\nДата операции:\n" + currentDepositDate.format( DATE_FORMAT ));
    }
}
