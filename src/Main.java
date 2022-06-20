import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        //asList method returns a type of ArrayList that is different from java. util. ArrayList. The main difference is that the returned ArrayList only wraps an existing array — it doesn't implement the add and remove methods.
        //asList gia tous insured opou dinw afm,amka,name,surname,birthdate,email

        List<Insured> insuredCitizens = Arrays.asList(

                //---------------------------------------------------------------------------------------------------------------------------------
//int afm, int amka, String name, String surname, LocalDate birthdate, String email
                //{The minusYears() method of a LocalDate class is used to subtract the number of specified years from this LocalDate and return a copy of LocalDate.
                //This method subtracts the years field in the following steps:
                //Firstly, it subtracts the years from the year field in this LocalDate.
                //Check if the date after subtracting years is valid or not.
                //If the date is invalid then method adjusts the day-of-month to the last valid day.
//				The minusMonths() method of LocalDate class in Java is used to subtract the number of specified months from this LocalDate and return a copy of LocalDate.
//				This method subtracts the months field in the following steps:
//				subtract the months from the month-of-year field.
//				Check if the date after subtracting months is valid or not.
//				If date is invalid then method adjust the day-of-month to the last valid day.}
                //---------------------------------------------------------------------------------------------------------------------------------
                new Insured("1", "11", "George", "Georgiadis", LocalDate.now().minusYears(22L).minusMonths(10L).minusDays(11L), "georgegeorgiadis@gmail.com"),
                new Insured("2", "21", "Maria", "Papadopoulou", LocalDate.now().minusYears(63L).minusMonths(4L).minusDays(1L), "mariapapadopoulou@gmail.com"),
                new Insured("3", "31", "Ioanna", "Ioannidou", LocalDate.now().minusYears(72L).minusMonths(5L).minusDays(21L), "iioannaioannidou@gmail.com"),
                new Insured("4", "41", "Basilis", "Argyropoulos", LocalDate.now().minusYears(82L).minusMonths(6L).minusDays(4L), "basilisargyropoulos@gmail.com"),
                new Insured("5", "51", "Dimos", "Gabrtsis", LocalDate.now().minusYears(32L).minusMonths(2L).minusDays(11L), "dimosgabrtsis@gmail.com"),
                new Insured("6", "61", "Faidon", "Barberlis", LocalDate.now().minusYears(12L).minusMonths(6L).minusDays(1L), "faidonbarberlis@gmail.com"),
                new Insured("7", "71", "Alkiviadis", "Karakis", LocalDate.now().minusYears(25L).minusMonths(7L).minusDays(12L), "alkiviadiskarakis@gmail.com"),
                new Insured("8", "81", "Panos", "Kalatzopoulos", LocalDate.now().minusYears(72L).minusMonths(8L).minusDays(2L), "panoskalatzopoulos@gmail.com"),
                new Insured("9", "91", "Dimitris", "Tegos", LocalDate.now().minusYears(32L).minusMonths(4L).minusDays(4L), "dimitristegos@gmail.com"),
                new Insured("10", "101", "Alexis", "Xenoglou", LocalDate.now().minusYears(52L).minusMonths(5L).minusDays(5L), "alexisxenoglou@gmail.com"),
                new Insured("11", "111", "Dionisis", "Spereas", LocalDate.now().minusYears(62L).minusMonths(9L).minusDays(11L), "dionisisspereas@gmail.com"),
                new Insured("12", "121", "Vrasidas", "Antonakos", LocalDate.now().minusYears(72L).minusMonths(4L).minusDays(1L), "vrasidasantonakos@gmail.com"),
                new Insured("13", "131", "Athanasia", "Spinaki", LocalDate.now().minusYears(32L).minusMonths(6L).minusDays(11L), "athanasiaspinaki@gmail.com"),
                new Insured("14", "141", "Valeria", "Galanopoulou", LocalDate.now().minusYears(42L).minusMonths(7L).minusDays(11L), "valeriagalanopoulou@gmail.com"),
                new Insured("15", "151", "Athanasia", "Leventou", LocalDate.now().minusYears(52L).minusMonths(8L).minusDays(11L), "athanasialeventou@gmail.com"));


        //Creation of 4 doctors
        Doctor doctor1 = new Doctor("123", "Chris", "Georgiadis", new ArrayList<>());
        Doctor doctor2 = new Doctor("234", "Nikos", "Vlassopoulos", new ArrayList<>());
        Doctor doctor3 = new Doctor("345","Giannis","Markoglou", new ArrayList<>());
        Doctor doctor4 = new Doctor("456","Kostas","Argiriadis", new ArrayList<>());

        //Creation of Timeslots for doctor1
        Timeslot timeslot = new Timeslot(0, 1, 1, 2022, 10, 0, 0, 0, doctor1, false);
        Timeslot timeslot1 = new Timeslot(1, 1, 1, 2022, 10, 30, 0, 0, doctor1, false);
        Timeslot timeslot2 = new Timeslot(2, 1, 1, 2022, 11, 0, 0, 0, doctor1, false);
        Timeslot timeslot3 = new Timeslot(3, 1, 1, 2022, 11, 30, 0, 0, doctor1, false);
        Timeslot timeslot4 = new Timeslot(4, 1, 1, 2022, 12, 0, 0, 0, doctor1, false);

        //Timeslots for doctor 1
        doctor1.setTimeslots(Arrays.asList(timeslot, timeslot1, timeslot2, timeslot3, timeslot4));

        //Creation of Timeslots for doctor2
        Timeslot timeslot5 = new Timeslot(5, 1, 1, 2022, 12, 30, 0, 0, doctor2, false);
        Timeslot timeslot6 = new Timeslot(6, 1, 1, 2022, 13, 0, 0, 0, doctor2, false);
        Timeslot timeslot7 = new Timeslot(7, 1, 1, 2022, 13, 30, 0, 0, doctor2, false);
        Timeslot timeslot8 = new Timeslot(8, 1, 1, 2022, 14, 0, 0, 0, doctor2, false);
        Timeslot timeslot9 = new Timeslot(9, 1, 1, 2022, 14, 30, 0, 0, doctor2, false);

        //Timeslots for doctor 2
        doctor2.setTimeslots(Arrays.asList(timeslot5, timeslot6, timeslot7, timeslot8, timeslot9));

        //Creation of Timeslots for doctor3
        Timeslot timeslot10 = new Timeslot(10, 1, 1, 2022, 10, 0, 0, 0, doctor3, false);
        Timeslot timeslot11 = new Timeslot(11, 1, 1, 2022, 10, 30, 0, 0, doctor3, false);
        Timeslot timeslot12 = new Timeslot(12, 1, 1, 2022, 11, 0, 0, 0, doctor3, false);
        Timeslot timeslot13 = new Timeslot(13, 1, 1, 2022, 11, 30, 0, 0, doctor3, false);
        Timeslot timeslot14 = new Timeslot(14, 1, 1, 2022, 12, 0, 0, 0, doctor3, false);

        //Timeslots for doctor 3
        doctor3.setTimeslots(Arrays.asList(timeslot10, timeslot11, timeslot12, timeslot13, timeslot14));

        //Creation of Timeslots for doctor4
        Timeslot timeslot15 = new Timeslot(15, 1, 1, 2022, 12, 30, 0, 0, doctor4, false);
        Timeslot timeslot16 = new Timeslot(16, 1, 1, 2022, 13, 0, 0, 0, doctor4, false);
        Timeslot timeslot17 = new Timeslot(17, 1, 1, 2022, 13, 30, 0, 0, doctor4, false);
        Timeslot timeslot18 = new Timeslot(18, 1, 1, 2022, 14, 0, 0, 0, doctor4, false);
        Timeslot timeslot19 = new Timeslot(19, 1, 1, 2022, 14, 30, 0, 0, doctor4, false);

        //Timeslots for doctor 4
        doctor4.setTimeslots(Arrays.asList(timeslot15, timeslot16, timeslot17, timeslot18, timeslot19));

        //List with Timeslots for vaccination center 1
        List<Timeslot> timeslotsListCenter1 = Arrays.asList(timeslot, timeslot1, timeslot2, timeslot3, timeslot4, timeslot5, timeslot6, timeslot7, timeslot8, timeslot9);

        //List with Timeslots for vaccination center 2
        List<Timeslot> timeslotsListCenter2 = Arrays.asList(timeslot10, timeslot11, timeslot12, timeslot13, timeslot14, timeslot15, timeslot16, timeslot17, timeslot18, timeslot19);

        //Create the first Vaccination center (1) with code address and timeslots
        VaccinationCenter vaccinationCenter1 = new VaccinationCenter(1234, "Egnatias 154, Thessaloniki", timeslotsListCenter1);

        //Create the second Vaccination center (2) with code address and timeslots
        VaccinationCenter vaccinationCenter2 = new VaccinationCenter(5678, "Tsimiski 90, Thessaloniki", timeslotsListCenter2);

        //List with all the Timeslots
        List<Timeslot> timeslots = Arrays.asList(timeslot, timeslot1, timeslot2, timeslot3, timeslot4, timeslot5, timeslot6, timeslot7, timeslot8, timeslot9, timeslot10, timeslot11, timeslot12, timeslot13, timeslot14, timeslot15, timeslot16, timeslot17, timeslot18, timeslot19);

        //List with all the doctors
        List<Doctor> doctors = Arrays.asList(doctor1, doctor2, doctor3, doctor4);

        //List with all the vaccination centers
        List<VaccinationCenter> vaccinationCenters = Arrays.asList(vaccinationCenter1, vaccinationCenter2);


        //Timeslots opou tha ginoun emvoliasmoi
        timeslot.setReserved(true);
        timeslot1.setReserved(true);
        timeslot2.setReserved(true);
        timeslot3.setReserved(true);
        timeslot4.setReserved(true);
        timeslot5.setReserved(true);
        timeslot6.setReserved(true);
        timeslot7.setReserved(true);

        //Krathseis gia 8 emvoliasmenous
        Reservation reservation1 = new Reservation(insuredCitizens.get(0), timeslot);
        insuredCitizens.get(0).setBooked(true);

        Reservation reservation2 = new Reservation(insuredCitizens.get(1), timeslot1);
        insuredCitizens.get(1).setBooked(true);

        Reservation reservation3 = new Reservation(insuredCitizens.get(2), timeslot2);
        insuredCitizens.get(2).setBooked(true);

        Reservation reservation4 = new Reservation(insuredCitizens.get(3), timeslot3);
        insuredCitizens.get(3).setBooked(true);

        Reservation reservation5 = new Reservation(insuredCitizens.get(4), timeslot4);
        insuredCitizens.get(4).setBooked(true);

        Reservation reservation6 = new Reservation(insuredCitizens.get(5), timeslot5);
        insuredCitizens.get(5).setBooked(true);

        Reservation reservation7 = new Reservation(insuredCitizens.get(6), timeslot6);
        insuredCitizens.get(6).setBooked(true);

        Reservation reservation8 = new Reservation(insuredCitizens.get(7), timeslot7);
        insuredCitizens.get(7).setBooked(true);

        //List me ta reservations
        List<Reservation> reservations = Arrays.asList(reservation1, reservation2, reservation3, reservation4, reservation5, reservation6, reservation7, reservation8);

        //pragmatoopihste emvoliasmo gia 6 apo tous 8 asfalimsenous pou ekleisan rantevou afhse apo eksw to asfalismeno tou timeslot 3 kai timeslot 7
        //Ara afhse apo eksw ioanna kai Basili
        Vaccination vaccination1 = new Vaccination(insuredCitizens.get(0), doctor1, LocalDate.now(), LocalDate.now().plusMonths(6), timeslot);
        Vaccination vaccination2 = new Vaccination(insuredCitizens.get(1), doctor1, LocalDate.now(), LocalDate.now().plusMonths(6), timeslot1);
        Vaccination vaccination3 = new Vaccination(insuredCitizens.get(2), doctor1, LocalDate.now(), LocalDate.now().plusMonths(6), timeslot2);
        Vaccination vaccination4 = new Vaccination(insuredCitizens.get(4), doctor1, LocalDate.now(), LocalDate.now().plusMonths(6), timeslot4);
        Vaccination vaccination5 = new Vaccination(insuredCitizens.get(5), doctor1, LocalDate.now(), LocalDate.now().plusMonths(6), timeslot5);
        Vaccination vaccination6 = new Vaccination(insuredCitizens.get(6), doctor1, LocalDate.now(), LocalDate.now().plusMonths(6), timeslot6);
        //List me tous emvoliasmenous
        List<Vaccination> vaccinations = Arrays.asList(vaccination1, vaccination2, vaccination3, vaccination4, vaccination5, vaccination6);


        System.out.println("\nUpcoming appointments for every vaccination center: \n");
        //        Ta epikeimena rantevou gia kathe emvoliastiko kentro
        reservations.forEach(reservation -> {
            System.out.println(reservation.toString());
        });
