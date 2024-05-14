package org.launchcode.techjobs.oo;

import org.hamcrest.core.IsInstanceOf;
import org.junit.Test;

import static java.lang.System.lineSeparator;
import static org.junit.Assert.*;


public class JobTest {
    //DONE: Create your unit tests here

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
        Job JobA = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String firstChar = String.valueOf(JobA.toString().charAt(0));
        String lastChar = String.valueOf(JobA.toString().charAt(JobA.toString().length()-1));
        assertEquals(firstChar, lineSeparator());
        assertEquals(lastChar, lineSeparator());
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job JobA = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals(String.format("%nID: %o%nName: %s%nEmployer: %s%nLocation: %s%nPosition Type: %s%nCore Competency: %s%n", JobA.getId(), "Product tester", "ACME", "Desert", "Quality control", "Persistence"), JobA.toString());
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job JobA = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType(""), new CoreCompetency("Persistence"));
        String notAvailable = "Data not available";

        assertEquals(String.format("%nID: %o%nName: %s%nEmployer: %s%nLocation: %s%nPosition Type: %s%nCore Competency: %s%n", JobA.getId(), "Product tester", notAvailable, "Desert", notAvailable, "Persistence"), JobA.toString());
    }

}
