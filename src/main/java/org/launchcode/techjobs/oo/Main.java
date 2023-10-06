package org.launchcode.techjobs.oo;
public class Main {

    public static void main(String[] args) {
//        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//        Job job2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
//        Job job3 = new Job("Ice cream tester", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Tasting ability"));
//
//        ArrayList<Job> jobs = new ArrayList<>();
//        jobs.add(job1);
//        jobs.add(job2);
//        jobs.add(job3);
//
//        for (Job job : jobs){
//            System.out.println(job);
//        }
        Employer apple = new Employer("Apple");
        CoreCompetency persistence = new CoreCompetency("Persistence");
        Location seattle = new Location("Seattle");

        PositionType qualityControl = new PositionType("Quality Control");

        Job job123 = new Job("Product tester", apple, seattle, qualityControl, persistence);
        String employerValue = apple.getValue();
        System.out.println(job123.getEmployer());
        Job job = new Job("Product tester", new Employer(""), new Location(""),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String y = job.getCoreCompetency().getValue();
        System.out.println(y);
        CoreCompetency x = job.getCoreCompetency();
        if (x instanceof CoreCompetency) {
            System.out.println("The class setter works.");
        } else {
            System.out.println("it didn't work");
        }
        System.out.println(job.toString());
        Employer hut = new Employer("The Hut");
        System.out.println(hut);
    }
}



