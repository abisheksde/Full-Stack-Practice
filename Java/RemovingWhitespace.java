public class RemovingWhitespace {
    public static void main(String[] args) {
        String line = "I ndia is My     Country.";

        String newLine = line.replaceAll("\\s", "");

        System.out.println(newLine);
    }
}
