package heaps;

public class TopKFrequentApp {

    public static void main(String[] args) {
        TopKFrequentProblem t = new TopKFrequentProblem();
//        int[] array = {0,0,1,2,1,0};
//        t.topKFrequent(array, 2);

        int[] array2 = {0,3,0,1,2,1,0,3,3};
        t.topKFrequent(array2, 2);
    }
}
