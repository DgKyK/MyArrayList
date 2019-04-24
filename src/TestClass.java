import java.util.ArrayList;

public class TestClass {
    public static void main(String[] args) {
        MyList<Integer> testList = new MyArrayList<>();
        testList.add(1);
        testList.add(2);
        testList.add(3);
        testList.add(1, 10);
        System.out.println("TestList size : " + testList.size());
        for(Integer k : testList){
            System.out.println(k);
        }
        testList.clear();
        for(Integer k : testList){
            System.out.println(k);
        }
        System.out.println("TestList : " + testList.size());
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        System.out.println( "Arraylist : " + arrayList.size());
        arrayList.clear();
        System.out.println("Arraylist : " + arrayList.size());
    }
}
