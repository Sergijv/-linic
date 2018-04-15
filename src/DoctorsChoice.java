import java.util.Scanner;

    class DoctorsChoice {
    private int userChoice = 0;
    private int increment;
    private Doctor doctorChange;
    private int numberOfDate=0;
    DoctorsChoice(){
        System.out.println("Which kind of doctor are you searching");
        System.out.println("in our Clinic work:");


     do { increment=1;
         for (Doctor doctor : Doctor.doctorsList) {
             System.out.println(increment + " : " + doctor.doctorName);
             increment++;
         }
         System.out.println("Choose number or press 0 to exit.");
         try {
             Scanner sc = new Scanner(System.in);
             userChoice = sc.nextInt();

         } catch (Exception e) {
             System.out.println("Wrong choice! Sorry!");
         }
         if (userChoice > Doctor.doctorsList.size() - 1 || userChoice < 0)
             System.out.println("Wrong choice! Try again please!");
         else {
             doctorChange=Doctor.doctorsList.get(userChoice - 1);
             System.out.println("Your choice: " + doctorChange.doctorName);
             numberOfDate=doctorChange.doctorsSchedule.getNumberScheduleDoctor();
             Schedule.setDoctorsSchedule(numberOfDate,doctorChange.doctorsSchedule);
             Doctor.doctorsList.set(userChoice - 1,doctorChange);
             doctorChange.doctorsSchedule.print();
             break;
         }
         }
        while (! (userChoice==0));
    }
}
