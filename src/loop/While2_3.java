package loop;

public class While2_3 {
    public static void main(String[] args) {
        int i = 10;
        int sum = 0;
        int endNum = 12;

        while (i <= endNum) {
            sum += i;
            System.out.println("i=" + i + " sum=" + sum);
            i++;
        }
    }
}
