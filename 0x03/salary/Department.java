public class Department {
  
  private double targetValue;
  private double achievedTargetValue;


  public Department(double targetValue, double achievedTargetValue) {
    this.targetValue = targetValue;
    this.achievedTargetValue = achievedTargetValue;
  }

    public double getTargetValue() {
        return targetValue;
    }

    public double getAchievedTargetValue() {
        return achievedTargetValue;
    }

    public boolean isTargetAchieved() {
        return achievedTargetValue >= targetValue;
    } 
}