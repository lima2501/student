package student;

public class Student {

	private String name;
	private Double grade1;
	private Double grade2;
	private Double grade3;

	public Student() {

	}

	public Student(String name, Double grade1, Double grade2, Double grade3) {
		this.name = name;
		this.grade1 = grade1;
		this.grade2 = grade2;
		this.grade3 = grade3;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getGrade1() {
		return grade1;
	}

	public void setGrade1(Double grade1) {
		this.grade1 = grade1;
	}

	public Double getGrade2() {
		return grade2;
	}

	public void setGrade2(Double grade2) {
		this.grade2 = grade2;
	}

	public Double getGrade3() {
		return grade3;
	}

	public void setGrade3(Double grade3) {
		this.grade3 = grade3;
	}

	public double finalGrade() {
		return grade1 + grade2 + grade3;
	}

	public String situation() {
		var finalGrade = this.finalGrade();
		var situation = "";

		if (finalGrade >= 60) {
			situation = "Aprovado";
		} else {
			situation = "Reprovado";
		}
		return situation;
	}

	@Override
	public String toString() {
		return "Nota final = " + String.format("%.2f", finalGrade()) + "\n" + situation();
	}

}
