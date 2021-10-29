public class SimpleCalculator {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("Add = " + calculator.getAdditionResult());
        System.out.println("Subtract = " + calculator.getSubtractResult());

        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(4.02);
        System.out.printf("Multiplication = " + calculator.getMultiplicationResult());
        System.out.println("Division = " + calculator.getDivisionResult());
    }

    private double firstNumber;
    private double secondNumber;


    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }

    public double getFirstNumber(){
        return firstNumber;
    }
    public double getSecondNumber(){
        return secondNumber;
    }
    public double getAdditionResult(){
        return (firstNumber + secondNumber);
    }
    public double getSubtractResult(){
//        double validNumber <= firstNumber;
//        if(validNumber != 0){return
        return (firstNumber - secondNumber);
    }
    public double getMultiplicationResult(){
        return (firstNumber * secondNumber);
    }
    public double getDivisionResult(){
        // if(secondNumber == 0) return 0;
        // return firstNumber/secondNumber;
        return (secondNumber == 0 )? 0: firstNumber/secondNumber;
    }


}

