package org.springframework.samples.petclinic.vets.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SpecialtyTest {

    @Test
    void testGetIdAndName() {
        Specialty s = new Specialty();
        s.setName("Surgery");

        assertNull(s.getId());  // id chưa được set
        assertEquals("Surgery", s.getName());
    }

    @Test
    void testSetName() {
        Specialty s = new Specialty();
        s.setName("Dentistry");

        assertEquals("Dentistry", s.getName());
    }
}
