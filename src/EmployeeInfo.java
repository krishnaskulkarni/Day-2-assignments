import java.util.*;
class EmployeeInfo
{
	
	int id;
	String name;
	int monthlyBasic;
	
	EmployeeInfo(int a,String b,int c){
		id = a;
		name = b;
		monthlyBasic = c;
	}
	public int getAnnualBasic(){
		int annualBasic;
		annualBasic = 12* monthlyBasic;
		return annualBasic;
	}

	public int getMonthlyGrossSalary(){
		int monthlyGrossSalary =  monthlyBasic + (monthlyBasic/2) + 1250 +800;
		return monthlyGrossSalary;
	}

	public int getAnnualGrossSalary(){
		int annualGrossSalary = 12* getMonthlyGrossSalary();
		return annualGrossSalary;
	}

	public int getMonthlyDeductions(){
			if(0.10*monthlyBasic < 6500 ){
				int monthlyDeductions = (int)0.10*monthlyBasic + (int)0.0475*monthlyBasic + 50;
				return monthlyDeductions;
			}
			else{
				int monthlyDeductions = 6500 + (int)0.0475*monthlyBasic + 100;
				return monthlyDeductions;
			}	
			
	}

	public int getMonthlyTakeHome(){
		int monthlyTakeHome = getMonthlyGrossSalary()- getMonthlyDeductions();
		return monthlyTakeHome;
	}

	public int getAnnualTakeHome(){
		int annualTakeHome = 12* getMonthlyTakeHome();
		return annualTakeHome;
	}		
}
