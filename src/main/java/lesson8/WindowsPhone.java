package lesson8;

public class WindowsPhone extends Phone{

    public WindowsPhone(String phoneNumber, int volume, String melody) {
        super(phoneNumber, volume, melody);
    }

    @Override
    public int firmware() {
        int version = 10;
        System.out.println("Windows phone version is: " + version);
        return version;
    }

    public void call(String phoneNumber){
        System.out.println("Call to Windows phone: " + phoneNumber);
    }
}
