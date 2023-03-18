
import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    HourClockHand hour = new HourClockHand(12);
    NonHourClockHand minute = new NonHourClockHand(60);
    
    double hourPosition = input.nextDouble();
    double minutePosition = input.nextDouble();

    HourClockHandOffset offset = new HourClockHandOffset(minutePosition, 0);

    hour.setPosition(hourPosition);
    minute.setPosition(minutePosition);

    double hourAngle = hour.getPositionAngle();
    double hourOffset = offset.getMinuteOffsetToHourHand();
    double minuteAngle = minute.getPositionAngle();

    System.out.println(offset.getMinuteOffsetToHourHand());
    calculateLesserAngle(hourAngle, minuteAngle, hourOffset);
    calculateNoOffsetLesserAngle(hourAngle, minuteAngle);
    input.close();
  }
  public static void calculateLesserAngle(double hourAngle, double minuteAngle, double offset) {
    double lesserAngle = Math.abs(minuteAngle - (hourAngle + offset));
    if (lesserAngle > 180) lesserAngle = 360 - lesserAngle;
    System.out.println("With hour hand offset: " + lesserAngle );
  }
  public static void calculateNoOffsetLesserAngle(double hourAngle, double minuteAngle) {
    double lesserAngleNoOffset = Math.abs(minuteAngle - hourAngle);
    if (lesserAngleNoOffset > 180) lesserAngleNoOffset = 360 - lesserAngleNoOffset;
    System.out.println("Without hour hand offset: " + lesserAngleNoOffset);
  }
}
