import java.util.ArrayList;
import java.util.List;
public class Doctor {
    //Exei apla auto-generated constructors,getters,setters,toString sumfwna me ta attributes ths ekfwnhshs
    //-------------------------------------------------------------------------------------------------------------------
    //Attributes
    //-------------------------------------------------------------------------------------------------------------------
    private String amka;
    private String name;
    private String surname;
    private List<Timeslot> timeslots;
    //-------------------------------------------------------------------------------------------------------------------
    //Constructors
    //-------------------------------------------------------------------------------------------------------------------
    public Doctor(String amka, String name, String surname, List<Timeslot> timeslots) {
        this.amka = amka;
        this.name = name;
        this.surname = surname;
        this.timeslots = timeslots;
    }

    public Doctor(String amka, String name, String surname) {
        this.amka = amka;
        this.name = name;
        this.surname = surname;
        this.timeslots = new ArrayList<>();
    }

    public Doctor() {
        this.timeslots = new ArrayList<>();
    }
    //-------------------------------------------------------------------------------------------------------------------
    //Getters and Setters
    //-------------------------------------------------------------------------------------------------------------------
    public String getAmka() {
        return amka;
    }
    public void setAmka(String amka) {
        this.amka = amka;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Timeslot> getTimeslots() {
        return timeslots;
    }

    public void setTimeslots(List<Timeslot> timeslots) {
        this.timeslots = timeslots;
    }

    //    public void addTimeSlot(Timeslot timeslot) {
//        this.timeslots.add(timeslot);
//    }
    //-------------------------------------------------------------------------------------------------------------------
    //To String for all attributes
    //-------------------------------------------------------------------------------------------------------------------
    @Override public String toString() {
        return "domain.Doctor{" +
                "amka=" + amka +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}