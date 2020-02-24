import java.util.*;

public class Company {
    private String name;
    private ArrayList<Employee> employees = new ArrayList<>();
    private double income;

    public Company ( String name ) {
        this.name = name;
    }

    public void hire( Employee employee ) {
        employees.add( employee );
    }

    public void fire( ) {
        int index = 0 + (int) (Math.random() * (employees.size() - 1 ));
        employees.remove( index );
    }

    public String getName() {
        return name;
    }
    public ArrayList<Employee> getEmployees() {
        return employees;
    }
    public double getIncome() {
        income = 0;
        for ( Employee employee: employees ) {
            income += employee.getSalesAmount();
        }
        return income;
    }

    public List<Employee> getTopSalaryStuff( int count ) {
        Collections.sort( employees, ( o1, o2 ) -> (int) ( o2.calculateMonthSalary() - o1.calculateMonthSalary() )) ;
        return getSalaryStuffOfLength( count );
    }
    public List<Employee> getLowestSalaryStuff(int count ) {
        Collections.sort( employees, ( o1, o2 ) -> (int) ( o1.calculateMonthSalary() - o2.calculateMonthSalary() ));
        return getSalaryStuffOfLength( count );
    }
    private List< Employee > getSalaryStuffOfLength( int count ) {
        return employees.subList( 0, Math.min( employees.size(), count ));
    }
}
