package com.service;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.BookMapper;
import com.model.Book;
@Service("userService")
public class BookServiceImpl implements IBookService{
	@Resource
	private BookMapper bookDao;
	
//	@Override
//	public UserT getUserById(int userId) {
//		// TODO Auto-generated method stub
//		return this.userDao.selectByPrimaryKey(userId);
//	}
//

	@Override
	public Book getBookById(String bookId) {
		// TODO Auto-generated method stub
		return this.bookDao.selectByPrimaryKey(bookId);
	}
}
