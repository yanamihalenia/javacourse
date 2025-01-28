package lesson8;

public class ApplePhone extends Phone{

    public ApplePhone(String phoneNumber, int volume, String melody) {
        super(phoneNumber, volume, melody);
    }

    @Override
    public int firmware() {
        int version = 18;
        System.out.println("Apple phone version is: " + version);
        return version;
    }

}
