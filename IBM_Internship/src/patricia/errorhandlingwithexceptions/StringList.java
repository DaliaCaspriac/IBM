package patricia.errorhandlingwithexceptions;


public class StringList implements MyList<String> {
    private Integer[] integers;
    private int size;
    private int capacity = 20;
    private String[] operations;
    private int operationsSize;

    public StringList() {
        integers = new Integer[capacity];
        operations = new String[capacity];

    }

    @Override
    public String get(int index) throws MyException {
        if (index >= size)
            throw new MyException("The index we try to read from the list is out of bounds");
        operations[operationsSize++] = "Get " + index + "\n";
        return String.valueOf(integers[index].intValue());
    }

    @Override
    public void add(String elem) throws MyException {
        if (size == capacity) {
            increaseCapacity();
        }
        if (elem.equals("") || null == elem)
            throw new MyException("The added value is null or empty");
        try {
            integers[size++] = Integer.parseInt(elem);
            operations[operationsSize++] = "Add " + elem + "\n";
        } catch (NumberFormatException e) {
            throw new MyException("The added value is not a string representation of a number");
        }
    }

    @Override
    public boolean contains(String elem) throws MyException {
        try {
            Integer number = Integer.parseInt(elem);
            for (int i = 0; i < size; i++) {
                if (integers[i] == number) {
                    operations[operationsSize++] = "Contains " + elem + "\n";
                    return true;
                }
            }
        } catch (NumberFormatException e) {
            throw new MyException("The value is not a string representation of a number");
        }
        return false;
    }

    @Override
    public boolean containsAll(String[] elems) throws MyException {
        for (int i = 0; i < elems.length; i++) {
            try {
                if (!contains(elems[i]))
                    return false;
            } catch (MyException e) {
                throw new MyException("The value is not a string representation");
            }
        }
        operations[operationsSize++] = "ContainsAll \n";
        return true;
    }

    @Override
    public int size() {
        operations[operationsSize ++] = "Size " + size + "\n";
        return this.size;
    }

    @Override
    public void increaseCapacity() {
        operations[operationsSize++] = "Increase capacity \n";
        Integer[] newArray = new Integer[capacity * 2];
        for(int i = 0; i < size; i++){
            newArray[i] = integers[i];
        }
        integers = newArray;
    }

    public String[] getOperations(){
        return operations;
    }

    public int getOperationsSize(){
        return  operationsSize;
    }


}
