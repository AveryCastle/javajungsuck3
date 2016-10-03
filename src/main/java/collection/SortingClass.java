package main.java.collection;

/**
 * 정렬 클래스.
 * http://www.informit.com/articles/article.aspx?p=368648&seqNum=4.
 */
public class SortingClass {

    public int getMin(Integer[] array) {
        int min = array[0];
        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }

    public int getMax(Integer[] array) {
        int max = array[0];
        for (int element : array) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    public int getCountOfNumber(Integer[] array, int number) {
        int count = 0;
        for (int element: array) {
            if (element == number) {
                count++;
            }
        }
        return count;
    }
}
