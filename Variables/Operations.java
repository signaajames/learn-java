package Variables;

public class Operations {
    public static void main(String[] args) {

        int expression1 = 5 % 2 - (4 * 2 - 1);
        /*
            Parens, mult first then sub: 5 % 2 - 7
            Modulo, 1 - 7
            Result, -6
        */
//         System.out.println(expression1);

        int expression2 = (3 + (2 * 2 - 5)) + 6 - 5;
        /*
            Inner paren, 2 * 2 - 5, mult first: 4 - 5: -1
            Outer paren, 3 + -1: 2
            Moving left to right, 2 + 6 is 8, then 8 - 5 is 3
        */
//        System.out.println(expression2);

        int expression3 = 5 * 4 % 3 - 2 + 1;
        /*
            Since no parens, left to right and mult/modulo first
            5 * 4 % 3: 2
            2 - 2 + 1 is 1
        */
         System.out.println(expression3);

    }
}