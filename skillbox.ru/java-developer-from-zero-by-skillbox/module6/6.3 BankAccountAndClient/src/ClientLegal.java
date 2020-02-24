public class ClientLegal extends Client {

    public ClientLegal( String name, float money ) {
        super( name, money );
    }

    @Override
    public boolean withdrawal( float moneyBeforeCommission ) {
        System.out.print( "Запрос на вывод: " + moneyBeforeCommission );

        float commission = moneyBeforeCommission * COMMISSION_MONEY_BEFORE_TRASHOLD;
        float moneyAfterCommission = moneyBeforeCommission + commission;
        System.out.println( "; Комиссия: " + ( commission ) + "; Будет выведено: " + moneyAfterCommission );

        return super.withdrawal( moneyAfterCommission );
    }
}
