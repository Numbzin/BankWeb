import Domain.model.Agency;
import Domain.model.Person;
import Domain.model.Account;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Agency agency = new Agency();
        Person person = new Person();

        Account account = new Account();

        agency.name = "DevWest";
        agency.number = "001";
        agency.email = "devwest@gmail.com";
        agency.tel = "+55 (21) 4002-8922";

        person.cpf = "111.222.444.99";
        person.name = "NMB";
        person.tel = "+55 (21) 99457-0637";
        person.email = "nmb@gmail.com";

        account.number = "100001";
    }
}
