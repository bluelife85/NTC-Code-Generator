package steinhart;

import java.util.ArrayList;

public class SteinhartEquation {

	/**
	 * @see https://www.ametherm.com/thermistor/ntc-thermistors-steinhart-and-hart-equation
	 */
	
	
	private ArrayList<Double> Resistance;
	private ArrayList<Double> Temperature;
	
	private double[] L = new double[3];
	private double[] Y = new double[3];
	
	private double A,B,C;
	
	private double[] gamma = new double[2];
	
	public SteinhartEquation(ArrayList<Double> resistance, ArrayList<Double> temperature) {
		
		int index = 0;
		
		this.Resistance = resistance;
		this.Temperature = temperature;
		
		index = 0;
		
		for(Double res : Resistance) {
			
			L[index++] = Math.log(res);
		}
		
		index = 0;
		
		for(Double temp : Temperature) {
			
			Y[index++] = 1.0 / temp;
		}
		
		gamma[0] = (Y[1] - Y[0]) / (L[1] - L[0]);
		gamma[1] = (Y[2] - Y[0]) / (L[2] - L[0]);
		
		C = ((gamma[1] - gamma[0]) / (L[2] - L[1])) * Math.pow((L[0] + L[1] + L[2]), -1.0);
		B = gamma[0] - (C * (Math.pow(L[0], 2) + L[0] * L[1] + Math.pow(L[1], 2)));
		A = Y[0] - (L[0] * (B + C * Math.pow(L[0], 2)));
		
		System.out.println("A Coefficient : " + A);
		System.out.println("B Coefficient : " + B);
		System.out.println("C Coefficient : " + C);
	}
	
	public double getTemperature(double res) {
		
		double temp;
		double naturalLogarithm = Math.log(res);
		
		temp = A + B * naturalLogarithm + C * Math.pow(naturalLogarithm, 3);
		
		temp = 1.0 / temp;
		
		temp = temp - 273.15;
		
		return temp;
	}
}
