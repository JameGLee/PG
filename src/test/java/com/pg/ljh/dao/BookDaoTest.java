package com.pg.ljh.dao;

import java.util.List;

import com.pg.ljh.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.pg.ljh.entity.Book;

public class BookDaoTest extends BaseTest {

	@Autowired
	private BookDao bookDao;

	@Test
	public void testQueryById() throws Exception {
		long bookId = 1000;
		Book book = bookDao.queryById(bookId);
		System.out.println(book);
	}

	@Test
	public void testQueryAll() throws Exception {
		List<Book> books = bookDao.queryAll(0, 4);
		for (Book book : books) {
			System.out.println(book);
		}
	}

	@Test
	public void testReduceNumber() throws Exception {
		long bookId = 1000;
		int update = bookDao.reduceNumber(bookId);
		System.out.println("update=" + update);
	}

	@Test
	public void testselBookByClick(){
		List<Book> books = bookDao.selBookByClick();
		for (Book book:
			 books) {
			System.out.println(book.getBname());
		}
	}

	@Test
	public void testSelBookByKeyWord(){
		String bookname = "骆驼祥子";
		String author="老舍";
		String brief = "的";
		String type = "小说";
		List<Book> bookList = bookDao.selBookByKeyWord("老");
		for (Book books :
				bookList) {
			System.out.println(books.toString()  );
		}

	}
	//测试  根据书名查找书籍信息
@Test
	public void testSelBookByName(){
		List<Book> book = bookDao.selBookByBookNameAndAuthor("茶馆",null);
		for (Book books :
			book) {
			System.out.println(books.toString());
		}
	}
	@Test
	public void testOrderForBook(){
		List<Book> books = bookDao.orderForBook();
		for (Book book :
				books) {
			System.out.println(book.toString());
		}
	}

	/**
	 * 测试  作者添加书籍
	 */
	@Test
	public void testInsertBookByAuthor(){
		int index = bookDao.insertBookByAuthor("12312321", "小王子", "xxx", "小说", "当代外国小说",
				"《小王子》是法国作家安托万·德·圣·埃克苏佩里于1942年写成的著名儿童文学短篇小说。本书的主人公是来自外星球的小王子。书中以一位飞行员作为故事叙述者，讲述了小王子从自己星球出发前往地球的过程中，所经历的各种历险。作者以小王子的孩子式的眼光，透视出成人的空虚、盲目，愚妄和死板教条，用浅显天真的语言写出了人类的孤独寂寞、没有根基随风流浪的命运。同时，也表达出作者对金钱关系的批判，对真善美的讴歌。",
				false,false,0);
		if (index>0){
			System.out.println("success");
		}

	}
	@Test
	public void textUpdateBookInfor(){
		int index = bookDao.updateBookInfor("adaswerfwersfasdwetretertiary", false, true, 2220, 2);
		if (index>0){
			System.out.println("success");
		}
	}
}
