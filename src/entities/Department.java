package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {
	
	private String name;
	private int payDay;
	
	public Address address;
	public List<Employee> employees = new ArrayList<>();
	
	public Department() {
	}
	
	public Department(String name, int payDay, Address address) {
		this.name = name;
		this.payDay = payDay;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPayDay() {
		return payDay;
	}
	
	public void setPayDay(int payDay) {
		this.payDay = payDay;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}	

	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
	public void removeEmployee(Employee employee) {
		employees.remove(employee);
	}
	
	public double payroll() {
		double sum = 0.0;
		for(Employee e : employees) {
			sum += e.getSalary();
		}
		return sum;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("FOLHA DE PAGAMENTO:\n");
		sb.append(String.format("Departamento Vendas = R$ %.2f%n", payroll()));
		sb.append(String.format("Pagamento realizado no dia %d%n", getPayDay()));
		sb.append("Funcionários:\n");
		for(Employee e : employees) {
			sb.append(e.getName() + "\n");
		}
		sb.append(String.format("Para dúvidas favor entrar em contato: %s", address.getEmail()));
		return sb.toString();
	}
}
