package comps;

public class TestDays {
    public static void main(String[] args) {
        String inpDay = "MON";

        DaysOfWeek day = DaysOfWeek.valueOf(inpDay);


        switch (day){
            case MON:
            case WED:
            case FRI:
                System.out.println("Я учусь в " + day); break;
            default: System.out.println("Я свободен в " + day);
        }
    }
}
