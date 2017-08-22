package com.taotao.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.SocketException;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.junit.Test;

import com.taotao.common.utils.FtpUtil;

public class FTPTest {

	@Test
	public void testFtpClient() throws SocketException, IOException {
		// 创建一个FtpClient对象
		FTPClient ftpClient = new FTPClient();
		// 创建ftp连接。默认是21端口
		ftpClient.connect("127.0.0.1", 21);
		boolean login = ftpClient.login("lhr", "13435500980");
		System.out.println(login);
		// 上传文件。
		// 读取本地文件
		FileInputStream stream = new FileInputStream("D:\\timg.jpg");
//		 设置上传的路径
		ftpClient.changeWorkingDirectory("/image");
//		 修改上传文件的格式
		ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
//		 第一个参数：服务器端文档名
//		 第二个参数：上传文档的inputStream
		ftpClient.storeFile("timg.jpg", stream);
		ftpClient.logout();
		
	}

	
	@Test
	public void testFtpUtil() throws Exception{
		FileInputStream stream = new FileInputStream("D:\\timg.jpg");
		FtpUtil.uploadFile("127.0.0.1", 21, "lhr", "13435500980", "/image", "/2017/06/06", "timg.jpg", stream);
	}
}
