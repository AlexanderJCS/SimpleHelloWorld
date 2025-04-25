import print.Printer;
import print.PrinterBuilderFactorySingleton;
import text.TextFactory;
import text.TextProviderBuilder;
import text.TextProvider;

public class Main {
    public static void main(String[] args) {
        TextProvider provider = new TextProviderBuilder()
                .setText(TextFactory.createHelloWorldText())
                .build();

        Printer printer = PrinterBuilderFactorySingleton.getInstance().getBuilder()
                .setAddNewline(true)
                .setStream(System.out)
                .setTextProvider(provider)
                .build();

        printer.display();
    }
}