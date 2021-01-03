package circuit;

public class CircuitCalculator {

	private double Resistance;
	private long Resolution;
	
	public CircuitCalculator(double resistance, long resolution) {
		
		this.Resistance = resistance;
		this.Resolution = resolution;
	}
	
	public double getResistance(long adc) {
		
		double result;
		
		result = ((this.Resistance * this.Resolution) / adc) - this.Resistance;
		
		return result;
	}
}
