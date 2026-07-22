package entities;

public class Student {

	public String name;
	public int age;
	public double finalGrade;

	public double firstScore;
	public double secondScore;
	public double thirdScore;

	public void media() {

		this.finalGrade = (this.firstScore + this.secondScore + this.thirdScore);

	}

	public double missingPoints(double media) {

		double missing = 60 - media;

		return missing;

	}

}
