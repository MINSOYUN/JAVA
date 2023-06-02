package com.library.dao;

import java.util.List;

import com.library.vo.Book;

public interface Dao {
   // 1.파일로부터 데이터를 읽어서 리스트에 담아 반환합니다.
   // 2.추상메서드 > 구현은 fileDao에서 
   List<Book> getList();
   // 3. Library 메서드에 있는 insert 메서드에 있음
   boolean saveFile(List<Book> list);
}
