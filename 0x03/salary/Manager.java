public class Manager extends Employee {

    public Manager(double fixedSalary) {
        super(fixedSalary);
    }

    @Override
    public double calculateBonus(Department department) {
        if (department.reachedTarget()) {
            double baseBonus = fixedSalary * 0.20;
            double extraBonus =
                (department.getAchievedTargetValue() - department.getTargetValue()) * 0.01;

            return baseBonus + extraBonus;
        }
        return 0;
    }
}