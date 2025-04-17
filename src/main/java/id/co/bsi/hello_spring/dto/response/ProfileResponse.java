package id.co.bsi.hello_spring.dto.response;

import lombok.Data;

import java.util.Date;

@Data
public class ProfileResponse {
    private Long id;
    private String username;
    private String password;
    private String email;
    private String fullname;
    private String avatarUrl;
}
