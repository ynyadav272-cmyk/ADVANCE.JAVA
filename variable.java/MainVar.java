public class MainVar {

    public static void main(String[] args) {

        int  a = 10;
        var b = 20;
        var name = "kiet mca";
        var value = 12.5;
        var c = 0.0;
        c = 39.56;
        System.out.println(c);                   // use c so it's not unused
        String name1 = new String("this is a string");
        var name2 = new String("this is a string");
        System.out.println(name2);               // use name2 as well
        // use name1 so it’s not unused
        System.out.println(name1);
        int val[] = new int[] {1,2,3,4,5};
        for(var v:val){
            System.out.println(v);
            
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(name);
        System.out.println(value);          


    }

}
