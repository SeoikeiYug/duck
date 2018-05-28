package com.seoi.duck.auth.service;

/**
 * @author shuaiqi
 * @create 2018-05-28 19:43
 * @desc auth service
 **/
public interface AuthService {

    String login(String username, String password) throws Exception;

    String refresh(String oldToken);

    void validate(String token) throws Exception;

    Boolean invalid(String token);

    String getUserNameByToken(String token);
}
