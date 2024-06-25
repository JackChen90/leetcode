package indi.jackie.leetcode.struct;

public class CountBeautifulPairs2748 {
    public int countBeautifulPairs(int[] nums) {
        int ans = 0;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (isCoprime(getNum(nums[i], 0), getNum(nums[j], -1))) {
                    ans++;
                }
            }
        }
        return ans;
    }

    private int getNum(int num, int location) {
        String numStr = String.valueOf(num);
        if (location >= 0) {
            return Integer.parseInt(numStr.substring(0, location + 1));
        } else {
            return Integer.parseInt(numStr.substring(numStr.length() + location));
        }
    }

    private boolean isCoprime(int a, int b) {
        int temp;
        while (b != 0) {
            temp = a % b;
            a = b;
            b = temp;
        }
        //最大公约数是1则互质
        return a == 1;
    }
}
