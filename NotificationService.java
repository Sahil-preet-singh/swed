package ex4;

import java.util.Date;

public class NotificationService {
    public Date timeStamp;

    public void sendNotification(String url, Commchannel channel) {
        this.timeStamp = new Date();
        String msg = "Update detected at: " + url;
        switch (channel) {
            case EMAIL -> System.out.println("[EMAIL] " + msg);
            case SMS   -> System.out.println("[SMS]   " + msg);
            case PUSH  -> System.out.println("[PUSH]  " + msg);
        }
    }
}
