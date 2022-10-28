package Code;

import com.birdbraintechnologies.HummingbirdRobot;

public class PracticeBot extends HummingbirdRobot{


    
    public void blink(int port, int numBlinks)throws InterruptedException{
        for (int i = 0; i < numBlinks; i++) {
            setLED(port, 255);
            Thread.sleep(500);
            setLED(port, 0);
            Thread.sleep(500);
            
        }
    }
}
