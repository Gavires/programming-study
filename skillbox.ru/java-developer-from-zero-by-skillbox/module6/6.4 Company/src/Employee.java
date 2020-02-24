public abstract class Employee  {
    protected static double salaryBonusPercent;
    protected static double salaryBonusThreshold;
    protected double fixedSalary = 0;
    protected double salesAmount = 0;
    protected Company company;

    public Employee( Company company ) {
        this.company = company;
    }

    protected abstract double calculateMonthSalary();

    protected static double getRandomFromRange(double rangeMin, double rangeMax ) {
        return rangeMin + Math.random() * rangeMax;
    }

    public double getSalesAmount() {
        return salesAmount;
    }
}
