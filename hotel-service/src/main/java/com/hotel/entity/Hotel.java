package com.hotel.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "HOTEL_TB")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Hotel {
    @Id
    private String id;
    private String name;
    private String location;
    private String about;

}
