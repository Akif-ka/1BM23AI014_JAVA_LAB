public class EnumerationExample {
    public enum DayOfWeek {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY;

        public boolean workDay() {
            return this != SUNDAY && this != SATURDAY;
        }
    }

    public static void main(String[] args) {
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println(day + " is a workday: " + day.workDay());
        }
    }
}
