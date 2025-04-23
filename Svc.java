package exception.basic.checked;

public class Svc {
    Client client = new Client();

    //예외를 잡아 처리하는 코드
    public void callCatch(){
        try {
            client.call();
        } catch (MyCheckedEx e) {
            //예외 처리 로직
            System.out.println("예외 처리, message = " + e.getMessage());
        }
        System.out.println("정상 흐름");
    }
    // 예외를 잡지 않고 밖으로 던지는 코드 (그렇게 하려면 throws 예외를 메소드에 필수로 선언해야한다.)
    public void catchThrow() throws MyCheckedEx {
        client.call();
    }
}
