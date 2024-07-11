package jh.sulroom.sulroom.config.emun;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {

    // 인증 및 권한 관련 에러
    AUTHENTICATION_FAILED(400, "아이디 또는 비밀번호가 옳지 않습니다."),
    ACCESS_DENIED(403, "접근이 거부 되었습니다."),
    UNAUTHORIZED(401, "인증되지 않은 사용자입니다."),

    // 회원 관련 에러
    MEMBER_NOT_FOUND(404, "회원 정보가 없습니다."),
    MEMBER_ALREADY_EXISTS(409, "이미 존재하는 회원입니다."),

    // 요청 관련 에러
    BAD_REQUEST(400, "잘못된 요청입니다."),
    METHOD_NOT_ALLOWED(405, "허용되지 않은 메소드입니다."),
    UNSUPPORTED_MEDIA_TYPE(415, "지원되지 않는 미디어 타입입니다."),

    // 서버 관련 에러
    INTERNAL_SERVER_ERROR(500, "서버에서 문제가 발생했습니다."),
    SERVICE_UNAVAILABLE(503, "서비스를 사용할 수 없습니다."),

    // 데이터 관련 에러
    DATA_NOT_FOUND(404, "데이터를 찾을 수 없습니다."),
    DATA_INTEGRITY_VIOLATION(409, "데이터 무결성 위반입니다.");


    private final int code;
    private final String msg;
}