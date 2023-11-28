package com.example;

import java.util.UUID;

public class Record {
    private UUID uuid;
    private String id;
    private String name;
    private String likes;
    private String transport;
    private double avgSpeed;
    private double topSpeed;

    public Record(UUID uuid, String id, String name, String likes, String transport, double avgSpeed, double topSpeed) {
        this.uuid = uuid;
        this.id = id;
        this.name = name;
        this.likes = likes;
        this.transport = transport;
        this.avgSpeed = avgSpeed;
        this.topSpeed = topSpeed;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public double getAvgSpeed() {
        return avgSpeed;
    }

    public void setAvgSpeed(double avgSpeed) {
        this.avgSpeed = avgSpeed;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }
}
