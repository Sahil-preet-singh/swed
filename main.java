public class WebsiteMonitor {

    public static void main(String[] args) {

        UserController controller = new UserController();

        
        controller.registerUser("Sahilpreet_singh", "sahilpreet539@gmail.com");

      
        controller.manageSubscription("subscribe", 1, null,
            "hhttps://www.frankfurt-university.de", Commchannel.EMAIL, 5);

    

        /
        System.out.println("\n--- Check cycle ---");
        controller.runChecks();

        
        System.out.println("\n--- Manual notification ---");
        controller.createNotification(1, "REG-1");

       
        controller.manageSubscription("update", 1, "REG-1",
            null, Commchannel.PUSH, 15);

      
        controller.manageSubscription("cancel", 1, "REG-1",
            null, null, 0);
    }
}
