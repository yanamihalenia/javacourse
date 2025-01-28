package lesson8;

public abstract class Phone {

    public String phoneNumber;
    public int volume;
    public String melody;

    public Phone(String phoneNumber, int volume, String melody) {
        this.phoneNumber = phoneNumber;
        this.volume = volume;
        this.melody = melody;
    }

    public void call(String phoneNumber){
        System.out.println("Call to: " + phoneNumber);
    }

    public void play(int volume, String melody){
        System.out.println("Play melody with volume: " + volume);
        System.out.println("Play melody: " + melody);
    }

    public abstract int firmware();
}
