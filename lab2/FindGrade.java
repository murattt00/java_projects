public class FindGrade {
    public static void main(String[] args){
        if(args.length > 0) {
            int Grade = Integer.parseInt(args[0]);
            if (100 >= Grade && Grade >= 0) {
                if (Grade >= 90) {
                    System.out.println("Your grade is A");
                } else if (Grade >= 80) {
                    System.out.println("Your grade is B");
                } else if (Grade >= 70) {
                    System.out.println("Your grade is C");
                } else if (Grade >= 60) {
                    System.out.println("Your grade is D");
                } else {
                    System.out.println("Your grade is F");
                }
            } else {
                System.out.println("It is not a valid score!");
            }
        }
    }
}
