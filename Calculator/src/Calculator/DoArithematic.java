package Calculator;

public class DoArithematic {

	//todo: implement JUNIT for this method
	
	public double Add(double inputa, double inputb) {	
		return inputa + inputb;
	}
	public double Subtract(double inputa, double inputb) {
        return inputa - inputb;
    }

    public double Multiply(double inputa, double inputb) {
        return inputa * inputb;
    }

    public double Divide(double inputa, double inputb) {
        if (inputb == 0) {
            throw new ArithmeticException("/ by zero");
        }
                return inputa / inputb;
    }
}
