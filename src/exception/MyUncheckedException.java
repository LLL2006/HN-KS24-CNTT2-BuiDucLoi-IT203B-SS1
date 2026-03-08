package exception;

public class MyUncheckedException extends RuntimeException{
    private int code;
    public MyUncheckedException(String message){
        super(message);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
