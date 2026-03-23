public class arrays2 {
    
    public static void main(String[] args) {
        // 1000 Auto-generated test cases
        int minarr[] = {5, 7, 8};
        int min = minarr[0];
        for (int i = 1; i < minarr.length; i++) {
            if (minarr[i] < min) {
                min = minarr[i];
            }
        }
        System.out.println("minimum element=" + min);
    }
}
