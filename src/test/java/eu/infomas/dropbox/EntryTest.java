package eu.infomas.dropbox;

import java.io.IOException;
import java.util.Map;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import static eu.infomas.dropbox.Utils.*;

public final class EntryTest {

    private static String JSON;

    @BeforeClass
    public static void loadTestData() throws IOException {
        JSON = Utils.toString(
            Utils.getResourceAsStream("classpath:/Entry.json", EntryTest.class),
            Utils.UTF8);
        //Log.info(JSON);
    }

    @Test
    public void test() throws IOException {
        Map map = parseJson(JSON, Map.class);
        Entry entry = Entry.valueOf(map);

        assertEquals(0, entry.getBytes());
        assertFalse(entry.isDeleted());
        assertTrue(entry.isDir());
        assertEquals("dropbox", entry.getRoot());

        assertEquals(2, entry.getContents().size());
        Entry child = entry.getContents().get(1);
        assertEquals(4392763, child.getBytes());
        assertFalse(child.isDir());
        assertEquals("4.2MB", child.getSize());

        //Log.info(entry.getModified());
    }
}
