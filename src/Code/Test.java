package Code;
import com.birdbraintechnologies.HummingbirdRobot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class Test{

    public static void main(String[] args) throws IOException, InterruptedException {
        HummingbirdRobot bot = new HummingbirdRobot();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int[] nums= new int[10];
        Thread.sleep(1000);
        while (true){

            if(in.ready())break;
            bot.setMotorVelocity(1, bot.getSensorValue(1));
            bot.setMotorVelocity(2, bot.getSensorValue(1));
            bot.setFullColorLED(1, bot.getSensorValue(2), bot.getSensorValue(2), bot.getSensorValue(2));
            bot.setFullColorLED(2, bot.getSensorValue(3), bot.getSensorValue(2), bot.getSensorValue(1));
            int sum = 0;
            for (int i : nums) {
                sum+=i;
            }
            if (sum>0) {
                if(sum/nums.length>30)System.out.println(true);
                else System.out.println(false);
            }
            else System.out.println(false);
            for (int i = 0; i < nums.length-1; i++) {
                nums[i]=nums[i+1];
            }
            nums[9] = bot.getSensorValue(2);
        }

        bot.disconnect();
    }

}