package Homework_Lesson6.Task_2;

public class getPhoneBill {
    public static void main(String[] args) {
        Phone phone = new Phone(1,  2,4,6,5);
        phone.getPhoneBill();
        System.out.println(phone.getPhoneBill());
        double PhoneBillNal =  phone.getPhoneBill() + phone.getPhoneBill()/100*7;
        System.out.println("С налогом:" + PhoneBillNal );

    }
}
