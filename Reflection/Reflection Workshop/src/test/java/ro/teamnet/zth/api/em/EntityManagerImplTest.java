package ro.teamnet.zth.api.em;

import org.junit.Test;


import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 7/8/2016.
 */
public class EntityManagerImplTest {
    EntityManagerImpl em = new EntityManagerImpl() ;

    @Test
    public void testFindNext() throws NoSuchFieldException {
        assertEquals(271, em.getNextIdVal("departments","DEPARTMENT_ID"));
    }
}
