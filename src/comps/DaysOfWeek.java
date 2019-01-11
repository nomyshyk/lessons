package comps;

public enum  DaysOfWeek {
    MON("ПН"), TUE("ВТ"),
    WED("СР"), THU("ЧТ"),
    FRI("ПТ"), SAT("СБ"), SUN("ВС");

    private String title;
    DaysOfWeek(String title){
        this.title = title;
    }

    @Override
    public String toString(){
        return title;
    }

}
