import java.util.List;

public class Main {
    public static void main(String[] args) {
        Company company1 = new Company( "ОАО Чебуречная" );
        hireAll(company1, 18, 8, 1);

        int count = 10;
        List<Employee> company1SalaryList = company1.getTopSalaryStuff( count );
        System.out.println( "Компания: " + company1.getName() + "; Доход: " + company1.getIncome() + "; ТОР " + count + " зарплат: " );
        for (Employee employee : company1SalaryList ) {
            System.out.println( employee.calculateMonthSalary());
        }
        System.out.println( "Компания: " + company1.getName() + "; Доход: " + company1.getIncome() + "; ЛОУ " + count + " зарплат: " );
        company1SalaryList = company1.getLowestSalaryStuff( count );
        for (Employee employee : company1SalaryList ) {
            System.out.println( employee.calculateMonthSalary());
        }

        System.out.println( "Рандомно увольняем 50% работников. Кол-во работников сейчас: " + company1.getEmployees().size());
        int midIndex = (int) company1.getEmployees().size() / 2;
        for ( int i = 0; i < midIndex; i++) {
            company1.fire();
        }
        System.out.println( "Кол-во работников теперь: " + company1.getEmployees().size());

        System.out.println( "Компания: " + company1.getName() + "; Доход: " + company1.getIncome() + "; ТОР " + count + " зарплат: " );
        company1SalaryList = company1.getTopSalaryStuff( count );
        for (Employee employee : company1SalaryList ) {
            System.out.println( employee.calculateMonthSalary());
        }

        System.out.println( "Компания: " + company1.getName() + "; Доход: " + company1.getIncome() + "; ЛОУ " + count + " зарплат: " );
        company1SalaryList = company1.getLowestSalaryStuff( count );
        for (Employee employee : company1SalaryList ) {
            System.out.println( employee.calculateMonthSalary());
        }

//        и т.д.
//        Company company2 = new Company( "Электрокар Inc", 50000, 12000000 );
//        company2.hire();
//        company2.hireAll();
//        count = 15;
//        List<Employee> company2TopSalaryList = company2.getTopSalaryStuff( count );
//        System.out.println( "Компания: " + company2.getName() + "; Доход: " + company2.getIncome() + "; ТОР " + count + " зарплат: " );
//        for (Employee employee : company2TopSalaryList ) {
//            System.out.println( employee.getMonthSalary());
//        }

    }

    public static void hireAll(Company company, int numberOfOperators, int numberOfManagers, int numberOfTopManagers ) {
        if ( numberOfOperators > 0 ) {
            for ( int i = 0; i < numberOfOperators; i++ )
                company.hire(new Operator( company ) );
        }
        if ( numberOfManagers > 0 ) {
            for ( int i = 0; i < numberOfManagers; i++ )
                company.hire(new Manager( company ) );
        }
        if ( numberOfTopManagers > 0 ) {
            for ( int i = 0; i < numberOfTopManagers; i++ )
                company.hire( new TopManager( company ) );
        }
    }
}
