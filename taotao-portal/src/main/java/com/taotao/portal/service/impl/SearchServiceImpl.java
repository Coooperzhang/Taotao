package com.taotao.portal.service.impl;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.taotao.common.pojo.TaotaoResult;
import com.taotao.common.utils.HttpClientUtil;
import com.taotao.portal.pojo.SearchResult;
import com.taotao.portal.service.SearchService;

/**
 * 商品搜索Service
 * @author 李涵嵘
 *
 */
@Service
public class SearchServiceImpl implements SearchService {

	@Value("${SEARCH_BASE_URL}")
	private String SEARCH_BASE_URL;

	@Override
	public SearchResult search(String queryString, int page) {
		// 调用taotao-search服务
		// 查询参数
		HashMap<String, String> param = new HashMap<>();
		param.put("q", queryString);
		param.put("page", page + "");
		try {
			// 调用服务
			String json = HttpClientUtil.doGet(SEARCH_BASE_URL, param);
			// 把字符串转换为Java对象
			TaotaoResult taotaoresult = TaotaoResult.formatToPojo(json, SearchResult.class);
			if (taotaoresult.getStatus() == 200) {
				SearchResult result = (SearchResult) taotaoresult.getData();
				return result;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
