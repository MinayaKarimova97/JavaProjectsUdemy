package java_hacker_rank_solutions;
import java.util.*;
import java.time.*;

public class DateTime {
    public static void main(String[] args) {
        //Calendar rightNow = Calendar.getInstance();
        //rightNow.set(2025, 9,13);
        //int day = rightNow.get(Calendar.DAY_OF_WEEK);
        //System.out.println(day);

        LocalDate today = LocalDate.of(2025, 9, 30);
        DayOfWeek dayOfWeek = today.getDayOfWeek();
        System.out.println("Day is: " + dayOfWeek); // e.g., WEDNESDAY
    }
}
