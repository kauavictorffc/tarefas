public class EqualizerDecorator extends ContentDecorator {
    public EqualizerDecorator(Content decoratedContent) {
        super(decoratedContent);
    }

    @Override
    public void play() {
        System.out.println("Applying equalizer settings...");
        super.play();
    }
}
