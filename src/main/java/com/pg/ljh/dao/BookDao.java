package com.pg.ljh.dao;

import java.util.List;

import com.pg.ljh.entity.Book;
import org.apache.ibatis.annotations.Param;

public interface BookDao {

	/**
	 * 通过ID查询单本图书
	 * 
	 * @param id
	 * @return
	 */
	Book queryById(long id);

	/**
	 * 查询所有图书
	 * 
	 * @param offset 查询起始位置
	 * @param limit 查询条数
	 * @return
	 */
	List<Book> queryAll(@Param("offset") int offset, @Param("limit") int limit);

	/**
	 * 减少馆藏数量
	 * 
	 * @param bookId
	 * @return 如果影响行数等于>1，表示更新的记录行数
	 */
	int reduceNumber(long bookId);

	/**
	 * 根据点击量查询书籍信息
	 * @return
	 */
	List<Book> selBookByClick();
	/**
	 * 书籍名、作者名查找
	 */
	List<Book> selBookByBookNameAndAuthor(@Param("bname") String bname,@Param("bauthor") String bauthor);

	/**
	 * 根据一周点击量排序分页
	 * @return
	 */
	List<Book> orderForBook();
	/**
	 * 搜索书籍
	 * @param keywords 根据关键字搜索
	 * @return
	 */
	List<Book> selBookByKeyWord(@Param("keywords") String keywords);

	/**
	 *
	 * @param bcover 书籍封面
	 * @param bname	  书籍名
	 * @param bauthor  作者
	 * @param roughly  书籍大致分类
	 * @param types     书籍详细分类
	 * @param bbrief     书籍简介
	 * @param bstatus   书籍是否完
	 * @param bispay	书籍是否付费
	 * @param bwords     书籍字数
	 * @return
	 */
	int insertBookByAuthor(@Param("bcover") String bcover,@Param("bname") String bname,@Param("bauthor") String bauthor,@Param("roughly") String roughly,@Param("types") String types,@Param("bbrief") String bbrief,@Param("bstatus") boolean bstatus,@Param("bispay") boolean bispay,@Param("bwords") long bwords);

	/**
	 *
	 * @param bbrief  书籍简介
	 * @param bstatus  书籍是否完结
	 * @param bispay   书籍是否付费
	 * @param bwords    书籍字数
	 * @return
	 */
	int updateBookInfor(@Param("bbrief") String bbrief,@Param("bstatus") boolean bstatus,@Param("bispay") boolean bispay,@Param("bwords") long bwords,@Param("bid") long bid);
}
