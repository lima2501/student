package student;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Nome do aluno: ");
		String name = scan.nextLine();
		System.out.println("Digite as 3 notas trimestrais");
		Double grade1 = scan.nextDouble();
		Double grade2 = scan.nextDouble();
		Double grade3 = scan.nextDouble();

		Student student = new Student(name, grade1, grade2, grade3);

		System.out.println(student);

		if (student.finalGrade() < 60) {
			var missing = 60 - student.finalGrade();
			System.out.println("Faltando " + missing + " pontos");
		}

		scan.close();

	}
}
