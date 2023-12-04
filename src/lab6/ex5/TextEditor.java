package lab6.ex5;

public class TextEditor {

    private String text;
    private TextFormatter formattingStrategy;

    public TextEditor(TextFormatter formattingStrategy) {
        this.formattingStrategy = formattingStrategy;
    }

    public void setFormattingStrategy(TextFormatter formattingStrategy) {
        this.formattingStrategy = formattingStrategy;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void display() {
        System.out.println(formattingStrategy.formatText(this.text));
    }

    public static void main(String[] args) {

        TextFormatter upper = new UpperCaseFormatter();
        TextFormatter lower = new LowerCaseFormatter();
        TextFormatter title = new TitleCaseFormatter();

        TextEditor editor = new TextEditor(upper);
        editor.setText("milan - borussia: 1 - 3");

        System.out.println("Upper");
        editor.display();

        System.out.println("Lower");
        editor.setFormattingStrategy(lower);
        editor.display();

        System.out.println("Title");
        editor.setFormattingStrategy(title);
        editor.display();

    }

}
