package com.digitalholics.iotheraphy.Social.resource;

import lombok.*;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class CreateReviewResource {
    private Integer id;
    private String content;
    private Integer score;
    private Integer physiotherapistId;
}
