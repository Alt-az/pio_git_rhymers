package edu.kis.vh.nursery;

/**
 * bazowa klasa wyliczankowa
 */
public class DefaultCountingOutRhymer {

    private static final int START_SIZE_VALUE = -1;
    private static final int CAPACITY = 12;
    private static final int MAX_SIZE = 11;
    /**
     * tablica stosu
     */
    private final int[] numbers = new int[CAPACITY]; //final zrobiony wcześniej

    private int total = START_SIZE_VALUE;

    /**
     * @return zwraca wartosc startowa
     */
    public static int getStartSizeValue() {
        return START_SIZE_VALUE;
    }

    /**
     * @return zwraca capacity
     */
    public static int getCAPACITY() {
        return CAPACITY;
    }

    /**
     * @return zwraca maxsize
     */
    public static int getMaxSize() {
        return MAX_SIZE;
    }

    /**
     * @return zwraca total czyli szczyt stosu
     */
    public int getTotal() {
        return total;
    }

    /**
     * @param in wartość która chcemy wrzucić na stos
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * @return true jeśli stos jest pusty lub false w przeciwnym wypadku
     */
    public boolean callCheck() {
        return total == START_SIZE_VALUE;
    }

    /**
     * @return true jeśli stos jest pełny lub false w przeciwnym wypadku
     */
    public boolean isFull() {
        return total == MAX_SIZE;
    }

    /**
     * @return wyrzuca liczbę ze szczytu stosu bez jej calowitego wyciagania lub -1 jesli jest pusta
     */
    protected int peekaboo() {
        if (callCheck())
            return START_SIZE_VALUE;
        return numbers[total];
    }

    /**
     * @return wyciaga liczbę ze szczytu stosu i ja zwraca lub -1 jesli jest pusta
     */
    public int countOut() {
        if (callCheck())
            return START_SIZE_VALUE;
        return numbers[total--];
    }

    /**
     * @return zwraca stos numbers
     */
    public int[] getNumbers() {
        return numbers;
    }

}
