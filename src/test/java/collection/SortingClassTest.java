package test.java.collection;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import main.java.collection.SortingClass;
import org.junit.Test;

/**
 * 정렬 클래스 테스트.
 */
public class SortingClassTest {

    private static final Integer[] ARRAYS = {2, 4, 5, 9, 3, 6, 7, 8, 2, 4, 9, 1, 4, 5, 9};

    private SortingClass sortingClass = new SortingClass();

    @Test
    public void getMaxElement() {
        int max = sortingClass.getMax(ARRAYS);
        assertThat(max, equalTo(9));
    }

    @Test
    public void getMinElement() {
        int min = sortingClass.getMin(ARRAYS);
        assertThat(min, equalTo(1));
    }

    @Test
    public void getCountOfNumber() {
        assertThat(sortingClass.getCountOfNumber(ARRAYS, 1), equalTo(1));
        assertThat(sortingClass.getCountOfNumber(ARRAYS, 2), equalTo(2));
        assertThat(sortingClass.getCountOfNumber(ARRAYS, 3), equalTo(1));
        assertThat(sortingClass.getCountOfNumber(ARRAYS, 5), equalTo(2));
        assertThat(sortingClass.getCountOfNumber(ARRAYS, 9), equalTo(3));
    }
}
