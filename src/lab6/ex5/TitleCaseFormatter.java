package lab6.ex5;

public class TitleCaseFormatter implements TextFormatter {


    @Override
    public String formatText(String text) {
        String[] words = text.split("\\s");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                result
                        .append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase())
                        .append(" ");


            }
        }
        return result.toString().trim();
    }
}
