import java.util.Scanner;

public class DoctorsChoice {
    int userChoice = 0;
    int increment=1;
    DoctorsChoice(){
        System.out.println("Which kind of doctor are you searching");
        System.out.println("in our Clinic work:");


     do {
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
         System.out.println("Your choice: "+ Doctor.doctorsList.get(userChoice-1).doctorName);
         //exit while???

     }
        while (! (userChoice==0));
    }
}
