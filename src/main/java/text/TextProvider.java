package text;

import helper.Provider;

public class TextProvider implements Provider<String> {
    private final Text text;

    TextProvider(Text text) {
        this.text = text;
    }

    public String provide() {
        return text.getText();
    }
}
