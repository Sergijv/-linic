import java.util.ArrayList;
import java.util.List;

public class Doctor {
    public static List <Doctor> doctorsList= new ArrayList<>();
    String doctorName;
    Main.Cabinet specialty;
    Schedule doctorsSchedule;
    Doctor(String doctorName,Main.Cabinet specialty,Boolean inMorningWorkTime){
        this.doctorName=doctorName;
        this.specialty=specialty;
        this.doctorsSchedule = new Schedule(inMorningWorkTime);
    }
    public static List<Doctor> createDoctors () {
        //List<Doctor> doctorsList = new ArrayList<>();
        doctorsList.add(new Doctor("Ivanov T.O.", Main.Cabinet.THERAPEUT, true));
        doctorsList.add(new Doctor("Petrov S.A.", Main.Cabinet.THERAPEUT, false));

        doctorsList.add(new Doctor("Bojcuk O.V.", Main.Cabinet.SURGERY, true));
        doctorsList.add(new Doctor("Melnyk O.M.", Main.Cabinet.SURGERY, false));

        doctorsList.add(new Doctor("Denysenko A.D.", Main.Cabinet.PEDIATRIC, true));
        doctorsList.add(new Doctor("Adam K.P.", Main.Cabinet.PEDIATRIC, false));

        doctorsList.add(new Doctor("Kozak A.S.", Main.Cabinet.STOMATOLOGY, true));
        doctorsList.add(new Doctor("Pysanka J.T.", Main.Cabinet.STOMATOLOGY, false));
    return doctorsList;
    }
    }


