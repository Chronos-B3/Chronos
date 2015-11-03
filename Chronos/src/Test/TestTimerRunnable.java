/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import chronos.TimerRunnable;
import chronos.TimerThread;

/**
 *
 * @author sylvain
 */
public class TestTimerRunnable {
    static TimerThread temps = new TimerThread();
    public static void main(String[] args){
        
        
        System.out.println("---TEST DEBUT---");
        TimerRunnable timer = new TimerRunnable();

        Thread t1 = new Thread(timer);

        t1.start();
        temps.isLaunch = false;
    }
    
    public static boolean getLaunchValue(){
        return temps.isLaunch;
    }
}
