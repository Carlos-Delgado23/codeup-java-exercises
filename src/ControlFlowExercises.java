public class ControlFlowExercises {
    public static void main (String[] arg) {
//        WHILE     //
//        int i = 5;
//
//        while (i <= 15){
//            System.out.print(i + " ");
//            i++;
//        };


//        DO WHILE       //
//        int i = 0;
//        do {
//            System.out.println(i);
//            i+=2;
//        } while (i <= 100);

//        DO WHILE (count backwards by 5's from 100 to -10)       //
//        int i = 100;
//        do {
//            System.out.println(i);
//            i-=5;
//        } while (i >= -10);

//        DO WHILE      //
// loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000.//
         int i = 2;
         do {
             System.out.println(i);
            i = (int) Math.pow(i, 2);
         }while(i < 100000);

    }
}
