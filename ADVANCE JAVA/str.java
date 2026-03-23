public class str {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + " " + str2;

        if (str3.equals("Hello World")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        System.err.println(str1.startsWith("He"));
        System.err.println(str2.endsWith("ld"));

    System.out.println(str3.toUpperCase());
    System.out.println(str3.toLowerCase());
    System.out.println(str3.length());
    System.out.println(str3.charAt(4));
    System.out.println(str3.indexOf("o"));
    System.out.println(str3.substring(6,11));
    System.out.println(str3.replace("World", "Java"));
    System.out.println(str3.trim());
    System.out.println(str3.contains("akhilesh"));
}
}
