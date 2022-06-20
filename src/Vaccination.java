import java.time.LocalDate;

public class Vaccination {
    //Exei apla auto-generated constructors,getters,setters,toString sumfwna me ta attributes ths ekfwnhshs
    //Epishs exei epileon ena timeslot attribute
    //-------------------------------------------------------------------------------------------------------------------
    //Attributes
    //-------------------------------------------------------------------------------------------------------------------
    private Insured insured;
    private Doctor doctor;
    private LocalDate vaccinationDate;
    private LocalDate expirationDate;
    private Timeslot timeslot;

    //-------------------------------------------------------------------------------------------------------------------
    //Constructors
    //-------------------------------------------------------------------------------------------------------------------
    public Vaccination(Insured insured, Doctor doctor, LocalDate vaccinationDate, LocalDate expirationDate) {
        this.insured = insured;
        this.doctor = doctor;
        this.vaccinationDate = vaccinationDate;
        this.expirationDate = expirationDate;
    }

    public Vaccination() {
    }

    public Vaccination(Insured insured, Doctor doctor, LocalDate vaccinationDate, LocalDate expirationDate, Timeslot timeslot) {
        this.insured = insured;
        this.doctor = doctor;
        this.vaccinationDate = vaccinationDate;
        this.expirationDate = expirationDate;
        this.timeslot = timeslot;
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

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public LocalDate getVaccinationDate() {
        return vaccinationDate;
    }

    public void setVaccinationDate(LocalDate vaccinationDate) {
        this.vaccinationDate = vaccinationDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
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
        return "domain.Vaccination{" +
                "insured=" + insured.toString() +
                ", doctor=" + doctor.toString() +
                ", timeslot=" + timeslot.toString() +
                '}';
    }
}