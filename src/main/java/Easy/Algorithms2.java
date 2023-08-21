package Easy;

public class Algorithms2 {
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int maxCost = -1;

        for (int keyboardPrice : keyboards) {
            for (int drivePrice : drives) {
                int totalCost = keyboardPrice + drivePrice;
                if (totalCost <= b && totalCost > maxCost) {
                    maxCost = totalCost;
                }
            }
        }

        return maxCost;
    }

    static String catAndMouse(int x, int y, int z) {
        int catB = Math.abs(z - y);
        int catA = Math.abs(z - x);
        if(catB < catA) return "Cat B";
        else if (catB > catA)  return "Cat A";
        else return "Mouse C";
    }
}
