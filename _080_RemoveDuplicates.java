package LeetCode;
//给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使得出现次数超过两次的元素只出现两次 ，返回删除后数组的新长度。
//不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
//说明：
//为什么返回数值是整数，但输出的答案是数组呢？
//请注意，输入数组是以「引用」方式传递的，这意味着在函数里修改输入数组对于调用者是可见的。
//你可以想象内部操作如下:
//// nums 是以“引用”方式传递的。也就是说，不对实参做任何拷贝
//int len = removeDuplicates(nums);
//// 在函数里修改输入数组对于调用者是可见的。
//// 根据你的函数返回的长度, 它会打印出数组中 该长度范围内 的所有元素。
//for (int i = 0; i < len; i++) {print(nums[i]);}
//示例 1：
//输入：nums = [1,1,1,2,2,3]
//输出：5, nums = [1,1,2,2,3]
//解释：函数应返回新长度 length = 5, 并且原数组的前五个元素被修改为 1, 1, 2, 2, 3。 不需要考虑数组中超出新长度后面的元素。
//示例 2：
//输入：nums = [0,0,1,1,1,1,2,3,3]
//输出：7, nums = [0,0,1,1,2,3,3]
//解释：函数应返回新长度 length = 7, 并且原数组的前七个元素被修改为 0, 0, 1, 1, 2, 3, 3。不需要考虑数组中超出新长度后面的元素。
public class _080_RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        Method(nums);
    }

    public static int Method(int[] nums) {
        int temp = 0;
        int times = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[temp] == nums[i]) {//判断数字是否相同
                times++;//相同，次数加一
                if (times < 2) {//相同次数不能超过2，若超过比较下一个
                    nums[temp+1] = nums[i];//将符合条件的数字往前挪（相当于放入新数组）
                    temp++;
                }
            } else if (nums[temp] != nums[i]) {//不相等时
                nums[temp+1] = nums[i];//将符合条件的数字往前挪（相当于放入新数组）
                temp++;
                times = 0;//次数归为0
            }
        }
        System.out.println(" " + (temp+1) + nums);
        return temp+1;
    }
}
