package jh.sulroom.sulroom.app.service.user;

import jh.sulroom.sulroom.app.model.dto.user.UserVo;

public interface UserService {

    // 회원가입
    UserVo userAdd(UserVo userVo);

    // ID 찾기
    UserVo userSearchId(UserVo userVo);

    // 비밀번호 찾기
    UserVo userSearchPass(UserVo userVo);

    // 로그인
    UserVo login(UserVo userVo);

    // 로그아웃
    void logout(UserVo userVo);

}
