package org.launchcode.techjobs.oo;

import org.hamcrest.core.IsInstanceOf;
import org.junit.Test;

import static org.junit.Assert.*;


public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId() {
        Job jobA = new Job();
        Job jobB = new Job();
        assertNotEquals(jobA, jobB);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job JobA = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals("Product tester", JobA.getName());
        assertTrue(JobA.getName() instanceof String);

        assertEquals("ACME", JobA.getEmployer().toString());
        assertTrue(JobA.getEmployer() instanceof Employer);

        assertEquals("Desert", JobA.getLocation().toString());
        assertTrue(JobA.getLocation() instanceof Location);

        assertEquals("Quality control", JobA.getPositionType().toString());
        assertTrue(JobA.getPositionType() instanceof PositionType);

        assertEquals("Persistence", JobA.getCoreCompetency().toString());
        assertTrue(JobA.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality() {
        Job JobA = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job JobB = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(JobA.getId() != JobB.getId());
        // assertNotEquals(JobA.getId(), JobB.getId());
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
    }

    @Test
    public void testToStringHandlesEmptyField() {
    }

}
