public class Reduce {
    public static void main(String[] args) {
        int steps = 0;
        int start = 100;

        while (start != 0) {
            if (start % 2 == 0) {
                start /= 2;
            }
            else {
                start -= 1;
            }

            steps++;
        }

        System.out.println(steps);
    }
}
