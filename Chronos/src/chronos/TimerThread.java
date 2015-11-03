/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chronos;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Nautile
 */
public class TimerThread extends Thread{

    private Date startTime;
    
    public TimerThread() {
        this.startTime = new Date();
    }
    
    //RAZ = Remise A Zero
    public void raz(){
        
    }
    
    @Override
    public void run(){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startTime);
        int hours = calendar.get(Calendar.HOUR_OF_DAY);
        int minutes = calendar.get(Calendar.MINUTE);
        int seconds = calendar.get(Calendar.SECOND);
        while(true){
            try{
                calendar.setTime(new Date());
            int currentHours = calendar.get(Calendar.HOUR_OF_DAY);
            int currentMinutes = calendar.get(Calendar.MINUTE);
            int currentSeconds = calendar.get(Calendar.SECOND);
                System.out.println((currentHours-hours)+":"+(currentMinutes-minutes)+":"+(currentSeconds-seconds));
            }
            catch(Exception E){
                System.err.println("erreur : " + E);
            }
        }
    }
}
