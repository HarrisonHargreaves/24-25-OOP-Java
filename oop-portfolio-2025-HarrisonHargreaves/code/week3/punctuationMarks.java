package code.week3;

public class punctuationMarks {

    public static void main(String[] args) {

        String text = "Mary had a little lamb, her fleece was as white as snow, and everywhere Mary went, the lamb was sure to go. -that was a nice poem- the end.";
        int commaCount = 0;
        int periodCount = 0;
        int hyphenCount = 0;

        for (char c : text.toCharArray()) {
            if (c == ',') commaCount++;
            if (c == '.') periodCount++;
            if (c == '-') hyphenCount++;
        }

        System.out.println("Punctuation Mark | Count");
        System.out.println("-----------------|------");
        System.out.printf("Comma            | %d%n", commaCount);
        System.out.printf("Period           | %d%n", periodCount);
        System.out.printf("Hyphen           | %d%n", hyphenCount);
    }
}
