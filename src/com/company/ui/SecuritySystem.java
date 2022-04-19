package com.company.ui;

public interface SecuritySystem {
    boolean isUserAuthorized(User user);
    boolean authorizeUser(String username, String password);
    User registerNewUser(String username, String password);
}
