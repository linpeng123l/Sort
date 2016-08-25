import java.util.Arrays;

/**
 * Created by hws on 16/8/22.
 */
public interface Sort {

    void sort(int[] datas);

    static void main(String[] args) {
        int[] datas = Data.generateRandomData(8, 10);
        testSelectionSort(Arrays.copyOf(datas,datas.length));
        testSortionSort(Arrays.copyOf(datas,datas.length));
        testBubbleSort(Arrays.copyOf(datas,datas.length));
        testFastSort(Arrays.copyOf(datas,datas.length));
        testFastSort2(Arrays.copyOf(datas,datas.length));
        testMergeSort(Arrays.copyOf(datas,datas.length));
        testHeapSort(Arrays.copyOf(datas,datas.length));
    }

    static void testHeapSort(int[] datas) {
        Sort sort = new HeapSort();
        sort.sort(datas);
        PrintUtil.printArray("result:",datas);
    }

    static void testMergeSort(int[] datas) {
        Sort sort = new MergeSort();
        sort.sort(datas);
    }

    static void testFastSort(int[] datas) {
        Sort sort = new FastSort();
        sort.sort(datas);
    }


    static void testFastSort2(int[] datas) {
        Sort sort = new FastSort2();
        sort.sort(datas);
    }


    static void testBubbleSort(int[] datas) {
        Sort sort = new BubbleSort();
        sort.sort(datas);
    }

    static void testSelectionSort(int[] datas) {
        Sort sort = new SelectionSort();
        sort.sort(datas);
    }

    static void testSortionSort(int[] datas) {
        Sort sort = new InsertionSort();
        sort.sort(datas);
    }
}