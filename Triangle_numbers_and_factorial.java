public class Triangle_numbers_and_factorial {
    public static void main(String[] args) {
        int n = 5;
        int factorial = 1;
        for(int i = 2; i <= n; i++){
            factorial *= i;
        }
        System.out.printf("%d\n%d\n",n*(n+1)/2,factorial);
    }
}
