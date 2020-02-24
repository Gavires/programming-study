import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println( "Карточный счет");
        Card card = new Card(500);
        card.viewMoney();
        card.withdrawMoney(100);
        card.viewMoney();
        card.depositMoney( 1000 );
        card.viewMoney();
        card.withdrawMoney( 100 );
        System.out.println();

        System.out.println( "Депозитарный счет");
        Deposit deposit = new Deposit( 1000 );
        deposit.viewMoney();
        deposit.withdrawMoney( 100 );
        deposit.depositMoney( 100 );
        deposit.withdrawMoney( 500 );
    }
}
