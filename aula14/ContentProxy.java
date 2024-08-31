public class ContentProxy implements Content {
    private Content content;
    private boolean isPremiumUser;

    public ContentProxy(Content content, boolean isPremiumUser) {
        this.content = content;
        this.isPremiumUser = isPremiumUser;
    }

    @Override
    public void play() {
        if (isPremiumUser) {
            content.play();
        } else {
            System.out.println("Access denied: Premium content is only available for premium users.");
        }
    }
}
