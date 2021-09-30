package com.company.chainOfResponsibility;

public class WebServer {
    private Handler handler;

    public WebServer(Handler handler) {
        this.handler = handler;
    }

    public void handle(HttpRequest httpRequest){
        //Authentication
        //Logging
        //Compression
        handler.handle(httpRequest);



    }
}
