
@SuppressWarnings("ALL")
public class Main {
    public static int numberOfSteps(int num) {
        int steps = 0;
        return numberOfStepsCounter(num,steps);
    }
    public static int numberOfStepsCounter(int num, int steps) {
        if (!(num == 0)){
            if (num %2 ==1){
                num = num - 1;
                steps = steps +1;
                steps = numberOfStepsCounter(num, steps);
            } else {
                num = num / 2;
                steps = steps + 1;
                steps = numberOfStepsCounter(num, steps);
            }
        }
        return steps;
    }
    public static void main(String[] args) {
        int num = 14;
        System.out.println(numberOfSteps(num));
        int num2 = 11253;
        System.out.println(numberOfSteps(num2));
    }
}