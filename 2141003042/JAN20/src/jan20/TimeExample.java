package jan20;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
public class TimeExample{
public static void main(String args[]) {
 LocalTime fastForward = LocalTime.parse("03:20").plus(5, ChronoUnit.HOURS);
 System.out.println(fastForward);
}
}