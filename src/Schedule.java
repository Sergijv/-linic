import java.util.*;


public class Schedule  {

    private int userChoice=0;

    protected Map<String , Boolean > timeRegister = new TreeMap<>();
    Schedule(Boolean inMorningWorkTime){
        if(inMorningWorkTime){
            this.timeRegister.put("1. 08-09",true);
            this.timeRegister.put("2. 09-10",true);
            this.timeRegister.put("3. 10-11",true);
            this.timeRegister.put("4. 11-12",true);}
         else {
            this.timeRegister.put("5. 13-14",true);
            this.timeRegister.put("6. 14-15",true);
            this.timeRegister.put("7. 15-16",true);
            this.timeRegister.put("8. 16-17",true);
        }
    }
    int getNumberScheduleDoctor(){

        do {
            this.print();

            System.out.println("Choose number of DATE or press 0 to exit.");
            try {
                Scanner sc = new Scanner(System.in);
                userChoice = sc.nextInt();

            } catch (Exception e) {
                System.out.println("Wrong choice! Sorry!");
            }
            switch (userChoice){
                case 1: System.out.println("Your choice: " +"\"1. 08-09\"" ); break;
                case 2: System.out.println("Your choice: " +"\"2. 09-10\"" ); break;
                case 3: System.out.println("Your choice: " +"\"3. 10-11\"" ); break;
                case 4: System.out.println("Your choice: " +"\"4. 11-12\"" ); break;
                case 5: System.out.println("Your choice: " +"\"5. 13-14\"" ); break;
                case 6: System.out.println("Your choice: " +"\"6. 14-15\"" ); break;
                case 7: System.out.println("Your choice: " +"\"7. 15-16\"" ); break;
                case 8: System.out.println("Your choice: " +"\"8. 16-17\"" ); break;

            }

                break;   }
        while (! (userChoice==0));
        return userChoice;
    }

     void print(){
         for(Map.Entry<String, Boolean> pair : timeRegister.entrySet()){
             String key = pair.getKey();
             Object value = pair.getValue();
             System.out.println(key + " time is free: " + value);
         }

     }
  static void setDoctorsSchedule(int numberDate, Schedule doctorSchedule){
       switch (numberDate) {
           case 1: doctorSchedule.timeRegister.put("1. 08-09", false);   break;
           case 2: doctorSchedule.timeRegister.put("2. 09-10", false);   break;
           case 3: doctorSchedule.timeRegister.put("3. 10-11", false);   break;
           case 4: doctorSchedule.timeRegister.put("4. 11-12", false);   break;
           case 5: doctorSchedule.timeRegister.put("5. 13-14", false);   break;
           case 6: doctorSchedule.timeRegister.put("6. 14-15", false);   break;
           case 7: doctorSchedule.timeRegister.put("7. 15-16", false);   break;
           case 8: doctorSchedule.timeRegister.put("8. 16-17", false);   break;

       }
    }
 }
