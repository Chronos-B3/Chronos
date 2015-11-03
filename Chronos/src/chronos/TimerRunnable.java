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
public class TimerRunnable implements Runnable {

    Calendar calendar = Calendar.getInstance();
    private long startTime;
    javax.swing.JLabel jLabelAffichage;

    public TimerRunnable(javax.swing.JLabel jLabelAffichage) {
        this.startTime = System.currentTimeMillis();
        this.jLabelAffichage = jLabelAffichage;
    }

    //RAZ = Remise A Zero

    public void raz() {

    }

    @Override
    public void run() {
        loop();
    }
    
    public void loop(){
        while(true){
            try {
                if(Chronos.getStop()){
                    break;
                }
                long currentTime = System.currentTimeMillis();
                long yourmilliseconds = currentTime-startTime;
                SimpleDateFormat formatDate = new SimpleDateFormat("mm:ss");
                Date resultdate = new Date(yourmilliseconds);    
                jLabelAffichage.setText(formatDate.format(resultdate));
                //System.out.println(formatDate.format(resultdate));
                //System.out.println();
            } catch (Exception E) {
                System.err.println("erreur : " + E);
            }
        }
    }
}
