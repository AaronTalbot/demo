package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class EntryFileReader {
    public List<Record> read(InputStream input) throws IOException {
        List<Record> records = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(input))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");
                if (parts.length == 7) {
                    UUID uuid = UUID.fromString(parts[0]);
                    String id = parts[1];
                    String name = parts[2];
                    String likes = parts[3];
                    String transport = parts[4];
                    double avgSpeed = Double.parseDouble(parts[5]);
                    double topSpeed = Double.parseDouble(parts[6]);

                    Record record = new Record(uuid, id, name, likes, transport, avgSpeed, topSpeed);
                    records.add(record);
                } else {
                    // Handle invalid input line
                }
            }
        }

        return records;
    }
}
