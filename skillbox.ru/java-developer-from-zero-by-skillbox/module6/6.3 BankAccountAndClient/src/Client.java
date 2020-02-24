import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Client {
    private BankAccount account;
    protected String name;
    protected static final float COMMISSION_MONEY_TRASHOLD = 1000f;
    protected static final float COMMISSION_MONEY_BEFORE_TRASHOLD = 0.01f;
    protected static final float COMMISSION_MONEY_AFTER_TRASHOLD = 0.005f;

    public Client( String name, float money ) {
        this.name = name;
        this.account = new BankAccount( money );
    }

    public String getName(){
        return name;
    }
    public void deposit( float money ) {
        account.depositMoney(money);
    }
    public boolean withdrawal( float money ) {
        return account.withdrawMoney( money );
    }
    public void showBalance(){
        account.showMoney();
    }

    public boolean transferFunds( Client clientTo, float money ) {
        System.out.println( "Запрос на перевод денег от: " + name + " на счет " + clientTo.getName() + "; сумма: " + money );
        if ( withdrawal( money )) {
            clientTo.deposit( money );
            System.out.println( "Перевод денег прошел успешно!");
            return true;
        }
        return false;
    }
}
