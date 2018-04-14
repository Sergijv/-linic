import java.util.Scanner;

public class Menu {

    public Menu(){
        int userChoise = 0;
        String[] questions = new String[3];

           questions[0] = "Do you want to quite? Input '0'";
           questions[1] = "Are you searching a doctor? Input '1'";
           questions[2] = "Are you searching a cabinet? Input '2'";
//start

     do {


         for (String question : questions) {System.out.println(question);}

         try {
             Scanner sc = new Scanner(System.in);
             userChoise = sc.nextInt();

             }
         catch (Exception e) {
             System.out.println("Wrong choice! Sorry!");
             }
         if (userChoise > questions.length - 1 || userChoise < 0)
             System.out.println("Wrong choice! Try again please!");
         switch (userChoise) {
             case 1 :
                 System.out.println("Doctor choice");
                 new  DoctorsChoice();
                 break;
             case 2 :
                 System.out.println("Cabinet choice");
                 new CabinetChoice();
                 break;
         }
     }
     while (! (userChoise==0));
     System.out.println("Good bay");
}
}

