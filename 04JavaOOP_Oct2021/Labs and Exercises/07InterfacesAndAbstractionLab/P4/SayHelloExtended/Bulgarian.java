package day7.InterfacesAndAbstractionLab.P4.SayHelloExtended;

public class Bulgarian extends BasePerson {

    public Bulgarian(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Здравей";
    }
}
