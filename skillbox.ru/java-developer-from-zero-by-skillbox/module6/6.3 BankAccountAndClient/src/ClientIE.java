public class ClientIE extends Client {
    public ClientIE( String name, float money) {
        super( name, money );
    }
    @Override
    public void deposit( float moneyBeforeCommission ) {
        System.out.print( "Внесено к зачислению: " + moneyBeforeCommission );

        float commission;
        if ( moneyBeforeCommission < COMMISSION_MONEY_TRASHOLD ) {
            commission = moneyBeforeCommission * COMMISSION_MONEY_BEFORE_TRASHOLD;
        } else {
            commission = moneyBeforeCommission * COMMISSION_MONEY_AFTER_TRASHOLD;
        }

        float moneyAfterCommission = moneyBeforeCommission - commission;
        System.out.println( "; Комиссия: " + ( commission ) + "; Будет зачислено: " + moneyAfterCommission );

        super.deposit( moneyAfterCommission );
    }
}
