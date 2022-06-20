public class Timeslot {
    //Exei apla auto-generated constructors,getters,setters,toString sumfwna me ta attributes ths ekfwnhshs
    //Epishs exei ena boolean attribute epipleon isReserved
    //-------------------------------------------------------------------------------------------------------------------
    //Attributes
    //-------------------------------------------------------------------------------------------------------------------
    private int code;
    private int day;
    private int month;
    private int year;
    private int hour;
    private int minutes;
    private int startMinute;
    private int endMinute;
    private Doctor doctor;
    private boolean isReserved;

    //-------------------------------------------------------------------------------------------------------------------
    //Constructors
    //-------------------------------------------------------------------------------------------------------------------

    public Timeslot(int code, int day, int month, int year, int hour, int minutes, int startMinute, int endMinute, Doctor doctor, boolean isReserved) {
        this.code = code;
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = hour;
        this.minutes = minutes;
        this.startMinute = startMinute;
        this.endMinute = endMinute;
        this.doctor = doctor;
        this.isReserved = isReserved;
    }

    public Timeslot() {
    }
    //-------------------------------------------------------------------------------------------------------------------
    //Getters and Setters
    //-------------------------------------------------------------------------------------------------------------------
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getStartMinute() {
        return startMinute;
    }

    public void setStartMinute(int startMinute) {
        this.startMinute = startMinute;
    }

    public int getEndMinute() {
        return endMinute;
    }

    public void setEndMinute(int endMinute) {
        this.endMinute = endMinute;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    //-------------------------------------------------------------------------------------------------------------------
    //To String for all attributes
    //-------------------------------------------------------------------------------------------------------------------

    @Override public String toString() {
        return "domain.Timeslot{" +
                "code=" + code +
                ", day=" + day +
                ", month=" + month +
                ", year=" + year +
                ", hour=" + hour +
                ", minutes=" + minutes +
                ", startMinute=" + startMinute +
                ", endMinute=" + endMinute +
                ", doctor=" + doctor +
                ", isReserved=" + isReserved +
                '}';
    }
}