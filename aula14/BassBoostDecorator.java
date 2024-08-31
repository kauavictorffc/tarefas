public class BassBoostDecorator extends ContentDecorator {
    public BassBoostDecorator(Content decoratedContent) {
        super(decoratedContent);
    }

    @Override
    public void play() {
        System.out.println("Applying bass boost...");
        super.play();
    }
}
