package com.example.BookMyShow.models;

import com.example.BookMyShow.models.enums.MovieFeatures;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Movie extends BaseModel{

    private String name;

    private String description;

    private String Language;

    @ManyToMany
    private List<Actor> actors;

    @Enumerated(EnumType.STRING)
    @ElementCollection
    private List<MovieFeatures> movieFeatures;
}
