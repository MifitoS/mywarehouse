package com.warehouse.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
public class Bird {
    public Bird() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //species - вид

    @NotBlank(message = "BirdSpecies should not be empty")
    private String birdSpecies;

    @NotBlank(message = "This is a required field")
    private String color;

    private Boolean fly;


    @ManyToOne
    @JoinColumn(name = "nest_id")
    private Nest nest;
}
