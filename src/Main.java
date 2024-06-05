import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] array = {1, 6, 2, 23, 2, 3, 3, 3, 8, 3, 1, 5, 7,8};
//        int length = solution.removeDuplicates(array);
//        System.out.println(length);
//        System.out.println(solution.isPalindrome(12321));
//        System.out.println(solution.twoSum(new int[] {2, 7, 11, 15}, 9));
//        int[] ints = {1, 2, 3, 4, 11, 9, 7};
//        Arrays.sort(ints);
//        System.out.println(binarySearch(ints, 1));

//        solution.lengthOfLastWord("aibek privet kak dela")
//        int[] array = {1,2,3};
//        solution.mySqrt(8);

//        solution.addBinary("1010","1011");
//        solution.reverse(7);
//        int a = 5;

        System.out.println(solution.factorial(2));

    }

    private static int binarySearch(int[] numbers, int toFind){
        int low = 0;
        int high = numbers.length - 1;

        while(low <= high){
            int middlePos = (low+high) / 2;
            int middleNumber = numbers[middlePos];

            if(toFind == middleNumber){
                return middlePos;
            }
            if(toFind < middleNumber){
                high = middlePos - 1;

            }else{
                low = middlePos + 1;
            }
        }
        return -1;
    }

}


class Solution {

    public long factorial(int x){
        long resuld = 1;
        for(int i = 1; i <= x; i++) {
            resuld = resuld * i;
        }
        return resuld;
    }

    public int lengthOfLastWord(String s) {
        String[] strings = s.split(" ");
        List<String> list = Arrays.asList(strings);
        String lastWord = list.get(strings.length - 1);
        return lastWord.length();


    }

    public int mySqrt(int x) {
        Double a = Math.sqrt(x);
        int b = (int) Math.floor(a);
        System.out.println(b);
        return b;
    }

    public String addBinary(String a, String b) {
        BigInteger a1 = new BigInteger(a, 2);
        BigInteger b1 = new BigInteger(b, 2);
        BigInteger sum = a1.add(b1);
        System.out.println(sum.toString(2));
        return sum.toString(2);
    }

    public int reverse(int x) {
        long result = 0;

        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            result = result * 10 + pop;
        }
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }
        System.out.println(result);
        return (int) result;
    }

//    public int romanToInt(String s) {
//
//        HashMap<Character, Integer> romanMap = new HashMap<>();
//        romanMap.put('I', 1);
//        romanMap.put('V', 5);
//        romanMap.put('X', 10);
//        romanMap.put('L', 50);
//        romanMap.put('C', 100);
//        romanMap.put('D', 500);
//        romanMap.put('M', 1000);
//
//
//    }




    public boolean isPalindrome(int x) {

        String input = Integer.toString(x);

        int length = input.length();
        System.out.println(length);

        for (int i = 0; i < length / 2; i++){
            if(input.charAt(i) != input.charAt(length - 1 - i)){
                return false;
            }
        }
        return true;

    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int sol = target - nums[i];
            if (hashMap.containsKey(sol)) {
                return new int[]{hashMap.get(sol), i};
            }
            hashMap.put(nums[i], i);
        }
        throw new RuntimeException();
    }






    public int removeDuplicates(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);

        int j = 0;

        for (int i = 1; i < nums.length; i++){
            if (nums[i] != nums[j]){
                j++;
                nums[j] = nums[i];

            }
        }
        return j + 1;
    }



    }
















//    public int[] twoSum(int[] nums, int target) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        for(int i = 0; i < nums.length; i++){
//            int inc = target - nums[i];
//            if(map.containsKey(inc)){
//                return new int[] {map.get(inc), i};
//            }
//
//            map.put(nums[i], i);
//
//        }
//        throw new RuntimeException();
//    }