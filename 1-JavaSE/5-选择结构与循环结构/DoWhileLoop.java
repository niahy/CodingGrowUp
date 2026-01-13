public class DoWhileLoop{
    public static void main(String[] args){
        int i = 0;
        int sum = 0;
        do {
            System.out.print(i + " ");
            sum += i;
            i++;
        }while(i <= 100);
        System.out.println("1到100的和为" + sum);
    }
}