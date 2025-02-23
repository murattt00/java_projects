public class GCDLoop {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int grater = (a > b) ? a : b;
        int smaller = (a < b) ? a : b;
        System.out.println("GCD between " + grater + " and " + smaller + " is " + gcd(grater, smaller));
    }
        public static int gcd(int g, int s) {
        int remainder = g % s;
        while(remainder != 0){
            g = s;
            s = remainder;
            remainder = g % s;
        }
        return s;
        }



    }

