package text;

import helper.Builder;

public class TextProviderBuilder extends Builder<TextProvider> {
    private Text text;

    public TextProviderBuilder setText(Text text) {
        this.text = text;
        return this;
    }

    public Text getText() {
        return this.text;
    }

    @Override
    public TextProvider build() {
        return new TextProvider(this.text);
    }
}
