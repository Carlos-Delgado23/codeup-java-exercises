package Practice.javaii;

public class TestIntClass {
    public static void main(String[] args) {
        IntClass intClass = new IntClass(34);
        IntClass intClass2 = new IntClass(4);
//        intClass.setValue(20);
//        intClass2.setValue(30);
        int[] numArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(IntClass.sumArray(numArray).getValue());

        System.out.println(intClass.calcSum(intClass));
        System.out.println(IntClass.calcSum(intClass, intClass2));
    }
}
