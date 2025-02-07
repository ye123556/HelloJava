package practice.bluemarble.exception;
// 20250207
public class BankruptPlayerViolation extends RuntimeException {
    public BankruptPlayerViolation(String playerName) {
        super(playerName + "님이 파산하였습니다.");
    }
}
