package Proxy.ProtectionProxy;

public class ProxyDatabaseAcces implements DatabaseAcces{
    private User user;

    public ProxyDatabaseAcces(User user) {
        this.user = user;
    }

    @Override
    public void provideAcces() {
        RealDatabaseAcces acces;

        if (isUser()) {
            acces = new RealDatabaseAcces(user);
            acces.provideAcces();
        }

        if (isAdmin()) {
            acces = new RealDatabaseAcces(user);
            acces.provideAcces();
        }

        if (isGuest()) {
            System.out.println("Access denied! GUEST" );
        }
    }

    private boolean isUser(){
        return user.getRole() == Role.USER;
    }

    private boolean isAdmin(){
        return user.getRole() == Role.ADMIN;
    }

    private boolean isGuest(){
        return user.getRole() == Role.GUEST;
    }

}
