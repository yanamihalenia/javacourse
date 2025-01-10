package lesson8;

public class AndroidPhone extends Phone{

    public AndroidPhone(String phoneNumber, int volume, String melody) {
        super(phoneNumber, volume, melody);
    }

    @Override
    public int firmware() {
        int version = 14;
        System.out.println("Android phone version is: " + version);
        return version;
    }
}
