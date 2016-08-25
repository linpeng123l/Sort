import java.util.Random;

/**
 * Created by hws on 16/8/22.
 */
public class Data {


    public static int[] generateRandomData(int count, int maxNum) {
        int[] datas = new int[count];
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            datas[i] = random.nextInt(maxNum);
        }
//        PrintUtil.printArray("generate datas", datas);
        return datas;
    }

}
