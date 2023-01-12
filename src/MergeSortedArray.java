import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();

        int[] firstArr = {0};
        int[] sndArr = {1};

        mergeSortedArray.merge(firstArr, 0, sndArr, 1);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for(int i = 0; i < n; i++){
            if (m == 0) {
                nums1[i] = nums2[i];
            } else {
                nums1[m] = nums2[i];
                m++;
            }
        }

        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
