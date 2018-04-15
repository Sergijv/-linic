import java.util.ArrayList;
import java.util.List;

class Doctor {
    static List <Doctor> doctorsList= new ArrayList<>();
    private static int count=0;
    int doctorNumber;
    String doctorName;
    Main.Cabinet specialty;
    Schedule doctorsSchedule;
    private Doctor(String doctorName,Main.Cabinet specialty,Boolean inMorningWorkTime){
        doctorNumber=count;
        count++;
        this.doctorName=doctorName;
        this.specialty=specialty;
        this.doctorsSchedule = new Schedule(inMorningWorkTime);
    }
    static List<Doctor> createDoctors() {
        //List<Doctor> doctorsList = new ArrayList<>();
        doctorsList.add(new Doctor("Ivanov T.O.", Main.Cabinet.THERAPEUTIC, true));
        doctorsList.add(new Doctor("Petrov S.A.", Main.Cabinet.THERAPEUTIC, false));

        doctorsList.add(new Doctor("Bojcuk O.V.", Main.Cabinet.SURGERY, true));
        doctorsList.add(new Doctor("Melnyk O.M.", Main.Cabinet.SURGERY, false));

        doctorsList.add(new Doctor("Denysenko A.D.", Main.Cabinet.PEDIATRIC, true));
        doctorsList.add(new Doctor("Adam K.P.", Main.Cabinet.PEDIATRIC, false));

        doctorsList.add(new Doctor("Kozak A.S.", Main.Cabinet.DENTISTRY, true));
        doctorsList.add(new Doctor("Pysanka J.T.", Main.Cabinet.DENTISTRY, false));
    return doctorsList;
    }
    }


