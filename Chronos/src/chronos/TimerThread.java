/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chronos;

import Test.TestTimerThread;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Nautile
 */
public class TimerThread extends Thread {

    Calendar calendar = Calendar.getInstance();
    private long startTime;
    public boolean isLaunch;

    public TimerThread() {
        this.startTime = System.currentTimeMillis();
        this.isLaunch = true;
    }

    //RAZ = Remise A Zero

    public void raz() {

    }

    @Override
    public void run() {
        loop();
    }
    
    public void loop(){
        while(TestTimerThread.getLaunchValue()){
            try {
                long currentTime = System.currentTimeMillis();
                long yourmilliseconds = currentTime-startTime;
                SimpleDateFormat formatDate = new SimpleDateFormat("mm:ss");
                Date resultdate = new Date(yourmilliseconds);              
                System.out.println(formatDate.format(resultdate));
                System.out.println();
            } catch (Exception E) {
                System.err.println("erreur : " + E);
            }
        }
    }
}
