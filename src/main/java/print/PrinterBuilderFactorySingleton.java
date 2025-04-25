package print;

public class PrinterBuilderFactorySingleton {
    public static PrinterBuilder getBuilder() {
        return new PrinterBuilder();
    }
}
