package OOP;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Phone phone1 = new Phone("898888","sams");
        Phone phone2 = new Phone("89898989","Musm", 8.1);



        phone.setNumber("89219215878");
        phone.setModel("1112211");
        phone.setWeight(107);

        phone1.setNumber("8978887799");
        phone1.setModel("222111111");
        phone1.setWeight(112);

        System.out.println(phone.getNumber());
        System.out.println(phone.getModel());
        System.out.println(phone.getWeight());

        System.out.println(phone1.getNumber());
        System.out.println(phone1.getModel());
        System.out.println(phone1.getWeight());

        phone.receiveCall("Odin");
        phone1.receiveCall("Dwa");
        phone.receiveCall("Igor", "88888");
    }
}
