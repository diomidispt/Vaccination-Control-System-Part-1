public class Reservation {
    //Exei apla auto-generated constructors,getters,setters,toString sumfwna me ta attributes ths ekfwnhshs
    //-------------------------------------------------------------------------------------------------------------------
    //Attributes
    //-------------------------------------------------------------------------------------------------------------------
    private Insured insured;
    private Timeslot timeslot;

    //-------------------------------------------------------------------------------------------------------------------
    //Constructors
    //-------------------------------------------------------------------------------------------------------------------
    public Reservation(Insured insured, Timeslot timeslot) {
        this.insured = insured;
        this.timeslot = timeslot;
    }

    public Reservation() {
    }
    //-------------------------------------------------------------------------------------------------------------------
    //Getters and Setters
    //-------------------------------------------------------------------------------------------------------------------
    public Insured getInsured() {
        return insured;
    }

    public void setInsured(Insured insured) {
        this.insured = insured;
    }

    public Timeslot getTimeslot() {
        return timeslot;
    }

    public void setTimeslot(Timeslot timeslot) {
        this.timeslot = timeslot;
    }
    //-------------------------------------------------------------------------------------------------------------------
    //To String for all attributes
    //-------------------------------------------------------------------------------------------------------------------
    @Override public String toString() {
        return "domain.Reservation{" +
                "insured=" + insured.toString() +
                ", timeslot=" + timeslot.toString() +
                '}';
    }
}