package com.metflix.JwtSecurity3.models;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

    private String userId;
    private String name;
    private String email;

}
