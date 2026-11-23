package solutionlab1;

/** Fixed-capacity integer array with insertion and search operations. */
public class ArrayyInt {
    private int[] a;
    private int currentNb;

    public ArrayyInt(int size) {
        if (size < 0) size = 0;
        a = new int[size];
        currentNb = 0;
    }

    public boolean isEmpty() {
        return currentNb == 0;
    }

    public boolean isFull() {
        return currentNb == a.length;
    }

    void InsertElementAtFront(int value) {
        if (isFull()) {
            System.out.println("Array is full.");
            return;
        }
        for (int i = currentNb; i > 0; i--) a[i] = a[i - 1];
        a[0] = value;
        currentNb++;
    }

    void InsertElementAtBack(int value) {
        if (isFull()) {
            System.out.println("Array is full.");
            return;
        }
        a[currentNb] = value;
        currentNb++;
    }

    void InsertElementAtPosition(int position, int value) {
        if (isFull()) {
            System.out.println("Array is full.");
            return;
        }
        if (position < 1 || position > currentNb + 1) {
            System.out.println("Invalid position.");
            return;
        }
        for (int i = currentNb; i >= position; i--) a[i] = a[i - 1];
        a[position - 1] = value;
        currentNb++;
    }

    void Display() {
        System.out.print("Array: ");
        for (int i = 0; i < currentNb; i++) System.out.print(a[i] + " ");
        System.out.println();
    }

    public int SearchValue(int value) {
        for (int i = 0; i < currentNb; i++) {
            if (a[i] == value) return i;
        }
        return -1;
    }

    public boolean DeleteElement(int value) {
        int index = SearchValue(value);
        if (index == -1) return false;
        for (int i = index; i < currentNb - 1; i++) a[i] = a[i + 1];
        currentNb--;
        return true;
    }

    public double AverageofEvenNb() {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < currentNb; i++) {
            if (a[i] % 2 == 0) {
                sum += a[i];
                count++;
            }
        }
        if (count == 0) return 0;
        return (double) sum / count;
    }

    void MultiplesOfEvenThree() {
        System.out.print("Even multiples of 3: ");
        boolean found = false;
        for (int i = 0; i < currentNb; i++) {
            if (a[i] % 2 == 0 && a[i] % 3 == 0) {
                System.out.print(a[i] + " ");
                found = true;
            }
        }
        if (!found) System.out.print("None");
        System.out.println();
    }

    public int OccurrenceNb(int number) {
        int count = 0;
        for (int i = 0; i < currentNb; i++) if (a[i] == number) count++;
        return count;
    }

    public boolean Palindrome() {
        for (int i = 0; i < currentNb / 2; i++) {
            if (a[i] != a[currentNb - 1 - i]) return false;
        }
        return true;
    }

    public int FindSecondMaximum() {
        if (currentNb < 2) return -1;
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < currentNb; i++) {
            int value = a[i];
            if (value > max) {
                second = max;
                max = value;
            } else if (value < max && value > second) {
                second = value;
            }
        }
        if (second == Integer.MIN_VALUE) return -1;
        return second;
    }

    void EvenOrOdd() {
        int even = 0;
        int odd = 0;
        for (int i = 0; i < currentNb; i++) {
            if (a[i] % 2 == 0) even++;
            else odd++;
        }
        if (even > odd) System.out.println("There are more even numbers.");
        else if (odd > even) System.out.println("There are more odd numbers.");
        else System.out.println("Even and odd counts are equal.");
    }

    void DeleteMultipleOfOddThree() {
        int i = 0;
        while (i < currentNb) {
            if (a[i] % 2 != 0 && a[i] % 3 == 0) {
                int deleted = a[i];
                for (int j = i; j < currentNb - 1; j++) a[j] = a[j + 1];
                currentNb--;
                System.out.println("Deleted value: " + deleted);
            } else i++;
        }
    }

    public boolean linearsearch(int searched) {
        return SearchValue(searched) != -1;
    }

    void SelectionSort() {
        for (int i = 0; i < currentNb - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < currentNb; j++) {
                if (a[j] < a[minIndex]) minIndex = j;
            }
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
    }
}
