package com.bridgelabz;

public class MoodAnalyzerException extends Exception{
    enum ExceptionType{
        NullType, EmptyType
    }
    ExceptionType type;
    public MoodAnalyzerException(String sms, ExceptionType type){
        super(sms);
        this.type = type;
    }
}