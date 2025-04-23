package exception.basic.checked;

public class CheckedCatchMain {
    public static void main(String[] args) {
        Svc svc = new Svc();
        svc.callCatch();
        System.out.println("정상 종료");
    }
}
