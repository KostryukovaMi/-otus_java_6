import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        Account account1 = new Account(12304567841L, 214.5);
        Account account2 = new Account(12304567842L, 1214.5);
        Account account3 = new Account(12304567843L, 5214.5);
        Client client1 = new Client("Кострюкова Мария Игоревна", 24);
        Client client2 = new Client("Иванов Иван Иванович", 14);
        Client client3 = new Client("Петров Петр Петрович", 50);
        Map<Account, Client> accountToClientMap = new HashMap<>();
        Map<Client, List<Account>> clientToAccountMap = new HashMap<>();
        accountToClientMap.put(account1, client1);
        accountToClientMap.put(account2, client1);
        accountToClientMap.put(account3, client2);
        Account searchAccount = new Account(12304567841L, 214.5);
        Client client = accountToClientMap.get(searchAccount);
        clientToAccountMap.put(client1, Arrays.asList(account1, account2));
        Client searchClient = new Client("Кострюкова Мария Игоревна", 24);
        List<Account> accounts = clientToAccountMap.get(searchClient);
        System.out.println(client);
        System.out.println(accounts);
    }
}
