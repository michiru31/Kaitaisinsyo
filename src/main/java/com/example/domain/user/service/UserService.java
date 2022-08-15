package com.example.domain.user.service;

import java.util.List;

import com.example.domain.user.model.MUser;

public interface UserService {

    /** ユーザー登録 */
    public void signup(MUser user);
<<<<<<< HEAD
    
    /*ユーザー取得*/
    public List<MUser>getUsers();
    
    /*ユーザー取得(1件)*/
    public MUser getUserOne(String userId);
=======

    /** ユーザー取得 */
    public List<MUser> getUsers();
>>>>>>> c2eb899df6849c3522453a9829d20305e7a0f851
}