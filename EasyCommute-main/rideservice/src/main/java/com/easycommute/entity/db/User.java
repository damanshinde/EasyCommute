package com.easycommute.entity.db;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "users") // MongoDB collection
public class User {
    @Id
    private String id;
    private String name;
    private String email;
    private String role; // RIDER or DRIVER
//    private Location location; // Current location of the user
}