// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Replace this comment with your code
		int currentValue=Integer.parseInt(args[0]);		
		Double rate=Double.parseDouble(args[1]);
		rate=rate/100;
		int years=Integer.parseInt(args[2]);
		double dyears=years;
		Double dcurrentValue=(double)currentValue;
		Double futureValue=currentValue*(Math.pow(rate+1,dyears));
		System.out.println("After "+years+" years, $"+currentValue+" saved at "+rate*100+"% will yield $"+(int) futureValue.doubleValue());	
	}
}