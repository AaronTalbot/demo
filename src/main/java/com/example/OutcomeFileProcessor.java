package com.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OutcomeFileProcessor {
    private final ObjectMapper objectMapper = new ObjectMapper();

    public void generateOutcomeFile(List<Record> records, String outputFilePath) throws IOException {
        List<OutcomeRecord> outcomeRecords = processRecords(records);
        objectMapper.writeValue(new File(outputFilePath), outcomeRecords);
    }

    private List<OutcomeRecord> processRecords(List<Record> records) {
        List<OutcomeRecord> outcomeRecords = new ArrayList<>();
        for (Record record : records) {
            OutcomeRecord outcomeRecord = new OutcomeRecord(record.getName(), record.getTransport(), record.getTopSpeed());
            outcomeRecords.add(outcomeRecord);
        }
        return outcomeRecords;
    }

    private static class OutcomeRecord {
        private final String name;
        private final String transport;
        private final double topSpeed;

        public OutcomeRecord(String name, String transport, double topSpeed) {
            this.name = name;
            this.transport = transport;
            this.topSpeed = topSpeed;
        }
    }
}
