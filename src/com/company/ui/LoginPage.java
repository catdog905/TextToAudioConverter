package com.company.ui;

import com.company.file.File;
import com.company.file.HtmlLayout;

import java.util.List;

public class LoginPage implements Page {

    private final SecuritySystem securitySystem;

    public LoginPage(SecuritySystem securitySystem) {
        this.securitySystem = securitySystem;
    }

    public void loginUser(String login, String password){
        securitySystem.authorizeUser(login, password);
    }

    public User registerNewUser(String username, String password) {
        return securitySystem.registerNewUser(username, password);
    }

    @Override
    public HtmlLayout getPageLayout() {
        return null;
    }

    @Override
    public List<File> getResources() {
        return null;
    }
}
