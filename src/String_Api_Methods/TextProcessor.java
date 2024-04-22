package String_Api_Methods;
public class TextProcessor {
    public static String repeatString(String str, int count) {
        StringBuilder repeatedString = new StringBuilder();
        for(int i=0;i<count;i++){
            repeatedString.append(str);
        }
        return repeatedString.toString();
        //    OR
        // return str.repeat(count);
    }

    // Functionality: Checking if a string is blank
    public static boolean isStringBlank(String str) {
        return str == null || str.isBlank();
    }

    // Functionality: Extracting lines from a multi-line string
    public static void extractLines(String multiLineStr) {
        String lines[] = multiLineStr.split("\n");
        for(String line: lines){
            System.out.println(line);
        }
        //      OR
        //multiLineStr.lines().forEach(System.out::println);
    }

    // Functionality: String formatting
    public static String formatString(String format, Object... args) {
        return format.formatted(args);
    }


    // Functionality: String indentation
    public static String indentString(String str, int n) {
        return str.indent(n);
    }


    public static void main(String[] args) {

        String originalString = "Hello";
        String multiLineString = "Line 1\nLine 2\nLine 3";

        // String repetition
        String repeatedString = TextProcessor.repeatString(originalString, 3);
        System.out.println("Repeated String: " + repeatedString);

        // Checking if a string is blank
        String blankString = "   ";
        System.out.println("Is Blank String: " + TextProcessor.isStringBlank(blankString));

        // Extracting lines from a multi-line string
        System.out.println("Lines from Multi-line String:");
        TextProcessor.extractLines(multiLineString);

        // String formatting
        String formattedString = TextProcessor.formatString("Hello %s", "World");
        System.out.println("Formatted String: " + formattedString);


        // String indentation
        String indentedString = TextProcessor.indentString(multiLineString, 2);
        System.out.println("Indented String:\n" + indentedString);


    }
}
