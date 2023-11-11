package com.user.entity;

import javax.persistence.*;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "USER_TB")
public class User {

    @Id
    private String userId;
    private String userName;
    private String userEmail;
    private String userAbout;

    @Transient // to ignore this from saving to DB
    private List<Rating> ratingList = new ArrayList<>();
}
