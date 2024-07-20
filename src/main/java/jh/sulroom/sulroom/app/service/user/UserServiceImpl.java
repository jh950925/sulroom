package jh.sulroom.sulroom.app.service.user;

import jh.sulroom.sulroom.app.mapper.user.UserMapper;
import jh.sulroom.sulroom.app.model.dto.user.UserVo;
import jh.sulroom.sulroom.app.model.entity.user.UserEntity;
import jh.sulroom.sulroom.config.http.ApiResponseVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService{

    private ApiResponseVo apiResponseVo;
    private UserMapper userMapper;


    /**
     * 회원 가입
     * @param userVo 
     * @return UserVo
     */
    @Override
    public UserVo signup(UserVo userVo) {
        UserEntity entity = new UserEntity();

        entity.setUserId(userVo.getUserId());
        entity.setUserPassword(userVo.getPassword());
        entity.setUserName(userVo.getUserName());
        entity.setUserAge(userVo.getUserAge());

        int result = userMapper.insertUser(entity);

        System.out.println("result = " + result);

        return result > 0 ?  userVo : null;
    }

    /**
     * 아이다 찾기
     * @param userVo 
     * @return String
     */
    @Override
    public String findId(UserVo userVo) {

        UserVo userVO = new UserVo();
        
        // 이름, 생년 월일, 이메일 메일
        
        return "";
    }

    /**
     * 비밀번호 찾기
     * @param userVo
     * @return String
     */
    @Override
    public String findPassword(UserVo userVo) {
        return "";
    }

    /**
     * 회원정보 수정
     * @param userVo 
     * @return
     */
    @Override
    public UserVo modifyUser(UserVo userVo) {
        return null;
    }

    /**
     * 로그인
     * @param userVo 
     * @return String
     */
    @Override
    public String login(UserVo userVo) {
        return "";
    }

    /**
     * 로그아웃
     * @param userVo 
     */
    @Override
    public void logout(UserVo userVo) {

    }

}
