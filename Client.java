package exception.basic.checked;

public class Client  {
    public void call() throws MyCheckedEx{
        //문제 발생 (예외도 객체라서 new로 생성해야한다.)
        throw new MyCheckedEx("ex");
    }
}
