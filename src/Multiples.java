public class Multiples {
    public static void main(String[] args) {
        int i = 1;
        int count = 0;

        while (i < 1000) {
            boolean multipleOf3 = i % 3 == 0;
            boolean multipleOf5 = i % 5 == 0;

            if (multipleOf3 || multipleOf5){
                count ++;
            }
            i ++;
        }

        System.out.println(count);
    }
}