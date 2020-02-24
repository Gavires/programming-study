public class Loader
{
    public static void main( String[] args )
    {
        int dimaAge = 98;
        int mishaAge = 99;
        int vasyaAge = 9;

        int oldest = 0;
        int youngest = 0;
        int middle = 0;

        if ( dimaAge > mishaAge ) {
            if (vasyaAge > dimaAge) {
                oldest = vasyaAge;
                middle = dimaAge;
                youngest = mishaAge;
            } else if( vasyaAge < mishaAge ) {
                oldest = dimaAge;
                middle = mishaAge;
                youngest = vasyaAge;
            } else {
                oldest = dimaAge;
                middle = vasyaAge;
                youngest = mishaAge;
            }
        } else { //dimaAge <= mishaAge
            if ( vasyaAge < dimaAge ) {
                oldest = mishaAge;
                middle = dimaAge;
                youngest = vasyaAge;
            } else if(vasyaAge > mishaAge) {
                oldest = vasyaAge;
                middle = mishaAge;
                youngest = vasyaAge;
            } else {
                oldest = mishaAge;
                middle = vasyaAge;
                youngest = dimaAge;
            }
        }

        System.out.println( "Most old: " + oldest );
        System.out.println( "Middle: " + middle );
        System.out.println ("Most young: " + youngest );
    }
}
