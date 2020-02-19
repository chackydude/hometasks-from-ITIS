public class ModifiedStringArrayIterator implements java.util.Iterator<String> {
    protected String[] data;
    protected int cursor = 0;

    // constructor
    public ModifiedStringArrayIterator(String[] data) {
        this.data = data;
    }

    // check next el
    public boolean hasNext() {
        if (cursor < data.length) {
            int cursorCheck = cursor;
            while (data[cursorCheck] == null && cursorCheck < data.length-2) {
                cursorCheck+=2;
            }
            if (data[cursorCheck] == null) {
                return false;
            } else return true;
        } else return false;
    };

    // returns next element
    public String next() {
        try {
            String el = data[cursor];
            while (el == null) {
                el = data[cursor+=2];
            }
            cursor += 2;
            return el;
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
    2) Доделать классную работу (логика c null)
    3) Переписать EndlessArray с итератором
    4) Итереатор первый-песледний-второй-предпоследний
    5) Итератор, который постоянно возвращает случайный элемент
 */