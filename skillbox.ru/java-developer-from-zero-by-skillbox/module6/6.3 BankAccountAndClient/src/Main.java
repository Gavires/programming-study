import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Client clientPrivate = new ClientPrivate("Петр Петров Петрович", 15000f );
        System.out.println( "====================\nФизическое лицо " + clientPrivate.getName() +"\n====================" );
        System.out.println( "Вывод денег" );
        clientPrivate.withdrawal( 500f );
        System.out.println( "Пополнение счета" );
        clientPrivate.deposit( 1000f );
        System.out.println( "Показать баланс");
        clientPrivate.showBalance();

        Client clientLegal = new ClientLegal("ООО 'Пирожки продакшн'", 200000f );
        System.out.println( "====================\nЮридическое лицо " + clientLegal.getName() +"\n====================" );
        System.out.println( "Вывод денег" );
        clientLegal.withdrawal( 50000f );
        System.out.println( "Пополнение счета" );
        clientLegal.deposit( 10000f );
        System.out.println( "Показать баланс");
        clientLegal.showBalance();

        Client clientIE = new ClientIE("Иванов И.А", 50000f );
        System.out.println( "====================\nИП " + clientIE.getName() +"\n====================" );
        System.out.println( "Пополнение счета" );
        clientIE.deposit( 1500f );
        clientIE.deposit( 900f );
        System.out.println( "Вывод денег" );
        clientIE.withdrawal( 15000 );

        System.out.println( "Показать баланс");
        clientIE.showBalance();

        System.out.println( "====================\nТест метода transferFunds()\n====================" );
        clientLegal.transferFunds( clientPrivate, 1000000f);
        clientLegal.transferFunds( clientPrivate, 1000f);
        clientLegal.transferFunds( clientPrivate, 100f);
    }
}
