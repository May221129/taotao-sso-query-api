package com.taotao.sso.query.api.service;

import com.taotao.sso.query.bean.User;

/**
 * 该接口是服务提供方所提供服务的接口。使用了dubbo。
 */
public interface QueryUserByTokenService {
	//根据token查询user对象：
	public User queryUserByToken(String token);
}
