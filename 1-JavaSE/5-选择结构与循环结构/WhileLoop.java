public class WhileLoop {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        while (i <= 100) {
            System.out.print(i + " ");
            sum += i;
            i++;
        }
        System.out.println("1到100的和为" + sum);
    }
}