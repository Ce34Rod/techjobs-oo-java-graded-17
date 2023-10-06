package org.launchcode.techjobs.oo;

import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.*;

public class JobTest {
    @Test
    public void testSettingJobId(){
var job = new Job();
var job2 = new Job();
assertNotEquals(job.getId(), job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
       var job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
    assertTrue(job.getEmployer() instanceof Employer );
    assertTrue(job.getLocation() instanceof Location);
    assertTrue(job.getPositionType() instanceof PositionType);
    assertTrue(job.getName() instanceof String);
    assertEquals("Product tester", job.getName());
    assertEquals("ACME", job.getEmployer().getValue());
    assertEquals("Desert", job.getLocation().getValue());
    assertEquals("Quality control", job.getPositionType().getValue());
    assertEquals("Persistence", job.getCoreCompetency().getValue());

    }
    @Test
    public void testJobsForEquality(){
        Job job123 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(job.equals(job123));

    }
    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job job = new Job("", new Employer(""), new Location(""),
                new PositionType(""), new CoreCompetency(""));
        String W = System.lineSeparator();
assertTrue(job.toString().startsWith(W) && job.toString().endsWith(W));


    }
@Test
    public void testToStringContainsCorrectLabelsAndData(){
    Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
            new PositionType("Quality control"), new CoreCompetency("Persistence"));
    String W = System.lineSeparator();
assertEquals(W + "ID: "+job.getId() + W + "Name: "+job.getName() + W + "Employer: "+job.getEmployer() + W + "Location: " +job.getLocation() + W + "Position Type: "+job.getPositionType() + W + "Core Competency: "+job.getCoreCompetency() + W, job.toString());
}
@Test
    public void testToStringHandlesEmptyField(){
    Job job = new Job("", new Employer(""), new Location(""),
            new PositionType(""), new CoreCompetency(""));
    String W = System.lineSeparator();
    assertEquals(W + "ID: "+ job.getId() + W + "Name: Data not available" + W + "Employer: Data not available" + W + "Location: Data not available" +W+ "Position Type: Data not available" + W + "Core Competency: Data not available" + W, job.toString());

}
}
