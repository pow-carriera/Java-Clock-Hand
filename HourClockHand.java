public class HourClockHand {

  private double FULL_ANGLE = 360.0;
  private double stepCount;

  public HourClockHand(double stepCount) {
    this.stepCount = stepCount;
    this.stepAngle = FULL_ANGLE / stepCount;
  }

  public double getStepCount() {
    return this.stepCount;
  }

  private double stepAngle;

  public double getStepAngle() {
    return this.stepAngle;
  }

  private double position;

  public void setPosition(double position) {
    if (!(position > 0 && position <= stepCount)) throw new Error("Position invalid.");
    if (position == 12) position = position - 12;
    this.position = position;
  }

  public double getPositionAngle() {
    return position * stepAngle;
  }
}
