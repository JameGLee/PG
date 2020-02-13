package com.pg.ljh.dao;

import org.apache.ibatis.annotations.Param;

public interface AuthorDao {
    /**
     *
     * @param apenname  笔名
     * @param aname     真实姓名
     * @param ahead     头像
     * @param aidentitycard   身份证号码
     * @param aemail   邮箱
     * @param aintroduce   简介
     * @param phone   联系电话
     * @param apostcode   居住地邮编
     * @param aresidential  居住地详细地址
     * @return
     */
    int insertAuthor(@Param("apenname") String apenname,@Param("aname") String aname,@Param("ahead") String ahead,@Param("aidentitycard") Long aidentitycard,@Param("aemail") String aemail,
       @Param("aintroduce") String aintroduce,@Param("phone") Long phone,@Param("apostcode") Integer apostcode,@Param("aresidential") String aresidential);
}
