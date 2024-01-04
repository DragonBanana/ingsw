package lab7.exx;

public class EmptyCell implements Cell {

    @Override
    public boolean isEmpty() {
        return true;
    }
    @Override
    public boolean equals(Cell cell) {
        return this.getClass() == cell.getClass();
    }

    @Override
    public String toString() {
        return "-";
    }
}
