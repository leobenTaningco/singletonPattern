public class OnlineMonitor {
    public static void displayCurrentQueue() {
        QueueManager queueManager = QueueManager.getInstance();
        int currentQueueNumber = queueManager.getCurrentQueueNumber();
        System.out.println("Next queued number: " + (currentQueueNumber+1));
    }
}
