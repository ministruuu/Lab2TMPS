package Proxy.ProtectionProxy;

public class RealDatabaseAcces implements DatabaseAcces{
    private User user;

    public RealDatabaseAcces(User user) {
        this.user = user;
    }

    @Override
    public void provideAcces() {
        System.out.println("Access confirmed: " + user.getRole());
    }
}
