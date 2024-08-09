public class PrintF {
    public static void main(String[] args) {
        final int num = 12;
        final String name = "ray";
        final char grade = 'A';
        final double kd = 7.5;

        System.out.printf("hello mr. %s , you are leveled up by grade %c Rank %d", name, grade, num);
        System.out.printf("with k/d: %f", kd);
    }
}
