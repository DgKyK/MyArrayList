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
        try {
            testList.remove(5);
        }catch(UnsupportedOperationException e){
            e.printStackTrace();
        }
        for(Integer k : testList){
            System.out.println(k);
        }
        System.out.println("TestList : " + testList.size());
    }
}
