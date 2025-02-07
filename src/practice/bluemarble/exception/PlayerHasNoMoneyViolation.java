package practice.bluemarble.exception;
// 20250207
public class PlayerHasNoMoneyViolation extends RuntimeException {
    public PlayerHasNoMoneyViolation(String playerName) {
        super("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n"
                + playerName + "님이 파산하셨습니다."
                + "\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n");
    }
}