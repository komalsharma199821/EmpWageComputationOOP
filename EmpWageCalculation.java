import java.util.*;
public class EmpWageCalculation {
     //use case 1
    public static int generateRandomNumber(){
         double x=Math.random();
        int y = (int) Math.round(x);
        return y;
    }
    
    public static String presenteeCheckForEmployee(int value){
        if(value==1){
            return "Employee is Present" ;
        }else{
            return "Employee is Absent" ;
        }
    }
    //use case 2
     public static int calculateEmpDailyWage( int wagePerHour, int workingHrs ){
        return ( wagePerHour * workingHrs );
    }

    public static void main(String args[]) {
       
      System.out.println("Welcome To Employee Wage Calculation Problem");
      // use case 1
      int randomValue = generateRandomNumber();
      
      String presenteeCheck = presenteeCheckForEmployee(randomValue);
      System.out.println("Is Employee Present ? "+presenteeCheck);
      
     //use case 2
	int empDailyWage = calculateEmpDailyWage(20,8);
      System.out.println("Employees Daily Wage : "+empDailyWage);

      
    }
}



