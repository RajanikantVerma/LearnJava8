package co.beans;

public class LambdaEmployee {
	private int empId;
	private String EmpName;
	public LambdaEmployee(int empId, String empName) {
		this.empId = empId;
		EmpName = empName;
	}
	public static int empComp(LambdaEmployee E1 , LambdaEmployee E2) {
		return E1.EmpName.compareTo(E2.EmpName);
	}

}
