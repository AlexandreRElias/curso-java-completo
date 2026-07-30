package entities;

public class BusinesEntity extends TaxPayer {

	private Integer employeeCount;
	
	public BusinesEntity() {
	}
	
	public BusinesEntity(String name, Double annualIncome, Integer employeeCount) {
		super(name, annualIncome);
		this.employeeCount = employeeCount;
	}

	public BusinesEntity(Integer employeeCount) {
		super();
		this.employeeCount = employeeCount;
	}

	public Integer getEmployeeCount() {
		return employeeCount;
	}

	public void setEmployeeCount(Integer employeeCount) {
		this.employeeCount = employeeCount;
	}


	@Override
	public Double taxCalculation() {
	
		if (employeeCount <= 10) {
			return annualIncome * 0.16;
		} else {
			return annualIncome * 0.14;
		}
	}
}
