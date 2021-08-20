package radioalarm;

public class RadioAlarm implements Radio, Alarm {
    @Override
    public void a() {
        System.out.println("Метод А");
    }

    @Override
    public void b() {
        System.out.println("Метод B");
    }
    @Override
    public void c() {
        System.out.println("Метод C");
    }
    @Override
    public void d() {
        System.out.println("Метод D");
    }
}
