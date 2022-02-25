package pl.javastart.task;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class BubbleSortTest {

    private final BubbleSort bubbleSort = new BubbleSort();

    @Test
    void shouldSortSortedArray() {
        // given
        int[] inputArray = {1, 2, 3, 4, 5};

        // when
        int compares = bubbleSort.sort(inputArray);

        // then
        assertThat(inputArray).isEqualTo(new int[]{1, 2, 3, 4, 5});
        assertThat(compares).isEqualTo(4);
    }

    @Test
    void shouldSortReversedArray() {
        // given
        int[] inputArray = {5, 4, 3, 2, 1};

        // when
        int compares = bubbleSort.sort(inputArray);

        // then
        assertThat(inputArray).isEqualTo(new int[]{1, 2, 3, 4, 5});
        assertThat(compares).isEqualTo(10);
    }

    @Test
    void shouldSortSortedArrayFrom1To99() {
        // given
        int[] inputArray = Stream.iterate(1, i -> i + 1).limit(99).mapToInt(i -> i).toArray();

        // when
        int compares = bubbleSort.sort(inputArray);

        // then
        assertThat(inputArray).isEqualTo(inputArray);
        assertThat(compares).isEqualTo(98);
    }

    @Test
    void shouldSortSortedArrayFrom99To1() {
        // given
        int[] inputArray = Stream.iterate(99, i -> i - 1).limit(99).mapToInt(i -> i).toArray();

        // when
        int compares = bubbleSort.sort(inputArray);

        // then
        int[] expectedResult = Stream.iterate(1, i -> i + 1).limit(99).mapToInt(i -> i).toArray();
        assertThat(inputArray).isEqualTo(expectedResult);
        assertThat(compares).isEqualTo(4851);
    }

    @Test
    void shouldSortExampleArray() {
        // given
        int[] inputArray = {5, 2, 3, 1, 4};

        // when
        int compares = bubbleSort.sort(inputArray);

        // then
        assertThat(inputArray).isEqualTo(new int[]{1, 2, 3, 4, 5});
        assertThat(compares).isEqualTo(10);
    }
}
