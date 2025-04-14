package LeetCode;

import java.util.Arrays;

//给你一个下标从 0 开始的整数数组 nums 和一个整数 k 。一次操作中，你可以删除 nums 中的最小元素。
//你需要使数组中的所有元素都大于或等于 k ，请你返回需要的 最少 操作次数。
//示例 1：
//输入：nums = [2,11,10,1,3], k = 10
//输出：3
//解释：第一次操作后，nums 变为 [2, 11, 10, 3] 。
//第二次操作后，nums 变为 [11, 10, 3] 。
//第三次操作后，nums 变为 [11, 10] 。
//此时，数组中的所有元素都大于等于 10 ，所以我们停止操作。
//使数组中所有元素都大于等于 10 需要的最少操作次数为 3 。
//示例 2：
//输入：nums = [1,1,2,4,9], k = 1
//输出：0
//解释：数组中的所有元素都大于等于 1 ，所以不需要对 nums 做任何操作。
public class _3065_MinimumNumberOfOperands {
    public static void main(String[] args) {
        int [] nums = {57,72,7,34,57,50,42};
        int k = 50;
        Arrays.sort(nums);//排序
        int left = 0, right = nums.length;
        int mid = 0;
        if (nums[nums.length - 1] < k){//最后一个值小于k
            System.out.println(nums.length);
        } else if (nums[0] >= k) {//第一个值大于等于k
            System.out.println(0);
        }else {
            while(left < right){//二分法
                mid = (right + left)/2;
                if (nums[mid] == k  && nums[mid-1] != k|| (nums[mid] > k && nums[mid-1] < k)){
                    break;//mid对应值等于k，或者有mid对应值大于k且mid-1对应值小于k
                }else if (nums[mid] >= k){
                    right = mid;
                }else if (nums[mid] <= k){
                    left = mid+1;
                }
            }
                System.out.println(mid);
        }

    }
}
