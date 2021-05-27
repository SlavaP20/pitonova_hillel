package Homework_Lesson6.Task_1;

import Homework_Lesson6.Task_1.SalesAgentSalary;

public class SalaryCalculation {
    public static void main(String[] args) {
        SalesAgentSalary salesAgentSalary = new SalesAgentSalary(161, 2.5);
        salesAgentSalary.getSalary1();
        System.out.println(salesAgentSalary.getSalary1);
        SalesAgentSalary salesAgentSalary2 = new SalesAgentSalary(162,6,3, 5, 9);
        salesAgentSalary.getSalary2();
       System.out.println(salesAgentSalary.getSalary2);

    }
}
