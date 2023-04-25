package net.scl.dicj.converter.customException;

public class CustomException extends Exception{
    public String errorInfo;

    public CustomException(String errorInfo) {
        this.errorInfo = errorInfo;
    }

    public String getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }
}
