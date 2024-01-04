package lab7.exx;

public class CrossCell implements Cell{

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean equals(Cell cell) {
        return this.getClass() == cell.getClass();
    }

    @Override
    public String toString() {
        return "X";
    }
}
