package day07.practice;

/**
 * packageName    : day07.practice
 * fileName       : BankAccount
 * author         : hoho
 * date           : 4/17/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 4/17/24        hoho       최초 생성
 * <p>
 * - 은행 계좌를 관리하는 `BankAccount` 클래스를 만드세요.
 * - 계좌 잔액(balance), 계좌 번호(accountNumber), 계좌 주인의 이름(accountHolder) 필드를 private로 선언하세요.
 * - 잔액 조회, 입금, 출금 메소드를 public으로 만들어 외부에서 접근할 수 있게 하세요.
 * - 출금 메소드는 잔액이 출금하려는 금액보다 클 때만 돈을 출금할 수 있도록 하세요.
 */
public class BankAccount {
    private int balance;
    private String accountNumber;
    private String accountHolder;

    public BankAccount(String accountNumber, String accountHolder, int balance) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public int withdraw(int balance) {
        if (this.balance > balance) {
            this.balance -= balance;
            System.out.println("출금 금액 : " + balance + "원, 통장 잔고 : " + this.balance + "원");
            return balance;
        } else {
            System.out.println("잔액이 부족합니다.");
        }
        return 0;
    }

    public int getBalance() {
        System.out.println("통장 잔고 : " + this.balance + "원");
        return balance;
    }

    public void deposit(int balance) {
        if (balance > 0) {
            this.balance += balance;
            System.out.println("입금 금액 : " + balance + "원, 통장 잔고 : " + this.balance + "원");
        } else {
            System.out.println("정해진 범위를 준수해주세요!");
        }
    }
}
