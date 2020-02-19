public class ModifiedStringArrayIterator implements java.util.Iterator<String> {
    protected String[] data;
    // +2
    protected int cursor;

    // constructor
    public ModifiedStringArrayIterator(String[] data) {
        this.data = data;
    }

    // check next element
    public boolean hasNext() {
        String element = data[cursor];
        int cursor2 = cursor;
        while (element == null) {
            cursor2 += 2;
            element = data[cursor2];
        }
        return data.length > cursor2;
    };

    // returns next element
    public String next() {
        try {
            String element = data[cursor];
            while (element == null) {
                cursor += 2;
                element = data[cursor];
            }
            return element;
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            throw new java.util.NoSuchElementException();
        }
    }
}
// cursor
//  |
// "a" "b" "null" "d" "null" "e" "f"
/* HW: (на след неделю)
    1) APIшки
    2) Доделать классную работу
    3) Переписать EndlessArray с итератором
    4) Итереатор первый-песледний-второй-предпоследний
    5) Итератор, который постоянно возвращает случайный элемент
 */