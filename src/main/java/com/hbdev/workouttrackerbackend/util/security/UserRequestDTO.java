package com.hbdev.workouttrackerbackend.util.security;

import com.hbdev.workouttrackerbackend.util.BaseRequestDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequestDTO extends BaseRequestDTO {

    private String username;

    private String firstName;

    private String lastName;

    private String password;

    private String email;

    private String photoLink;

}
