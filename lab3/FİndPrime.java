public class FİndPrime {
    public static void main(String[] args){
        int max = Integer.parseInt(args[0]);
        for(int i = 2; i < max ;i++){
            boolean isPrime = true;
            for (int divisor = 2; divisor < i ;divisor++){
                if (i % divisor == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(i + ",");
            }
        }
    }
}
