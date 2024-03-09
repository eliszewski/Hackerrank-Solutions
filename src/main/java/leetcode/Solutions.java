package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Solutions {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> exist = new HashSet<>();
        for (int num : nums) {
            if (!exist.add(num)) return true;
        }
        return false;
    }

    public static boolean isAnagram(String s, String t) { // maybe faster in some cases
//        if(s.length() != t.length()) return false;
//
//        Map<Character,Integer> sMap = new HashMap<>();
//        Map<Character,Integer> tMap = new HashMap<>();
//
//        for(char c : s.toCharArray()){
//            sMap.put(c,sMap.getOrDefault(c,0) + 1);
//        }
//
//        for(char c : t.toCharArray()){
//            tMap.put(c,tMap.getOrDefault(c,0) + 1);
//        }
//
//        return sMap.equals(tMap);
        if (t.length() != s.length()) {
            return false;
        }

        char[] charArray1 = s.toCharArray();
        char[] charArray2 = t.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    public int[] getConcatenation(int[] nums) {
        int[] copy1 = Arrays.copyOf(nums, nums.length * 2);
        int counter = 0;
        for (int i = nums.length ; i < copy1.length; i++) {
            copy1[i] = nums[counter];
            counter++;
        }
        return copy1;
    }

    public int[] replaceElements(int[] arr) { //[17,18,5,4,6,1]
        int max = -1;
        int temp;

        for (int i = arr.length - 1; i >= 0; i++) {
            if(arr[i] > max){
                temp = arr[i];
                arr[i] = max;
                max = temp;
            }else{
                arr[i] = max;
            }
        }
        return arr;
    }

    public boolean isSubsequence(String s, String t) {
        if(s.isEmpty()) return true;
        if (s.length() > t.length()) return false;
        int j = 0;
        for (char c: t.toCharArray()) {
            char cur = s.charAt(j);
            if(c == cur){
                if(j == s.length() - 1) return true;
                j++;
            }
        }
        return false;
    }

    public int lengthOfLastWord(String s) {
        s = s.trim();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) != ' ') count++;
            else break;
        }
        return count;
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])) return new int[]{map.get(target - nums[i]), i};
            else map.put(nums[i], i);
        }
        return null;
    }

    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            String current = strs[i];
            int j = 0;
            while (j < prefix.length() && j < current.length() && prefix.charAt(j) == current.charAt(j)) {
                j++;
            }
            if (j == 0) {
                return "";
            }
            prefix = prefix.substring(0, j);
        }
        return prefix;
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"aaa","aa","aaa"}));
    }
}
