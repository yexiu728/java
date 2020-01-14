package day0;
// https://blog.csdn.net/weixin_41190227/article/details/86600821

import java.util.Arrays;

// 排序算法
public class Sort {
    public static void main(String[] args) {
        int[] array = {4, 1, 3, 5, 2};

        // bubbleSort(array);
        // selectionSort(array);
        insertionSort(array);
        // shellSort(array);
        // array = mergeSort(array);
        // array = quickSort(array, 0, array.length - 1);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }

    // 1、冒泡排序（后面的先排序，提升式排序）
    public static int[] bubbleSort(int[] array) {
        // 控制结束位置，因为后面的已经排序了
        for (int i = 0; i < array.length; i++) {
            // 从起始位置出发，遍历每一个元素
            for (int j = 0; j < array.length - 1 - i; j++) {
                // 一旦前面的元素大于后面的元素，则交换位置
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    // 2、选择排序（前面的先排序，选择到最小的元素再加入）
    public static int[] selectionSort(int[] array) {
        // 控制起始位置，因为前面的已经排好序了
        for(int i = 0; i < array.length; i++) {
            // 记录未排序区域的最小值索引
            int minIndex = i;
            // 由起始位置到最后，记录最小值的索引
            for(int j = i; j < array.length; j++) {
                // 如果未排序区有更小元素，更新最小值索引
                if(array[minIndex] >  array[j]) {
                    minIndex = j;
                }
            }
            // 将最小值与未排序区域的开头元素交换，已排序区域跟着i 增大
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }

        return array;
    }


    // 3、插入排序（前面的先排序，插入到已排序区域）
    public static int[] insertionSort(int[] array) {
        // i 记录已排序区域的结尾索引
        for(int i = 1; i < array.length; i++) {
            // 当前需要插入的元素
            int current = array[i];
            // 目标位置的索引
            int index = i - 1;
            // 更新目标索引并将元素后移
            while(index >= 0 && current < array[index]) {
                // 如果比较的元素比当前元素大，则将其后移
                array[index + 1] = array[index];
                index--;
            }
            // 插入到目标索引
            array[index + 1] = current;
        }
        return array;
    }


    // 4、希尔排序（给元素分组，每一分组使用插入排序，之后分组数减小，再排序，如此循环）
    public static int[] shellSort(int[] array) {
        // 分组数，每组默认2 个
        int gap = array.length / 2;
        // 排序条件
        while(gap > 0) {
            // 依次为每一个分组排序
            for(int i = gap; i < array.length; i++) {
                // 要插入的元素——插入排序
                int current = array[i];
                // 要插入的索引
                int index = i - gap;
                while(index >= 0 && current < array[index]) {
                    array[index + gap] = array[index];
                    index -= gap;
                }
                // 插入元素
                array[index + gap] = current;
            }
            // 分组数量缩小
            gap /= 2;
        }

        return array;
    }

    // 5、归并排序（拆分排序后合并）
    public static int[] mergeSort(int[] array) {
        if(array.length < 2) {
            return array;
        }
        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);

        return merge(mergeSort(left), mergeSort(right));
    }
    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];

        for(int index = 0, i = 0, j = 0; index < result.length; index++) {
            if(i >= left.length) {
                result[index] = right[j++];
            } else if(j >= right.length) {
                result[index] = left[i++];
            } else if(left[i] < right[j]) {
                result[index] = left[i++];
            } else {
                result[index] = right[j++];
            }
        }

        return result;
    }


    // 6、快速排序（不懂）
    public static int[] quickSort(int[] array, int start, int end) {
        if (array.length < 1 || start < 0 || end >= array.length || start > end) return null;
        int smallIndex = partition(array, start, end);
        if (smallIndex > start)
            quickSort(array, start, smallIndex - 1);
        if (smallIndex < end)
            quickSort(array, smallIndex + 1, end);
        return array;
    }
    private static int partition(int[] array, int start, int end) {
        int pivot = (int) (start + Math.random() * (end - start + 1));
        int smallIndex = start - 1;
        swap(array, pivot, end);
        for (int i = start; i <= end; i++)
            if (array[i] <= array[end]) {
                smallIndex++;
                if (i > smallIndex)
                    swap(array, i, smallIndex);
            }
        return smallIndex;
    }
    // 交换两个元素
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
