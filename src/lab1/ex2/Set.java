package lab1.ex2;

public class Set {

    public int[] values;
    public int currentSize;

    public Set(int size) {
        this.values = new int[size];
        this.currentSize = 0;
    }

    public boolean isMember(int element) {
//        for (int valueElement: values) {
//            if(valueElement == element) {
//                return true;
//            }
//            return false;
//        }
        for (int i=0; i<this.currentSize; i++) {
            if(values[i] == element) {
                return true;
            }
        }
        return false;
    }

    public void add(int element) {
        if(this.isMember(element)) {
            return;
        }
        this.values[currentSize] = element;
        this.currentSize++;
    }

    public void remove(int element) {
        if(this.isMember(element)) {
            for(int i = 0; i < this.currentSize; i++) {
                if(this.values[i] == element) {
                    this.values[i] = this.values[currentSize - 1];
                    currentSize--;
                    return;
                }
            }
        }
    }

    @Override
    public String toString() {
        String result = "{";
        for(int i = 0; i < this.currentSize; i++) {
            result = result + this.values[i] + ",";
        }
        result += "}";
        return result;
    }
}
