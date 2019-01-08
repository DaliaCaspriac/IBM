package patricia.errorhandlingwithexceptions;

public class Main {
    public static void print(StringList list){
        int n = list.size();
        for(int i =0; i < n; i++){
           try {
               String x = list.get(i);
               System.out.print(x + " ");
           }
           catch (MyException e){
               System.out.println(e.getMessage());
           }
        }
    }
    public static void main(String[] args) {
        StringList list = new StringList();
        String[] numbers = {"13","29"};
        try{
            list.add("13");
            list.add("29");
            list.add("192");
            System.out.println(list.contains("29"));
            System.out.println(list.containsAll(numbers));
        }catch (MyException e){
            System.out.println(e.getMessage());
        }
        //print(list);

        String[] operations = list.getOperations();
        for(int i = 0; i < list.getOperationsSize(); i++){
            System.out.print(operations[i]);
        }
    }
}
