public class Main
{
    public static void main( String[] args )
    {
        // Массив температур пациентов
        double[] patients = new double[30];

        // Генерация температуры
        System.out.println( "Измеряем температуру у каждого пациента..." );
        for ( int indexPatient = 0; indexPatient < patients.length; indexPatient++ ){
            double temperature = 32.0 + ( Math.random() * 8. );
            patients[ indexPatient ] = temperature;
            System.out.println( "Пациент № " + indexPatient + "; Температура: " + temperature );
        }

        // Кол-во здоровых пациентов с температурой от 36.2 до 36.9
        int healthyPatientCount = 0;

        for ( int indexPatient = 0; indexPatient < patients.length; indexPatient++ ) {
            if ( patients[ indexPatient ] >= 36.2 && patients [ indexPatient ] <= 36.9 ){
                healthyPatientCount += 1;
            }
        }
        System.out.println( "Количество здоровых пациентов (температура от 36.2 до 36.9): " + healthyPatientCount );
    }
}
