package entities;

public class NaturalPerson extends TaxPayer {

	private Double medicalExpenses;

	public NaturalPerson() {
		super();
	}

	public NaturalPerson(String name, Double annualIncome, Double medicalExpenses) {
		super(name, annualIncome);
		this.medicalExpenses = medicalExpenses;
	}

	public Double getMedicalExpenses() {
		return this.medicalExpenses;
	}

	public void setMedicalExpenses(Double medicalDouble) {
		this.medicalExpenses = medicalDouble;
	}

	@Override
	public Double taxCalculation() {

		Double tax;
		Double medicalDiscount;

		if (getAnnualIncome() < 20000.00) {
			tax = (annualIncome * 0.15);
		} else {
			tax = (annualIncome * 0.25);
		}

		if (medicalExpenses != 0) {
			medicalDiscount = (medicalExpenses * 0.5);
			return (tax - medicalDiscount);
		} else {
			return tax;
		}

	}
}
