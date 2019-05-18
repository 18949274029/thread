package paixu;

import com.alibaba.fastjson.JSON;

/**
 * Created by Administrator on 2019/4/5 0005.
 */
public class ShellTest {

    public static void shell(int[] data) {
        int temp;
        int jump = data.length / 2;
        int j;
        while (jump != 0) {
            for (int i = jump; i < data.length; i++) {
                temp = data[i];
                j = i - jump;
                while (j >= 0 && temp < data[j]) {
                    data[j + jump] = data[j];
                    j=j-jump;
                }
                data[j + jump] = temp;
            }
            jump = jump / 2;
            System.out.println(JSON.toJSON(data));
        }
    }


    public static void main(String[] args) {
        shell(new int[]{3, 2, 6, 8, 1,123,123,34,53,3});
    }
}
