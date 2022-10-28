package Code;

import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        Skele robot = new Skele();
        String user;
        while(!robot.see()){

        }
        robot.setEyes(111, 111, 111);
        robot.speak("Whats your name?");
        System.out.println("Whats your name?");
        
        Thread.sleep(2000);
        user = input.nextLine().toUpperCase()+"-imus";
        while(true){
            robot.setEyes(0, 255, 0);
            robot.speak("Where Are You "+user+"?");
            System.out.println("where are you "+user+".[l/r]");
            Thread.sleep(2000);
            String in = input.nextLine(); 
            if (in.equals("e"))break;
            if (in.equals("l") ){
                
                robot.turn(1, 2000,user);
                
                robot.stop();
            }else{
                robot.turn(-1, 2000,user);
                
                robot.stop();
            }
            robot.setEyes(0, 255, 0);
        }
        robot.disconnect();
    }
}
