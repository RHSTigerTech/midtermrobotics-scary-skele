package Code;
import java.util.Date;

import com.birdbraintechnologies.HummingbirdRobot;

public class Skele extends HummingbirdRobot {
    private int patience;
    public Skele(){
        patience = 5;
    }
    public void move(int speed){
        setMotorVelocity(1, -speed);
        setMotorVelocity(2, -speed);
    }
    public void stop() {
        setMotorVelocity(1, 0);
        setMotorVelocity(2, 0);
    }
    public void jumpScare() {
        playTone(255, 10, 1000);
        setMotorVelocity(1, -255);
        setMotorVelocity(2, -255);
        setEyes(255, 0, 0);
    }
    public void turn(int dir, int time,String user) throws InterruptedException{
        long start = System.currentTimeMillis();
        long elapsedtime  = (new Date()).getTime() - start;
        while (elapsedtime < time && !see()){
            System.out.println(getSensorValue(1));
        elapsedtime = (new Date()).getTime() - start;
        
        setMotorVelocity(1, 125*dir);
        setMotorVelocity(2, -125*dir);
        }
        stop();
        if(see()){
            setEyes(255, 0, 0);
            System.out.println("I found you!!");
            speak("I found YOu");
            move(255);
            Thread.sleep(4000);
            
        }
        else{
            
            System.out.println("Did you lie to me "+user+"?");
            speak("Did you lie to me "+user+"?");
            patience--;
            Thread.sleep(2000);
            
        }
        stop();
    }
    public boolean see() {
        int sum = getSensorValue(1);
        // for (int i : nums) {
        //     sum+=i;
        // }
        // if (sum>0) {
        //     sum = sum/nums.length;
        // }
        return sum>80;
    }
    public void setEyes(int red,int green, int blue){
        setFullColorLED(1, red, green, blue);
        setFullColorLED(2, red, green, blue);
    }
    // public class See extends Thread{
    //     public void run(){
            
    //         while (true){
    //             try {
    //                 Thread.sleep(250);
    //             } catch (InterruptedException e) {
    //                 continue;
    //             }    
    //         for (int i = 0; i < nums.length-1; i++) {
    //             nums[i]=nums[i+1];
    //         }
    //         nums[19] =  getSensorValue(1);
    //         }
            
    //     }
    // }
    
}
