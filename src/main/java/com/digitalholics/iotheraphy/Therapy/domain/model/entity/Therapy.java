package com.digitalholics.iotheraphy.Therapy.domain.model.entity;

import com.digitalholics.iotheraphy.Profile.domain.model.entity.Patient;
import com.digitalholics.iotheraphy.Profile.domain.model.entity.Physiotherapist;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "therapies")
public class Therapy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @NotNull
    @NotBlank
    @Column(name = "therapy_name")
    @Size(max = 300)
    private String therapyName;

    @NotNull
    @NotBlank
    private String description;


    @Column(name = "appointment_quantity")
    private String appointmentQuantity;


    @NotNull
    @NotBlank
    @Column(name = "start_at")
    private String startAt;

    @NotNull
    @NotBlank
    @Column(name = "finish_at")
    private String finishAt;

    @NotNull
    private Boolean finished;


    @ManyToOne
    @JoinColumn(name = "patient_id")
    @JsonIgnore
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "physiotherapist_id")
    @JsonIgnore
    private Physiotherapist physiotherapist;

}
