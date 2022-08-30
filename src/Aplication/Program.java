package Aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome do departamento: ");
		String department = sc.next();
		System.out.print("Dia do pagamento: ");		
		int payDay = sc.nextInt();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Telefone: ");
		String phone = sc.next();
		Department dept = new Department(department, payDay, new Address(email, phone));
		
		System.out.print("Quantos funcionários tem o departemento? ");
		int N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			System.out.printf("Dados do funcionário %d:\n", i);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salário: ");
			double salary = sc.nextDouble();
			
			dept.addEmployee(new Employee(name, salary));
		}

		System.out.println();
		showReport(dept);
		
		sc.close();
	}
	
	private static void showReport(Department dept) {
		System.out.println(dept);
	}
}
