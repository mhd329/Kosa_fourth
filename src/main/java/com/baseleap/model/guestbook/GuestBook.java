package com.baseleap.model.guestbook;

import java.time.LocalDateTime;

import lombok.Data;


@Data
public class GuestBook {
    private Long id;
    private Long writerId;
    private Long ownerId;
    private String comment;
    private LocalDateTime createdAt;

    public GuestBook(){
        this.createdAt = LocalDateTime.now();
        setCreatedAt(LocalDateTime.now());
    }

    // Getters and Setters
}

