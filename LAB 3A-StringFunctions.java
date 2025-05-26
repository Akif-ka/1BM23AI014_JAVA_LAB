public class String_Functions {

    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    }

    public static String copyString(String original) {
        return new String(original);
    }

    public static String concatenateStrings(String str1, String str2) {
        return str1 + str2;
    }

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";
        System.out.println("String comparison:");
        System.out.println("Are the strings equal? " + compareStrings(str1, str2));

        String original = "Copy me!";
        String copied = copyString(original);
        System.out.println("\nString copy:");
        System.out.println("Original string: " + original);
        System.out.println("Copied string: " + copied);

        String part1 = "Hello, ";
        String part2 = "world!";
        String concatenated = concatenateStrings(part1, part2);
        System.out.println("\nString concatenation:");
        System.out.println("Concatenated string: " + concatenated);
    }
}
