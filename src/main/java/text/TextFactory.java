package text;

public class TextFactory {
    public static Text createText(String text) {
        return new Text(text);
    }

    public static GreetingText createGreetingText(String toGreet) {
        return new GreetingText(toGreet);
    }

    public static HelloWorldText createHelloWorldText() {
        return new HelloWorldText();
    }
}
