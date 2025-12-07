package Java8;


abstract class Service{
    abstract void sendMessage(String msg);
}

class EmailService extends Service{

    @Override
    void sendMessage(String msg) {
        System.out.println("Email service " + msg);
    }
}

class SMSService extends Service{

    @Override
    void sendMessage(String msg) {
        System.out.println("SMS service " + msg);
    }
}

class Notification{
    private Service service;

    public Notification(Service service){
        this.service = service;
    }
    //luc nay Notification se ko bi phu thuoc vao cai Service cu the nao ca
    public void sendNotify(String msg){
        service.sendMessage(msg);
    }
}

public class Main3 {
    public static void main(String[] args) {
        Notification notify = new Notification(new SMSService());
        notify.sendNotify("hoa");
    }
}
