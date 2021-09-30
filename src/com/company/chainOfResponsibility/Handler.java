package com.company.chainOfResponsibility;

public abstract class Handler {
    private Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    public void handle(HttpRequest request){
       if (doHandle(request))
           return;

       if(next != null)
       next.doHandle(request);
    }

    public abstract boolean doHandle(HttpRequest request);
}
