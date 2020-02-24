public class Manager extends Employee {
    public Manager(Company company) {
        super(company);
        fixedSalary = getRandomFromRange(40000, 60000);
        salesAmount = getRandomFromRange( 30000, 70000);
    }

    @Override
    public double calculateMonthSalary() {
        salaryBonusPercent = 0.05;
        return fixedSalary + company.getIncome() * salaryBonusPercent;
    }
}
