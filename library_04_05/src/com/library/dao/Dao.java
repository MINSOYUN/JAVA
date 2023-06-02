package com.library.dao;

import java.util.List;

import com.library.vo.Book;

// 인터페이스 -> 메서드의 구현만
public interface Dao {
	// 파일을 읽어서 리스트를 반환합니다
	public List<Book> getList();
	// ===========
	int delete(int no);
	int update(int no);
	int insert(Book book);
	// ================
	// 리스트를 파일로 출력
	boolean ListToFile(List<Book> list);
	
}
