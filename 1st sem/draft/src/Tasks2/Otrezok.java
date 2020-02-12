package Tasks2;

import Tasks1.WrongParametersException;

import java.util.Objects;

public class Otrezok {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int length;

    // конструктор
    public Otrezok(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.length = (int) Math.sqrt((this.x1 - this.x2)*(this.x1 - this.x2) + (this.y1 - this.y2)*(this.y1 - this.y2));
    }

    // вычисление длины отрезка (по сути геттер)
    public int calcLength() {
        return this.length;
    }

    // вычисление площади прямоугольника, у которого length - диагональ
    public int calcArea(double sin) {
        return (int) ((int) 0.5 * this.calcLength()*this.calcLength()*sin);
    }

    // переопределенные equals, toString и hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Otrezok otrezok = (Otrezok) o;
        return length == otrezok.length;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length);
    }

    @Override
    public String toString() {
        return "Отрезок длинной" + length;
    }
}
