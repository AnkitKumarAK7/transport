package com.example.transport.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "load")

public class Load {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String loadingPoint;

    String unloadingPoint;

    String productType;

    String truckType;

    Integer noOfTrucks;

    Integer weight;

    String comment;

    String shipperId;

    LocalDate date;

}