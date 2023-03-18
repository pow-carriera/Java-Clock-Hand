public class HourClockHandOffset {
  private double minutePosition;
  private double secondPosition;
  public HourClockHandOffset(double minutePosition, double secondPosition) {
    this.minutePosition = minutePosition;
    this.secondPosition = secondPosition;
  }

  public double getMinuteOffsetToHourHand() {
    return this.minutePosition / 2;
  }
}
