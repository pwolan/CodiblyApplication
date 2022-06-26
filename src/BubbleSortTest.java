import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class BubbleSortTest {
    private BubbleSort bbs = new BubbleSort();
    @Test
    void case1() {

        List<Comparable> input = Arrays.asList(1, 4, 5, 6, 8, 3, 8);
        List<Comparable> expectedResult = Arrays.asList(1,3,4,5,6,8,8);

        List<Comparable> result = bbs.sort(input);
        assertEquals(expectedResult, result);

    }
    @Test
    void case2() {
        Number[] inputNumbers = new Number[]{-9.3, 0.2, 4, 0.1, 5, 9};
        List<Comparable> inputList =  new ArrayList<>();
        for(Number n : inputNumbers){
            inputList.add( n.doubleValue());
        }

        Number[] expectedNumbers = new Number[]{-9.3, 0.1, 0.2, 4, 5, 9};
        List<Comparable> expectedResult = new ArrayList<>();
        for(Number n : expectedNumbers){
            expectedResult.add( n.doubleValue());
        }


        List<Comparable> result = bbs.sort(inputList);
        assertEquals(expectedResult, result);
    }
    @Test
    public void case3(){
        List<Comparable> input = new ArrayList<>();
        List<Comparable> expectedResult = new ArrayList<>();

        List<Comparable> result = bbs.sort(input);
        assertEquals(expectedResult, result);
    }
    @Test
    public void case4(){
        List<Comparable> input = Arrays.asList(null,5.0001);
        List<Comparable> expectedResult = Arrays.asList(5.0001);

        List<Comparable> result = bbs.sort(input);
        assertEquals(expectedResult, result);
    }
    @Test
    public void case5(){
        assertThrows(RuntimeException.class, () -> bbs.sort(null));
    }

}

