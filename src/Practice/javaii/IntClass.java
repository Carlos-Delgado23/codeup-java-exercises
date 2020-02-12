package Practice.javaii;

public class IntClass {
    private int value;

//    public IntClass(){}
    public IntClass(int val){
        this.value = val;
    }

    public int getValue() { return this.value; }
    public void setValue(int value) { this.value = value; }

    public int calcSum(IntClass myInt){
        return this.value + myInt.getValue();
    }

    public static int calcSum(IntClass valOne, IntClass valTwo){
        return valOne.getValue() + valTwo.getValue();
    }

    public static IntClass sumArray(int[] x){
        int sum = 0;
        for (int numbers : x){
            sum += numbers;
        }

        return new IntClass(sum);
    }


}
