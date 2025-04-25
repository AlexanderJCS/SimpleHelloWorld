package print;

import text.TextProvider;

import java.io.PrintStream;

public class Printer implements Displayer {
    private final PrintStream stream;
    private final boolean addNewline;
    private final TextProvider textProvider;

    Printer(PrinterBuilder builder) {
        this.stream = builder.getStream();
        this.textProvider = builder.getTextProvider();
        this.addNewline = builder.getAddNewline();

        if (this.stream == null) {
            throw new IllegalArgumentException("Builder must have a valid stream");
        } if (this.textProvider == null) {
            throw new IllegalArgumentException("Builder must have valid text");
        }
    }

    @Override
    public void display() {
        if (addNewline) {
            stream.println(textProvider.provide());
        } else {
            stream.print(textProvider.provide());
        }
    }
}
