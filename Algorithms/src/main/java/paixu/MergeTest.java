package paixu;

import com.alibaba.fastjson.JSON;

/**
 * 归并排序算法
 * Created by Administrator on 2019/4/5 0005.
 */
public class MergeTest {
    public static void merge(int[] data) {
        int length = data.length;
        int[] result = new int[length];
        int block, start;
        int buchang = 2;
        for (block = 1; block < length; block *= buchang) {
            for (start = 0; start < length; start += buchang * block) {
                int low = start;
                int mid = (start + block) < length ? (start + block) : length;
                int high = (start + buchang * block) < length ? (start + buchang * block) : length;
                //两个块的起始坐标和结束坐标
                int start1 = low, end1 = mid;
                int start2 = mid, end2 = high;
                System.out.println(start1+"=="+end1+">>>"+start2+"=="+end2);
                //开始对两个块进行归并排序
                while (start1 < end1 && start2 < end2) {
                    result[low++] = data[start1] < data[start2] ? data[start1++] : data[start2++];
                }
                while (start1 < end1) {
                    result[low++] = data[start1++];
                }
                while (start2 < end2) {
                    result[low++] = data[start2++];
                }
                System.out.println(JSON.toJSON(result));
            }
            int[] temp = data;
            data = result;
            result = temp;
            System.out.println("下一次块: "+JSON.toJSON(data));
        }
        System.out.println(JSON.toJSON(data));
    }


    public static void main(String[] args) {
        merge(new int[]{3, 2, 6, 8, 1, 123});
    }
}
