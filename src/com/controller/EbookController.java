package com.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;
import com.service.IBookService;
@Controller
public class EbookController {
	@Resource  
    private IBookService bookService = null; 
	@RequestMapping(value="/b.do")
	public void addrShow(HttpServletResponse response) throws IOException{
		response.setContentType("application/json;charset=UTF-8");
		response.getWriter().write(JSONObject.toJSONString(bookService.getBookById("59cc3a7f3ea44b15c1f92ac0")).toString());
	}
}
