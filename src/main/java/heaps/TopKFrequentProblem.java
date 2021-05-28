package heaps;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 Initial approach - create a map from the int to the number of times we see it.
 Create a new object that contains the data and the frequency.
 Add that into a maxHeap (PriorityQueue?) and then pluck off k items from the heap.

 Space: O(M) where M are the number of unique items in the array (creating Map and then Heap of that M size)
 Time: O(N + M) where n are the items in the array, where m is the size of the map (no greater than N, most likely less)
 */
public class TopKFrequentProblem {
    public int[] topKFrequent(int[] nums, int k) {

        int[] kFrequentElements = new int[k];
        Map<Integer, Integer> frequencyMap = mapFrequency(nums);
        PriorityQueue<DataWithFrequency> heap = createMaxHeap(frequencyMap);

        for (int i=0; i <= k-1; i++) {
            DataWithFrequency data_with_frequency = heap.remove();
            int data = data_with_frequency.data;
            kFrequentElements[i] = data;
        }

        return kFrequentElements;
    }

    public class DataWithFrequency {
        public int data;
        public int frequency;

        public DataWithFrequency(int data, int frequency) {
            this.data = data;
            this.frequency = frequency;
        }
    }

    private PriorityQueue<DataWithFrequency> createMaxHeap(Map<Integer, Integer> frequencyMap) {
        PriorityQueue<DataWithFrequency> heap = new PriorityQueue<>(frequencyMap.size(), new DataWithFrequencyComparator());
        for (Map.Entry<Integer,Integer> entry : frequencyMap.entrySet()) {
            DataWithFrequency data_frequency = new DataWithFrequency(entry.getKey(), entry.getValue());
            heap.add(data_frequency);
        }

        return heap;
    }

    class DataWithFrequencyComparator implements Comparator<DataWithFrequency> {

        // Overriding compare()method of Comparator
        // for descending order of cgpa
        public int compare(DataWithFrequency d1, DataWithFrequency d2) {
            if (d1.frequency < d2.frequency)
                return 1;
            else if (d1.frequency > d2.frequency)
                return -1;
            return 0;
        }
    }

    private Map<Integer, Integer> mapFrequency(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap();
        for (int num: nums) {
            Integer frequency = frequencyMap.getOrDefault(num, 0);
            frequencyMap.put(num, frequency + 1);
        }
        return frequencyMap;
    }
}
