/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chronos;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Nautile
 */
public class TimerThread extends Thread {

    private Date startTime;

    public TimerThread() {
        this.startTime = new Date();
    }

    //RAZ = Remise A Zero

    public void raz() {

    }

    @Override
    public void run() {
        Calendar calendar = Calendar.getInstance();
        long startTime = System.currentTimeMillis();
        while (true) {
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
