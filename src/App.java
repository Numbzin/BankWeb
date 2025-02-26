import domain.model.Account;
import domain.model.Agency;
import domain.model.Person;

public class App {
    public static void main(String[] args) throws Exception {

        try {
            Agency agency = new Agency();
            Person person = new Person("NMB", "nmb@gmail.com", "(21) 99999-9999");
            Account account = new Account();

            agency.name = "DevWest";
            agency.number = "001";
            agency.email = "devwest@gmail.com";
            agency.tel = "+55 (21) 4002-8922";

            person.setCpf("111.222.444.99");
            // person.setName("");
            // person.setEmail("nmb@gmail.com");
            // person.setTel("+55 (21) 99457-0637");

            account.number = "100001";
            account.agency = agency;
            account.person = person;
            account.balance = 1000;

            System.out.println("Agencia : " + account.agency.name);
            System.out.println("Cliente : " + account.person.getName());
            System.out.println("Saldo : " + account.balance);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
