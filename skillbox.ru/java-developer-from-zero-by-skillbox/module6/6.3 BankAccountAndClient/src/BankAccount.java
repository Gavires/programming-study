import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BankAccount
{
    private LocalDateTime registrationDate;
    private LocalDateTime transactionDate;
    private final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("E, dd.MM.yyyy HH:mm");

    protected long paymentAccount;
    protected float money;

    public BankAccount( float money ){
        this.money = money;
        paymentAccount = 1000000000l + (long) ( Math.random() * 9000000000l );
        registrationDate = LocalDateTime.now();
    }

    public void depositMoney( float money ){
        this.money += money;
        System.out.println("Внесено: " + money + "\nДенег на счете: " + this.money + "\nДата операции: " + transactionDate.now().format(DATE_FORMAT));

    }

    public boolean withdrawMoney( float money ) {
        if ( this.money >= money ) {
            this.money -= money;
            System.out.println("Денег выводено: " + money + "\nДата операции: " + transactionDate.now().format(DATE_FORMAT));
            return true;
        } else {
            System.out.println("Недостаточно средств для совершения транзакции!");
            return false;
        }
    }

    public void showMoney() {
        System.out.println( "Денег на счете: " + this.money );
    }
}
