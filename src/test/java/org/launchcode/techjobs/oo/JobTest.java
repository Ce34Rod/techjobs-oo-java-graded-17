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

    }
}
