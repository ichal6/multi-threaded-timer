public class TimerThread extends Thread{
    int timeFromStart;
    boolean isRunning;

    public TimerThread(String name) {
        super(name);
        this.timeFromStart = 0;
        this.isRunning = true;
    }

    @Override
    public void run() {
        while(isRunning){
            try {
//                System.out.println(timeFromStart);
                sleep(1000);
                timeFromStart++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public int getTimeFromStart() {
        return timeFromStart;
    }

    public void setIsRunning(boolean isRunning){
        this.isRunning = isRunning;
    }
}
