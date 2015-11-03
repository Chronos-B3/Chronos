/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chronos;

import java.util.Date;

/**
 *
 * @author Nautile
 */
public class Timer implements Runnable{

    private Date startTime;
    
    public Timer() {
        this.startTime = new Date();
    }

    public Date getCurrentTime() {
        return startTime;
    }

    public void setCurrentTime(Date currentTime) {
        this.startTime = currentTime;
    }

    @Override
    public void run() {
        //code
    }
    
    
}
