package com.company.ui;

public class SecuritySystemImpl implements SecuritySystem{
    @Override
    public boolean isUserAuthorized(User user) {
        return false;
    }

    @Override
    public boolean authorizeUser(String username, String password) {
        return false;
    }

    @Override
    public User registerNewUser(String username, String password) {
        return null;
    }
}