//		for (int i = 0; i < reservations.size(); i++) {
//			System.out.println(reservations.get(i).toString());
//		}
//		for (Reservation reservation : reservations) {
//			System.out.println(reservation.toString());
//		}

        System.out.println("\nFree timeslots for every vaccination center: ");
        //Tis eleutheres xronikes thirides kathe emvoliastikou kentrou
        vaccinationCenters.forEach(vaccinationCenter -> {
            System.out.println();
            for (int i = 0; i < vaccinationCenter.getTimeslots().size(); i++) {
                if (!vaccinationCenter.getTimeslots().get(i).isReserved()) {
                    System.out.println(vaccinationCenter.getTimeslots().get(i).toString());
                }
            }
        });

        System.out.println("\nVaccinations completed for every doctor, for all doctors: ");
        //Tous emvoliasmous (hmeromhnia emvoliasmou kai onomatepwnumo asfalimsenou) pou
        //pragmatopoihse kathe giatros, gia olous tous giatrous

        System.out.println();
        for (int i = 0; i < doctors.size(); i++) {
            System.out.println("Doctor : " + doctors.get(i).toString());
            for (int j = 0; j < vaccinations.size(); j++) {
                for (int k = 0; k < doctors.get(i).getTimeslots().size(); k++) {
                    if (vaccinations.get(j).getTimeslot().getCode() == doctors.get(i).getTimeslots().get(k).getCode()) {
                        System.out.println(vaccinations.get(j).toString());
                    }

                }
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("\nInsured above 60 yo without an appointment for vaccination: \n");
        //Tous asfalismenous anw twn 60 etwn pou den exoun kleisei rantevou gia emvoliasmo
        //The between() method of Period class in Java is used to obtain a period consisting of the number of years,
        //months, and days between two given dates (including start date and excluding end date).
        for (int i = 0; i < insuredCitizens.size(); i++) {
            LocalDate birthdate = insuredCitizens.get(i).getBirthdate();
            LocalDate currentDate = LocalDate.now();
            if ((birthdate != null) && (currentDate != null)) {
                int years = Period.between(birthdate, currentDate).getYears();
                if (years > 60 && !insuredCitizens.get(i).isBooked()) {
                    System.out.println(insuredCitizens.get(i).toString());
                }
            }
        }

    }

}