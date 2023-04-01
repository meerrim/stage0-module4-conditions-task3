package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {

        if (salary < 0) {
            System.out.println("wrong input!");
            return;
        }

        double taxRate;
        if (salary <= 10000) {
            taxRate = 0.15;
        } else if (salary <= 20000) {
            taxRate = 0.18;
        } else {
            taxRate = 0.20;
        }
        double salaryAfterTaxes = salary - (salary * taxRate);
        System.out.println(salaryAfterTaxes);
    }
}
