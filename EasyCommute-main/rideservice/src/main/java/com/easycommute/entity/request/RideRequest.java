package com.easycommute.entity.request;

import com.easycommute.util.Location;
import lombok.Data;

@Data
public class RideRequest {
//    private String rideId;// User ID of the host
    private String name;
    private String source;
    private String destination;
    private String date;
    private String time;
    private int cost;
    private int seats;
    private Location startLocation;
    private Location destinationLocation;
}

