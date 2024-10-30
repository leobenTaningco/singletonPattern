public class HelpDeskStation {
    private int stationID;

    public HelpDeskStation(int stationID){
        this.stationID = stationID;
    }

    public void serveCustomer(){
        QueueManager queueManager = QueueManager.getInstance();
        int getNextQueueNumber = queueManager.getNextQueueNumber();
        System.out.println("Station " + stationID + " is serving customer with queue number: " + getNextQueueNumber);
    }

    public void resetQueueNumber(int newNumber){
        QueueManager queueManager = QueueManager.getInstance();
        queueManager.resetQueueNumber(newNumber);
        System.out.println("Station " + stationID + " has reset the queue number to: " + newNumber);
    }

}

