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
public class Timer {

    private Date currentTime;
    public Timer() {
        this.currentTime = new Date();
    }

    public Date getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(Date currentTime) {
        this.currentTime = currentTime;
    }
}
