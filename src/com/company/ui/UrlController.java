package com.company.ui;

import com.company.text.Text;

import java.util.Objects;

public class UrlController {
    private final User user;
    private final String domain;
    private final SecuritySystem securitySystem = new SecuritySystemImpl();

    private final TextConverterPage textConverterPage = new TextConverterPage();
    private final LoginPage loginPage = new LoginPage(securitySystem);

    public UrlController(User user, String domain) {
        this.user = user;
        this.domain = domain;
    }

    public Page loadPage(String url, Object... parameter) {
        if (Objects.equals(url, domain + "/text_converter")) {
            if (securitySystem.isUserAuthorized(user)) {
                return textConverterPage;
            } else {
                return loginPage;
            }
        } else if (Objects.equals(url, domain + "/login")) {
            return loginPage;
        }
        return new NotFoundPage();
    }

    public Page submitText(String url, Text text) {
        if (Objects.equals(url, domain + "/text_converter")) {
            textConverterPage.addText(text);
        }
        return textConverterPage;
    }
}
