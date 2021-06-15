package com.fastLogging.entity;

public class LogEntity {

private String loggerName;
private String loggerCategory;

    public LogEntity(String loggerName, String loggerCategory){
        this.loggerName=loggerName;
        this.loggerCategory=loggerCategory;
    }

    public String toString(){//overriding the toString() method
        return loggerName +" "+loggerCategory;
    }

}


