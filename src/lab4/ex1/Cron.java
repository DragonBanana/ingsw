package lab4.ex1;

import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Date;
public class Cron {

    private List<CronJob> cronJobs;

    public Cron() {
        this.cronJobs = new LinkedList<>();
    }

    public void addCronJob(CronJob cronJob) {
        this.cronJobs.add(cronJob);
    }

    public void start() {
        while(!cronJobs.isEmpty()) {
            CronJob activeCronJob = null;
            for(CronJob cronJob: cronJobs) {
                // Prendiamo la data attuale
                Date now = new Date();
                if(cronJob.getDate().before(now)) {
                    activeCronJob = cronJob;
                }
            }
            if(activeCronJob != null) {
                activeCronJob.getAction().execute();
                cronJobs.remove(activeCronJob);
            }
        }
    }

    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        c.setTime(new Date());

        c.add(Calendar.SECOND, 2);
        Date d1 = c.getTime();
        PrintAction pa1 = new PrintAction("Action 1");
        CronJob cj1 = new CronJob(pa1, d1);

        c.add(Calendar.SECOND, 4);
        Date d2 = c.getTime();
        PrintAction pa2 = new PrintAction("Action 2");
        CronJob cj2 = new CronJob(pa2, d2);

        c.add(Calendar.SECOND, 6);
        Date d3 = c.getTime();
        PrintAction pa3 = new PrintAction("Action 3");
        CronJob cj3 = new CronJob(pa3, d3);

        Cron cron = new Cron();
        cron.addCronJob(cj1);
        cron.addCronJob(cj2);
        cron.addCronJob(cj3);
        cron.addCronJob(new CronJob(new Action() {
            @Override
            public void execute() {
                for(int i=0; i<10; i++) {
                    System.out.println(i);
                }
            }
        }, d3));

        cron.start();
    }

}
