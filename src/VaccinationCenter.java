import java.util.ArrayList;
import java.util.List;

public class VaccinationCenter {
    //Exei apla auto-generated constructors,getters,setters sumfwna me ta attributes ths ekfwnhshs
    //-------------------------------------------------------------------------------------------------------------------
    //Attributes
    //-------------------------------------------------------------------------------------------------------------------
    private int code;
    private String address;
    private List<Timeslot> timeslots;

    //-------------------------------------------------------------------------------------------------------------------
    //Constructors
    //-------------------------------------------------------------------------------------------------------------------

    public VaccinationCenter(int code, String address) {
        this.code = code;
        this.address = address;
        this.timeslots = new ArrayList<>();
    }

    public VaccinationCenter(int code, String address, List<Timeslot> timeslots) {
        this.code = code;
        this.address = address;
        this.timeslots = timeslots;
    }

    public VaccinationCenter() {
    }
    //-------------------------------------------------------------------------------------------------------------------
    //Getters and Setters
    //-------------------------------------------------------------------------------------------------------------------
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
}