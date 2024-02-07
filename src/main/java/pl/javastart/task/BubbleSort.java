package pl.javastart.task;

public class BubbleSort {

    // ta metoda powinna sortować inputArray oraz zwracać informację o liczbie porównań, które były do tego potrzebne
    public int sort(int[] inputArray) {
        if (inputArray == null || inputArray.length <= 1) {
            return 0;
        }
        int comparisons = 0;
        int temp;
        boolean sorted = false;
        int lastElement = inputArray.length - 1;
        while (lastElement > 0 && !sorted) {
            sorted = true;
            for (int i = 0; i < lastElement; i++) {
                if (inputArray[i] > inputArray[i + 1]) {
                    sorted = false;
                    temp = inputArray[i];
                    inputArray[i] = inputArray[i + 1];
                    inputArray[i + 1] = temp;
                }
                comparisons++;
            }
            lastElement--;
        }
        return comparisons;
    }
}
