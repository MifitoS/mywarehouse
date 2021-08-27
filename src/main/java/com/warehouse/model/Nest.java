package com.warehouse.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Set;


@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
public class Nest {
    public Nest() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "address should not be empty")
    private String address;
    //nestName - название. Например: куриное гнездо или воробьиное.
    private String nestName;


    @OneToMany(mappedBy = "nest", fetch = FetchType.LAZY)
    private Set<Bird> birds;
}
