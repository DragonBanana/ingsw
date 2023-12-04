package lab6.ex5;

public class UpperCaseFormatter implements TextFormatter {

    @Override
    public String formatText(String text) {
        return text.toUpperCase();
    }
}
