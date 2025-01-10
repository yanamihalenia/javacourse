package lesson8;

public class MainApplication {
    public static void main(String[] args){

        PhoneService service = new PhoneService();
        Phone apple = new ApplePhone("+375123456373", 5, "birds");
        Phone android = new AndroidPhone("+79801404949", 3, "ring");
        Phone windows = new WindowsPhone("+38076548738", 9, "guitar");

        service.check(apple);
        service.check(android);
        service.check(windows);

        Phone anonymPhone = new Phone("+79850447766", 7, "piano") {
            @Override
            public int firmware() {
                int version = 5;
                return version;
            }
        };

        service.check(anonymPhone);

    }
}
