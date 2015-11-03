/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import chronos.TimerThread;

/**
 *
 * @author sylvain
 */
public class TestTimerThread {
    static TimerThread temps = new TimerThread();
    public static void main(String[] args){
        
        
        System.out.println("---TEST DEBUT---");
        System.out.println(temps);
        
        System.out.println("--START---");
        temps.start();
        
        System.out.println("---STOP---");
        temps.interrupt();
        
        System.out.println("---REDEMARER---");
        temps.run();
        
        System.out.println("---RAZ---");
        temps.raz();
        
        System.out.println(temps);
    }
    
    public static boolean getLaunchValue(){
        return temps.isLaunch;
    }
}
