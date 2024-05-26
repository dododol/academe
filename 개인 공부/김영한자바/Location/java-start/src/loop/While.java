package loop;

public class While {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int endNum = 3;

        sum = sum + i;
        System.out.println("i=" + i + " sum=" + sum);
        i++;

        sum = sum + i;
        System.out.println("i=" + i + " sum=" + sum);
        i++;

        sum = sum + i;
        System.out.println("i+" + i + " sum=" + sum);
        i++;
    }
}
