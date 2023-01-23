public class Prime_numbers {
    public static void main(String[] args) {
        final int AMOUNT = 1001;
        boolean[] is_prime = new boolean[AMOUNT];
        for(int i = 0; i < AMOUNT; i++){
            is_prime[i] = true;
        }
        for(int i = 2; i < Math.sqrt(AMOUNT); i++){
            for(int j = 2; i*j < AMOUNT; j++){
                is_prime[i*j] = false;
            }
        }
        for(int i = 2; i < AMOUNT; i++){
            if(is_prime[i]){
                System.out.printf("%d ", i);
            }
        }
    }
}