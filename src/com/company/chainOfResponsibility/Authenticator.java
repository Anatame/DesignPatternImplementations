package com.company.chainOfResponsibility;

public class Authenticator extends Handler{
    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {

        System.out.println("Authentication");
        return !(request.getUsername().equals("admin") &&
                request.getPassword().equals("1234"));
    }
}
