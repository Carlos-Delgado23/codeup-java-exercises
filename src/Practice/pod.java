package Practice;



public class pod {
        public static boolean sameAscii(String a, String b) {
            int valA = 0, valB = 0;
            for(char cA : a.toCharArray()){
                valA+=(int) cA;
            }
            for(char cB : b.toCharArray()){
                valB+=(int) cB;
            }
            return valA==valB;
        }
        public static boolean isAvgWhole(int[] arr) {
        int sum = 0;
        for (int n : arr) {
            sum += n;
        }

        return sum % arr.length == 0;
    }
    public static boolean magic(String str) {
        String[] temp = str.split(" ");

        int d = Integer.parseInt(temp[0]);
        int m = Integer.parseInt(temp[1]);
        int y = Integer.parseInt(temp[2]);

        return (d*m==y%1000||d*m==y%100||d*m==y%10);
    }

}
