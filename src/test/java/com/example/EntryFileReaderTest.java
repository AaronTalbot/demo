package com.example;

import com.example.EntryFileReader;
import com.example.Record;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EntryFileReaderTest {

    @Test
    public void testReadValidFile() throws IOException {
        String inputContent = "18148426-89e1-11ee-b9d1-0242ac120002|1X1D14|John Smith|Likes Apricots|Rides A Bike|6.2|12.1\n" +
                "3ce2d17b-e66a-4c1e-bca3-40eb1c9222c7|2X2D24|Mike Smith|Likes Grape|Drives an SUV|35.0|95.5\n" +
                "1afb6f5d-a7c2-4311-a92d-974f3180ff5e|3X3D35|Jenny Walters|Likes Avocados|Rides A Scooter|8.5|15.3";

        EntryFileReader entryFileReader = new EntryFileReader();

        ByteArrayInputStream inputStream = new ByteArrayInputStream(inputContent.getBytes());

        List<Record> records = entryFileReader.read(inputStream);

        assertEquals(3, records.size());
    }

}
