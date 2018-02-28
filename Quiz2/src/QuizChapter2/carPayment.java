package QuizChapter2;
import java.lang.Math;
import java.text.DecimalFormat;
public class carPayment {
	
	double carCost;
	double downPayment; 
	int loanLength; 
	double interestRate;
	DecimalFormat df = new DecimalFormat("###.##");
	
	public carPayment(double carCost, double downPayment, int loanLength, double interestRate) {
		this.carCost = carCost;
		this.downPayment = downPayment;
		this.loanLength = loanLength;
		this.interestRate = interestRate;
	}

	public double getCarCost() {
		return carCost;
	}
	public void setCarCost(double carCost) {
		this.carCost = carCost;
	}
	public double getDownPayment() {
		return downPayment;
	}
	public void setDownPayment(double downPayment) {
		this.downPayment = downPayment;
	}
	public int getLoanLength() {
		return loanLength;
	}
	public void setLoanLength(int loanLength) {
		this.loanLength = loanLength;
	}  
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public String MonthlyPayment(double carCost, double downPayment, int loanLength, double interestRate)
	{ 
		// method for calculating monthly car payment that returns monthlyPayment. 
		// Calculation = monthly cost including compounded interest 
		double monthlyPayment = ((carCost - downPayment) * interestRate / 12 * (Math.pow( ( 1 + interestRate / 12 ), loanLength))/((Math.pow(1 + interestRate / 12, loanLength)) - 1));
		return df.format(monthlyPayment);
	}
	
	public double InterestPayment(double carCost, double downPayment, int loanLength, double interestRate, double MonthlyPayment)
	{
		//method for calculating total spent on interest over the term of the loan
		// 
		double interestPayment = (MonthlyPayment * loanLength) - (carCost - downPayment);
		return interestPayment;
	}
	
	
}

