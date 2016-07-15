package ro.teamnet.zth.api.database;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by user on 7/8/2016.
 */
public class DBManagerTest {
    @Test
    public void testGetConnection() {
        assertNotEquals("a", null, DBManager.getConnection());
    }

}
