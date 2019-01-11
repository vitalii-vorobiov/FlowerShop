package users;

public class Admin implements User {
    private User user;

    // TODO: Correct Later
    public Admin(User user) {
        this.user = user;
    }

    @Override
    public String getPhoneNumber() {
        return user.getPhoneNumber();
    }

    @Override
    public String getUserName() {
        return user.getUsername();
    }

    @Override
    public String getUserEmail() {
        return user.getUserEmail();
    }

    public boolean AmIAdmin() {

    }

}
