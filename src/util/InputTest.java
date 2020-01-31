package util;


public class InputTest {
    public static void main(String[] args){
        Input input = new Input();
        input.getInt("Type a number within the set range: ", 3, 5);
        input.getDouble("Now a number with a decimal: ", 4.5, 8.9);
        System.out.println(input.yesNo("Build a snowman?"));
    }
}
