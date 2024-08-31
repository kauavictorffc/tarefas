public abstract class ContentDecorator implements Content {
    protected Content decoratedContent;

    public ContentDecorator(Content decoratedContent) {
        this.decoratedContent = decoratedContent;
    }

    @Override
    public void play() {
        decoratedContent.play();
    }
}
