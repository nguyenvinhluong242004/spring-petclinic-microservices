package org.springframework.samples.petclinic.visits.web;

import org.junit.jupiter.api.Test;
import org.springframework.samples.petclinic.visits.model.Visit;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class VisitTest {

    @Test
    void testVisitSettersAndGetters() {
        Visit visit = new Visit();
        Date visitDate = new Date();
        String description = "Annual checkup";
        int petId = 101;

        visit.setId(1);
        visit.setDate(visitDate);
        visit.setDescription(description);
        visit.setPetId(petId);

        assertEquals(1, visit.getId());
        assertEquals(visitDate, visit.getDate());
        assertEquals(description, visit.getDescription());
        assertEquals(petId, visit.getPetId());
    }

    @Test
    void testVisitBuilder() {
        Date visitDate = new Date();
        Visit visit = Visit.VisitBuilder.aVisit()
            .id(2)
            .date(visitDate)
            .description("Vaccination")
            .petId(202)
            .build();

        assertEquals(2, visit.getId());
        assertEquals(visitDate, visit.getDate());
        assertEquals("Vaccination", visit.getDescription());
        assertEquals(202, visit.getPetId());
    }

    @Test
    void testDefaultDateIsNotNull() {
        Visit visit = new Visit();
        assertNotNull(visit.getDate());
    }
}
