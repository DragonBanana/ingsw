package lab6.ex5;

public class LowerCaseFormatter implements TextFormatter{


    @Override
    public String formatText(String text) {
        return text.toLowerCase();
    }
}
