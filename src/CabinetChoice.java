import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class CabinetChoice {
    private List<Doctor> cabinetDoctors = new ArrayList<>();
    private Doctor cabDoctor;
    private int numberOfDate;

    private int userChoice=0;
    private Main.Cabinet cabinetChoice=null;

    CabinetChoice(){
        System.out.println("Which kind of cabinet are you searching");
        System.out.println("In our Clinic we have:");
        Main.cabinetPrint();
        do{
            try {
               Scanner sc = new Scanner(System.in);
               userChoice = sc.nextInt();

            } catch (Exception e) { System.out.println("Wrong choice! Sorry!"); }

          if (userChoice > Main.cabinetQuantity || userChoice < 0)
            System.out.println("Wrong choice! Try again please!");
            else {cabinetChoice=Main.cabinetName(userChoice);
              for (Doctor doc: Main.doctorList ) {
                 if (doc.specialty==cabinetChoice) cabinetDoctors.add(doc);
              }
            }
          }
        while (userChoice==0);
        System.out.println("Where are next Doctors:");
        for (Doctor doc: cabinetDoctors ) {
            System.out.print(cabinetDoctors.indexOf(doc)+": ");
            System.out.println(doc.doctorName);
            doc.doctorsSchedule.print();
        }
        System.out.println("Input number of Doctor:");
        do {
            try {
                Scanner sc = new Scanner(System.in);
                userChoice = sc.nextInt();
                cabDoctor = cabinetDoctors.get(userChoice);
            } catch (Exception e) {
                System.out.println("Wrong choice! Sorry!");
            }

        }
        while (userChoice<0||userChoice>cabinetDoctors.size()-1);
         System.out.println("Your choice: " + cabDoctor.doctorName);
        numberOfDate=cabDoctor.doctorsSchedule.getNumberScheduleDoctor();
        Schedule.setDoctorsSchedule(numberOfDate,cabDoctor.doctorsSchedule);

        Doctor.doctorsList.set(cabDoctor.doctorNumber ,cabDoctor);
        cabDoctor.doctorsSchedule.print();
    }
}
