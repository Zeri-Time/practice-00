import java.util.Calendar;

public class Practice_09_enum {
    public static void main (String[] args){
        Week today = null;

        Calendar cal = Calendar.getInstance();
        int week = cal.get(Calendar.DAY_OF_WEEK);
        //import한 캘린더로 오늘의 요일을 int로 받음 (1~7)

        switch (week) {
            case 1:
                today = Week.SUNDAY; break;
            case 2:
                today = Week.MONDAY; break;
            case 3:
                today = Week.TUESDAY; break;
            case 4:
                today = Week.WEDNESDAY; break;
            case 5:
                today = Week.THURSDAY; break;
            case 6:
                today = Week.FRIDAY; break;
            case 7:
                today = Week.SATURDAY; break;
        }
        System.out.println("오늘의 요일: " + today);
    }
}
