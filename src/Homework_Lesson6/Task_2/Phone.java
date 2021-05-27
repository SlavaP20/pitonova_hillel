package Homework_Lesson6.Task_2;

public class Phone {
    double spentGb;
    double callUkraine;
    double sms;
    double callAbroad1;
    double callAbroad2;
    double getPhoneBill;

    public Phone(double spentGb, double callUkraine, double sms, double callAbroad1, double getCallAbroad2) {
        this.spentGb = getCostInternet(spentGb);
        this.callUkraine = getCostCallUkraine(callUkraine);
        this.sms = getCostSms(sms);
        this.callAbroad1 = getCostCallAbroad1(callAbroad1);
        this.callAbroad2 = getCostCallAbroad2 (callAbroad2);
        getPhoneBill = getCostInternet(spentGb) + getCostCallUkraine(callUkraine) + getCostSms(sms) + getCostCallAbroad1(callAbroad1) + getCostCallAbroad2(callAbroad1);
}


    public double getCostInternet(double spentGb){
        if (spentGb < 8) {
            return 100;
        }
        else if (spentGb > 8) {
            return (spentGb - 8)  * 100 +100;
        } return spentGb;
}

    public double getCostCallUkraine(double callUkraine){
            if (callUkraine < 500) {
                return callUkraine*0.5;
            }

            else if (callUkraine>500) {
                return (callUkraine - 500) * 0.75;
            } return callUkraine;
    }

    public double getCostSms (double sms) {
        if (sms < 50) {
            return 1;
        }

        else if (sms>50) {
            return (sms-50) * 1.50;

    }return 0;}

    public double getCostCallAbroad1(double callAbroad1) {
        if (callAbroad1 >=1) {
            return callAbroad1*1.5;

        } else return 0;
    }



    public double getCostCallAbroad2 (double callAbroad2) {
        if (callAbroad2 > 1 ) {
            return callAbroad2 * 2;
        }  return 0;
    }
  public double getPhoneBill () {
return getPhoneBill = getCostInternet(spentGb) + getCostCallUkraine(callUkraine) + getCostSms(sms) + getCostCallAbroad1(callAbroad1) + getCostCallAbroad2(callAbroad1);
  }
}







