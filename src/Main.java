import java.util.List;

public class Main {



    protected enum  Cabinet{THERAPEUTIC, SURGERY, PEDIATRIC, DENTISTRY}
    final static int cabinetQuantity=4;
    static List<Doctor> doctorList;
    static void cabinetPrint(){
        System.out.println("1. "+ Main.Cabinet.THERAPEUTIC);
        System.out.println("2. "+ Cabinet.SURGERY);
        System.out.println("3. "+ Cabinet.PEDIATRIC);
        System.out.println("4. "+ Cabinet.DENTISTRY);
    }
    static Cabinet cabinetName(int cabinetNumber) {
        switch (cabinetNumber) {
            case 1: return Cabinet.THERAPEUTIC;
            case 2: return Cabinet.SURGERY;
            case 3: return Cabinet.PEDIATRIC;
            case 4: return Cabinet.DENTISTRY;
        }
        return null;
    }

    public static void main(String[] args) {
        doctorList = Doctor.createDoctors();

        Menu menu = new Menu();
    }
}
