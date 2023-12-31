package com.digitalholics.iotheraphy.Profile.resource;

import com.digitalholics.iotheraphy.Security.Domain.Model.Entity.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdatePhysiotherapistResource {
    private String dni;
    private String specialization;
    private Integer age;
    private String location;
    private String photoUrl;
    private String birthdayDate;
    private Double rating;
    private Integer consultationQuantity;
    private Integer patientQuantity;
    private Integer yearsExperience;
    private Double fees;
    private User user;
}
