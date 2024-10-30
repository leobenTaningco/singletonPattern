public class App {
    public static void main(String[] args) throws Exception {
        HelpDeskStation station1 = new HelpDeskStation(1);
        HelpDeskStation station2 = new HelpDeskStation(2);
        HelpDeskStation station3 = new HelpDeskStation(3);

        station1.serveCustomer(); 
        station2.serveCustomer(); 
        station3.serveCustomer();
        OnlineMonitor.displayCurrentQueue(); 

        station1.resetQueueNumber(4);  
        OnlineMonitor.displayCurrentQueue(); 

        station2.resetQueueNumber(5);  
        OnlineMonitor.displayCurrentQueue(); 

        station3.resetQueueNumber(1);
        OnlineMonitor.displayCurrentQueue(); 
    }
}
