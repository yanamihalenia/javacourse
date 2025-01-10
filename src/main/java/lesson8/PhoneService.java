package lesson8;

public class PhoneService {

    public void check(Phone phone){
        System.out.println("Start checking:");
        phone.call(phone.phoneNumber);
        phone.play(phone.volume, phone.melody);
        phone.firmware();
        System.out.println("Finish checking.");
    }
}
