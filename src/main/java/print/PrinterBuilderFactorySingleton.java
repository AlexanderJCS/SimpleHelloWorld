package print;

public class PrinterBuilderFactorySingleton {
    private static PrinterBuilderFactorySingleton instance;

    private PrinterBuilderFactorySingleton() {}

    public static PrinterBuilderFactorySingleton getInstance() {
        if (instance == null) {
            instance = new PrinterBuilderFactorySingleton();
        }
        return instance;
    }

    public PrinterBuilder getBuilder() {
        return new PrinterBuilder();
    }
}