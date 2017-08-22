package com.taotao.rest.solr;

import java.io.IOException;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrInputDocument;
import org.junit.Test;

public class SolrTest {
	
	@Test
	public void addDocument() throws SolrServerException, IOException{
		//创建一个连接
		SolrServer solrserver = new HttpSolrServer("http://127.0.0.1:9090/solr"); 
		//创建一个文档对象
		SolrInputDocument document = new SolrInputDocument();
		document.addField("id", "test001");
		document.addField("item_title", "测试商品");
		document.addField("item_price", 51242);
		//把文档对象写入索引库
		solrserver.add(document);
		//提交
		solrserver.commit();
	}
	
	@Test
	public void deleteDocument() throws Exception{
		//创建一个Solr连接
		SolrServer solrServer = new HttpSolrServer("http://127.0.0.1:9090/solr");
		//执行删除操作
		solrServer.deleteById("536563");
		//提交
		solrServer.commit();
	}
	
	@Test
	public void queryDocument() throws Exception {
		SolrServer solrServer = new HttpSolrServer("http://127.0.0.1:9090/solr");
		//创建一个查询对象
		SolrQuery query = new SolrQuery();
		//设置查询条件
		query.setQuery("*:*");
		query.setStart(0);
		query.setRows(10);
		//执行查询
		QueryResponse response = solrServer.query(query);
		//取查询结果
		SolrDocumentList solrDocumentList = response.getResults();
		System.out.println("共查询到记录：" + solrDocumentList.getNumFound());
		for (SolrDocument solrDocument : solrDocumentList) {
			System.out.println(solrDocument.get("id"));
			System.out.println(solrDocument.get("item_title"));
			System.out.println(solrDocument.get("item_price"));
			System.out.println(solrDocument.get("item_image"));
			
		}
	}
	
}
