import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedWordsCounterTest {
    private BalancedWordsCounter bwc = new BalancedWordsCounter();
    @Test
    void case1() {
        String input = "aabbabcccba";
        int expectedResult = 28;
        int result = bwc.count(input);
        assertEquals(expectedResult, result);
    }
    @Test
    void case2() {
        String input = "";
        int expectedResult = 0;
        int result = bwc.count(input);
        assertEquals(expectedResult, result);
    }
    @Test
    void case3() {
        String input = "abababa1";
        assertThrows(RuntimeException.class, () -> bwc.count(input));
    }
    @Test
    void case4() {
        assertThrows(RuntimeException.class, () -> bwc.count(null));
    }
    @Test
    void  isBalanced(){
        String input = "aabb";
        boolean output = bwc.isBalanced(input);
        assertEquals(true, output);
    }
}