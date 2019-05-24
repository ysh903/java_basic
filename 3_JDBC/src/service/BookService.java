package service;

import java.util.List;
import vo.BookVO;

public interface BookService {//service는 무조건 인터페이스이다. 상호간 약속
	List<BookVO>bookList();
	int addBook(BookVO vo) throws Exception;
	
}
