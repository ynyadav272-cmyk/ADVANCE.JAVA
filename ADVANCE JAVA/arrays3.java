public class arrays3 {
    
    public static void main(String[] args) {
        // 1000 Auto-generated test cases
        int minarr[] = {6, 8, 8};
        int min = minarr[0];
        for (int i = 1; i < minarr.length; i++) {
            if (minarr[i] < min) {
                min = minarr[i];
            }
        }
        System.out.println("minimum 8 element=" + min);
    }
}
 