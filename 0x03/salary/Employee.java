public class Employee {
    protected double fixedSalary;

    public Employee(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    public double getFixedSalary() {
        return fixedSalary;
    }

    public double calculateBonus(Department department) {
        if (department.reachedTarget()) {
            return fixedSalary * 0.10;
        }
        return 0;
    }

    public double calculateTotalSalary(Department department) {
        return fixedSalary + calculateBonus(department);
    }
}