package lab4.ex1;

import java.util.Date;

public class CronJob {

    private Action action;
    private Date date;

    public CronJob(Action action, Date date) {
        this.action = action;
        this.date = date;
    }

    public Action getAction() {
        return action;
    }

    public Date getDate() {
        return date;
    }
}
