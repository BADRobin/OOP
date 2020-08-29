package com.javalessons.firststep.exeptions;

public class InvalidInputParamException extends RuntimeException{

    public InvalidInputParamException(){

    }
    public InvalidInputParamException(String massege){
        super(massege);
    }
    public InvalidInputParamException(String massege, Throwable cause){
        super(massege, cause);

    }
    public InvalidInputParamException(Throwable cause){
        super(cause);
    }
}
