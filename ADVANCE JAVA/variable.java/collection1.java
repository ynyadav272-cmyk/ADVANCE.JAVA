import java.util.*;
public class collection1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> li=new ArrayList<>();
		li.add(34);
		li.add(12);
		li.add(15);
		li.add(16);
		li.add(18);
		System.out.println(li);
		System.out.println(li.get(2));
		li.set(4,45);
		System.out.println(li);
		System.out.println(li.contains(45));
		System.out.println(li.isEmpty());
		System.out.println(li.indexOf(45));
		System.out.println("size="+li.size());
		li.remove(0);
		System.out.println(li);
		li.sort(null);
		System.out.println(li);
		ArrayList <Integer> l1=new ArrayList<>();
		l1.add(24);
		li.add(26);
		li.addAll(l1);
		System.out.println(li);
		System.out.println(".................................................................");
       for(int i=0;i<li.size();i++) {
    	   System.out.println(li.get(i));
       }
       System.out.println();
       for(Integer i:li) {
    	   System.out.println(i);
       }
         System.out.println();
	}

	

}