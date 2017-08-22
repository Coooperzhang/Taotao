package com.taotao.rest.service;

import com.taotao.common.pojo.TaotaoResult;

public interface RedisService {
	
	/**
	 * 同步缓存操作
	 * @param contentCid
	 * @return
	 */
	TaotaoResult syncContent(Long contentCid);
	
}
