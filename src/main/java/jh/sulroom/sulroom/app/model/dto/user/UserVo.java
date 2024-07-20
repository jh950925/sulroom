package jh.sulroom.sulroom.app.model.dto.user;

import lombok.Data;

@Data
public class UserVo {

    private String userId;          // 사용자아이디
    private String password;        // 사용자비밀번호
    private String userName;        // 사용자명
    private int userAge;         // 사용자 나이

}
