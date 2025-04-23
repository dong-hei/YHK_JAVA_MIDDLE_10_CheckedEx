package exception.basic.checked;

public class CheckedThrowMain {
    public static void main(String[] args) throws MyCheckedEx {
        Svc svc = new Svc();
        svc.catchThrow(); //main에서 해결을 못하면 자바가 예외 경로를 출력하면서 종료
        System.out.println("정상 종료");
    }
}
