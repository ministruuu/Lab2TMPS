package Proxy.ProtectionProxy;

public class Main {
    public static void main(String[] args) {
        User user = new User(Role.USER);
        DatabaseAcces userAcces = new ProxyDatabaseAcces(user);
        userAcces.provideAcces();

        User admin = new User(Role.ADMIN);
        DatabaseAcces adminAcces = new ProxyDatabaseAcces(admin);
        adminAcces.provideAcces();

        User guest = new User(Role.GUEST);
        DatabaseAcces guestAcces = new ProxyDatabaseAcces(guest);
        guestAcces.provideAcces();
    }

}
