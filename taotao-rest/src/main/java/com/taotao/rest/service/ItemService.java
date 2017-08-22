package com.taotao.rest.service;

import com.taotao.common.pojo.TaotaoResult;

public interface ItemService {
	
	/**
	 * 查询商品基本信息
	 * @param itemId
	 * @return
	 */
	TaotaoResult getItemBaseInfo(long itemId);
	
	/**
	 * 查询商品详细信息
	 * @param itemId
	 * @return
	 */
	TaotaoResult getItemDesc(long itemId);
	
	/**
	 * 查询商品规格参数
	 * @param itemId
	 * @return
	 */
	TaotaoResult getItemParam(long itemId);
	
}
