public class Challenge {

    public static void main(String[] args) {

        int number = 0;
        int evenNumbersFoud = 0;

        while (evenNumbersFoud != 5) {
            if (!isEvenNumber(number)) {
                number++;
                continue;
            }
            evenNumbersFoud++;
            System.out.println("Even number " + number);
            number++;
        }

        System.out.println("Total even numbers found " + evenNumbersFoud);

    }

    private static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else return false;
    }
}
