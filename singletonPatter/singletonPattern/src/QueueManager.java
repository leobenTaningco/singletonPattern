public class QueueManager {
    private static QueueManager instance = null;
    private int currentQueueNumer = 1;

    private QueueManager(){

    }

    public static QueueManager getInstance(){
        if(instance == null){
            instance = new QueueManager();
        }
        return instance;
    }

    public synchronized int getNextQueueNumber(){
        return currentQueueNumer++;
    }

    public synchronized void resetQueueNumber(int newNumber){
        currentQueueNumer = newNumber;
    }

    public int getCurrentQueueNumber(){
        return currentQueueNumer;
    }
}
