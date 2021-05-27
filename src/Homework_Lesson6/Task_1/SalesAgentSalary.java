package Homework_Lesson6.Task_1;

public class SalesAgentSalary {
    int hours; //входящие часы
    double rate; //обычная ставка
    double experience; //стаж работы
    int numberOfSales; //количество продаж
    double sumOfSales; //сумма продаж
    double getSalary1;
    double getSalary2;
    int hoursWithoutOvertime = hours > 160 ? 160 : hours;


    public SalesAgentSalary(int hours, double rate) {
        this.hours = hours;
        this.rate = getBonus1(rate);
        getSalary1 = getBonus1(rate);
    }


    public double getBonus1(double rate) {
        if (hours > 160) {
            return rate = (hours - 160) * rate * 1.5;
        }
        return 0;
    }

    public double getSalary1() {
        return getSalary1 = getBonus1(rate) * hours;
    }


    public SalesAgentSalary(int hours, double rate, int experience, int numberOfSales, double sumOfSales) {
        this.hours = hours;
        this.rate = getBonus2(rate);
        this.experience = getAllExperience(experience);
        this.numberOfSales = getAllNumberOfAllSales(numberOfSales);
        this.sumOfSales = getAllSumOfSales(sumOfSales);

        getSalary2 = getBonus2(rate) * hours * hoursWithoutOvertime + getAllExperience(experience) + getAllNumberOfAllSales(numberOfSales) + getAllSumOfSales(sumOfSales);

    }

    public double getBonus2(double rate) {
        if (hours > 160) {
            return (hours - 160) * rate * 1.5;
        }
        return 0;
    }

    public double getAllExperience(int experience) {
        if (experience < 2) {
            return 1;
        } else if (experience < 4) {
            return 1.2;

        } else if (experience < 6) {
            return 1.3;
        } else {
            return 1.4;
        }

    }

    public int getAllNumberOfAllSales(int numberOfSales) {
        if (numberOfSales > 20) {
            return 250;
        } else if (numberOfSales < 10) {
            return -150;
        } else return 0;
    }


    public double getAllSumOfSales(double sumOfSales) {
        if (sumOfSales > 1500) {
            return 600;
        } else {
            return 0;
        }


    }

    public double getSalary2() {
        return getSalary2 = getBonus2(rate) * hours + getAllExperience((int) experience) + getAllNumberOfAllSales(numberOfSales) + getAllSumOfSales(sumOfSales);

    }
}


