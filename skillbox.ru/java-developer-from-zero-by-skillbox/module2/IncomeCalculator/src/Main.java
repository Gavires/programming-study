import java.util.Scanner;

public class Main
{
    // Объявление переменных
    private static int minIncome = 200000;
    private static int maxIncome = 900000;

    private static int officeRentCharge = 140000;
    private static int telephonyCharge = 12000;
    private static int internetAccessCharge = 7200;

    private static int assistantSalary = 45000;
    private static int financeManagerSalary = 90000;

    private static double mainTaxPercent = 0.24;
    private static double managerPercent = 0.15;

    private static double minInvestmentsAmount = minIncome;

    public static void main(String[] args)
    {
        while(true)
        {
            // Ввод суммы доходов
            System.out.println( "Введите сумму доходов компании за месяц " +
                "(от 200 до 900 тысяч рублей): ");
            // Получение введенного значения из консоли
            int income = ( new Scanner( System.in ) ).nextInt();

            // Введенное значение в диапазоне
            if ( !checkIncomeRange( income ) ) {
                continue;
            }

            // З/П менеджера
            double managerSalary = income * managerPercent;
            // Чистый доход
            double pureIncome = income - managerSalary - calculateFixedCharges();
            // Налог
            double taxAmount = mainTaxPercent * pureIncome;
            // Чистый доход после налогов
            double pureIncomeAfterTax = pureIncome - taxAmount;
            // Возможность инвестировать
            boolean canMakeInvestments = pureIncomeAfterTax >= minInvestmentsAmount;

            // Вывод в консоль
            System.out.println( "Зарплата менеджера: " + managerSalary );
            System.out.println( "Общая сумма налогов: " + ( taxAmount > 0 ? taxAmount : 0) );
            System.out.println( "Компания может инвестировать: " + ( canMakeInvestments ? "да" : "нет" ) );

            // Убытки
            if ( pureIncome < 0 ) {
                System.out.println( "Бюджет в минусе! Нужно срочно зарабатывать!" );
            }
        }
    }

    // Метод проверки введенного значения дохода в доступном диапазоне
    private static boolean checkIncomeRange( int income )
    {
        if ( income < minIncome )
        {
            System.out.println( "Доход меньше нижней границы" );
            return false;
        }
        if ( income > maxIncome )
        {
            System.out.println( "Доход выше верхней границы" );
            return false;
        }
        return true;
    }

    // Расчет постоянных расходов
    private static int calculateFixedCharges()
    {
        return officeRentCharge +
                telephonyCharge +
                internetAccessCharge +
                assistantSalary +
                financeManagerSalary;
    }
}
