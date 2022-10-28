package Code;

public class Blink {
    public static void main(String[] args) throws InterruptedException{
        PracticeBot robot = new PracticeBot();
        robot.blink(1, 5);
        robot.speak("wee");
        robot.disconnect();
    }
    public static int random(){
        return (int)Math.random()*255;
       
        
    }
    
}
