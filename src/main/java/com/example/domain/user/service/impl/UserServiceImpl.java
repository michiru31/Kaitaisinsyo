package com.example.domain.user.service.impl;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
=======
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

>>>>>>> c2eb899df6849c3522453a9829d20305e7a0f851
import com.example.domain.user.model.MUser;
import com.example.domain.user.service.UserService;
import com.example.repository.UserMapper;

@Service
public class UserServiceImpl implements UserService {

<<<<<<< HEAD
	@Autowired
	private UserMapper mapper;

	/** ユーザー登録 */
	@Override
	public void signup(MUser user) {
		user.setDepartmentId(1); // 部署
		user.setRole("ROLE_GENERAL"); // ロール
		mapper.insertOne(user);
	}

	/* ユーザー取得 */
	@Override
	public List<MUser> getUsers() {
		return mapper.findMany();
	}
	
	/*ユーザー取得(1件)*/
	@Override
	public MUser getUserOne(String userId) {
		return mapper.findOne(userId);
	}
=======
    @Autowired
    private UserMapper mapper;

    /** ユーザー登録 */
    @Override
    public void signup(MUser user) {
        user.setDepartmentId(1); // 部署
        user.setRole("ROLE_GENERAL"); // ロール
        mapper.insertOne(user);
    }

    /** ユーザー取得 */
    @Override
    public List<MUser> getUsers() {
        return mapper.findMany();
    }
>>>>>>> c2eb899df6849c3522453a9829d20305e7a0f851
}