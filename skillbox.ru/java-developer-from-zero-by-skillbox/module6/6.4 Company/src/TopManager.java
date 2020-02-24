public class TopManager extends Employee {
    public TopManager(Company company) {
        super(company);
        fixedSalary = getRandomFromRange(60000, 80000 );
        salesAmount = getRandomFromRange(50000, 100000);
    }

    @Override
    public double calculateMonthSalary() {
        double bonus = 0;
        salaryBonusThreshold = 10000000;
        salaryBonusPercent = 2.5;
        if ( company.getIncome() > salaryBonusThreshold ) {
            bonus = salaryBonusPercent * fixedSalary;
        }

        return fixedSalary + bonus;
    }
}