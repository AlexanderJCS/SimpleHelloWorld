package print;

import helper.Builder;
import text.TextProvider;

import java.io.PrintStream;

public class PrinterBuilder extends Builder<Printer> {
    private boolean addNewline;
    private PrintStream stream;
    private TextProvider textProvider;

    PrinterBuilder() {
        // Default values
        addNewline = false;
    }

    public PrinterBuilder setStream(PrintStream stream) {
        this.stream = stream;
        return this;
    }

    public PrinterBuilder setTextProvider(TextProvider textProvider) {
        this.textProvider = textProvider;
        return this;
    }

    public PrinterBuilder setAddNewline(boolean addNewline) {
        this.addNewline = addNewline;
        return this;
    }

    public TextProvider getTextProvider() {
        return textProvider;
    }

    public PrintStream getStream() {
        return stream;
    }

    public boolean getAddNewline() {
        return addNewline;
    }

    @Override
    public Printer build() {
        return new Printer(this);
    }
}
