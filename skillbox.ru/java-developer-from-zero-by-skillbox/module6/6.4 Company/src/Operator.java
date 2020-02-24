public class Operator extends Employee {
    public Operator(Company company) {
        super(company);
        fixedSalary = getRandomFromRange( 20000, 40000 );
    }

    protected double calculateMonthSalary() {
        return fixedSalary;
    };
}
