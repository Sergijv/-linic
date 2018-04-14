import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Schedule  {

   protected Map<String , Boolean > timeRegister = new HashMap();
    Schedule(Boolean inMorningWorkTime){
        if(inMorningWorkTime){
            this.timeRegister.put("08-09",true);
            this.timeRegister.put("09-10",true);
            this.timeRegister.put("10-11",true);
            this.timeRegister.put("11-12",true);}
         else {
            this.timeRegister.put("12-13",true);
            this.timeRegister.put("13-14",true);
            this.timeRegister.put("14-15",true);
            this.timeRegister.put("16-17",true);
        }
    }
    void setScheduleDoctor(){
      //  System.out.println(this.toString());
    }

     void print(){
         Set<String> timeSet = this.timeRegister.keySet();
         for (int i=0; i<timeSet.size(); i++)
       //  System.out.print(timeSet.);
     }
 }
