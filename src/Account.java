import java.util.HashMap;
import java.util.Objects;
import java.util.TreeMap;

public class Account {
    private final long id;
    private final double money;
    public Account(long id, double money)
    {
        this.id = id;
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", money=" + money +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
