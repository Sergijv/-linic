import java.util.List;

public class Main {

    protected enum  Cabinet{THERAPEUT, SURGERY, PEDIATRIC, STOMATOLOGY}


    public static void main(String[] args) {
        List<Doctor> doctorList = Doctor.createDoctors();

        Menu menu = new Menu();
    }
}
