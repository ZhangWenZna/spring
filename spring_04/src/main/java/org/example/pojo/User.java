package org.example.pojo;

import lombok.Data;
import org.springframework.stereotype.Repository;

@Data
public class User {
    private Integer id;
    private String userName;
    private String nickName;
    private String password;

}
