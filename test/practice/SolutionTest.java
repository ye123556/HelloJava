package practice;
// 20250123
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    @Test
    void solution() {
        Solution s = new Solution();
        // 입출력 예시 1
        assertThat(s.solution(new int[]{5, 9, 7, 10},5).toString()).isEqualTo("[5, 10]");

        // 입출력 예시 2
        assertThat(s.solution(new int[]{2, 36, 1, 3},1).toString()).isEqualTo("[1, 2, 3, 36]");

        // 입출력 예시3
        assertThat(s.solution(new int[]{3, 2, 6}, 10).toString()).isEqualTo("[-1]");

    }
}
