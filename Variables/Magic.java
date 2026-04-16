package Variables;

public class Magic {
    public static void main(String[] args)  {
        int myNumber =  15; //Original number

        int step1 = myNumber * myNumber;

        int stepTwo = step1 + myNumber;

        int stepThree = stepTwo / myNumber;

        int stepFour = stepThree + 17;

        int stepFive = stepFour - myNumber;

        int stepSix =  stepFive / 6;

        System.out.println(stepSix);
    }
}
