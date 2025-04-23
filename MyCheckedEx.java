package exception.basic.checked;

/**
 * Exception을 상속받은 예외는 체크 예외
 */
public class MyCheckedEx extends Exception{
    public MyCheckedEx(String message) {
        super(message);
    }
}
