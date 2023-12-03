package com.example.BookMyShow.models;

import com.example.BookMyShow.models.enums.AuditoriumFeature;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Auditorium extends BaseModel{
    private String name;

    @OneToMany
    private List<Seat> seats;

    @OneToMany
    private List<Show> shows;

    @ElementCollection          //since it is a list of enums we need this
    @Enumerated(EnumType.STRING)
    private List<AuditoriumFeature> auditoriumFeatures;


}
