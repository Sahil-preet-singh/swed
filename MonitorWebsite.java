package ex4;

public class MonitorWebsite {
    public int checkInterval;
    private Subscription subscription;
    private NotificationService notifService;

    public MonitorWebsite(Subscription subscription, int checkInterval, NotificationService notifService) {
        this.subscription = subscription;
        this.checkInterval = checkInterval;
        this.notifService = notifService;
    }

    public void checkForUpdate() {
        if (!subscription.isActive()) return;
        String current = fetchContent();
        if (detectUpdate(current)) {
            notifService.sendNotification(subscription.getUrl(), subscription.getCommunication());
        }
        subscription.setLastKnownContent(current);
    }

    public boolean detectUpdate(String current) {
        if (subscription.getLastKnownContent() == null) return false;
        return !subscription.getLastKnownContent().equals(current);
    }

    private String fetchContent() {
        // Mockup
        return "content-of-" + subscription.getUrl();
    }
}
