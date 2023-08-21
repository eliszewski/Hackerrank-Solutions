package Easy;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class test {
    public static void main(String[] args) {
        String password = "P@ss";
        System.out.println("Secured? "+validate(password));
        List<Integer> linked = new LinkedList<>();
        linked.add(12);
        Set<Integer> setter = new LinkedHashSet<>();
    }
    //
    // 0(n)
    public static boolean validate(String password){
        boolean upper = false;
        boolean lower = false;
        boolean special = false;
        boolean digits = false;
        if(password.length() < 6) return false;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if(Character.isSpaceChar(c)) return false;
            if(Character.isUpperCase(c)) upper = true;
            if(Character.isLowerCase(c)) lower = true;
            if(Character.isDigit(c)) digits = true;
            if(!Character.isLetter(c) && !Character.isDigit(c)) special = true;
        }
        return upper && lower && special && digits;
    }
}
