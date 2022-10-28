// package Code;

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

// public class Project {
//     public static void main(String[] args) throws IOException, InterruptedException {
//         int[] nums= new int[20];
//         Skele robot = new Skele();
//         final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//         double see = 0;
//         System.out.println("enter your name");
//         while (true){
            
//             int sum = 0;
            
//             if (in.ready()){
//                 if (in.readLine().equals("stop")) break;
//             }
            
//             for (int i : nums) {
//                 sum+=i;
//             }
//             if (sum>0) {
//                 see = sum/nums.length;
//             }
//             for (int i = 0; i < nums.length-1; i++) {
//                 nums[i]=nums[i+1];
//             }
//             nums[19] = robot.getSensorValue(1);
//             if (see>30){
//                 robot.jumpScare();
//                 Thread.sleep(500);
//             }
//             else{
//                 robot.turn(-1);
//             }
//         }
//         robot.disconnect();

//     }
// }
