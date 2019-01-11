package users;

import lombok.Builder;

public class MyFacebookUser implements User {
    private FacebookUser = fu;

    public MyFacebookUser(FacebookUser fu) {
        this.fu = fu;
    }

    @Override
    public String getPhoneNumber() {
        return fu.getPhone();
    }

    @Override
    public String getUserName() {
        return fu.getName();
    }

    @Override
    public String getEmail() {
        return fu.getEmail();
    }
}
