package com.spring.multidatasource.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "flights")
@Data
@NoArgsConstructor
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "flight_number", nullable = false)
    private String flightNumber;

    @Column(name = "origin", nullable = false)
    private String origin;

    @Column(name = "destination", nullable = false)
    private String destination;

    public Flight(String flightNumber, String origin, String destination) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
    }
}
