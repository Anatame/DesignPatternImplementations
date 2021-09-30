package com.company.template;

public class TaskExecutor {

    public void execute(Task task){
        AuditTrail.record(task);
        task.execute();
    }
}
