import java.util.Comparator;

/***
 * @author Borislav Sabotinov
 * Used by FCFS scheduler.
 * Compares processes by their arrival times, so the process that comes first is first in the queue.
 *
 */
public class ProcessArrivalTimeComparator implements Comparator<Process> {

    /**
     *
     * @param p1
     * @param p2
     * @return
     */
    @Override
    public int compare(Process p1, Process p2) {
        if (p1.getArrivalTime() < p2.getArrivalTime())
        {
            return -1;
        }
        if (p1.getArrivalTime() > p2.getArrivalTime())
        {
            return 1;
        }
        return 0;
    }
} // end class
