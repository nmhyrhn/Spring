package com.example.spring.MyBatis.mapper;

import com.example.spring.MyBatis.model.Article;
import org.apache.ibatis.annotations.*;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface ArticleMapper {
    @Update("""
    UPDATE "mydb".article
        SET title = #{title}, description=#{description},
            updated=CURRENT_TIMESTAMP
        WHERE id=#{id}
    """)
    int update(@Param("id") Long id, @Param("title") String title,
               @Param("description") String description);


    @Insert("""
    INSERT INTO "mydb".article(title, description, created, updated, member_id)
        VALUES(#{article.title}, #{article.description},
               CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, #{article.memberId})
    """)
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    int insert(@Param("article") Article article);


    @Delete("DELETE article WHERE id=#{id}")
    int deleteById(@Param("id") Long id);

    @Delete("DELETE article WHERE member_id=#{member_id}")
    int deleteByMemberId(@Param("member_id") Long memberId);

    @Delete("DELETE article")
    int deleteAll();



//    @Results(id="articleResult", value={
//            @Result(property = "title", column="title"),
//            @Result(property = "description", column = "content"),
//            @Result(property = "memberId", column = "member_Id")
//    })

//    @Select("SELECT * FROM article")
//    List<Article> selectAll();
//
//    @ResultMap("articleResult")
//    @Select("SELECT * FROM article WHERE id=#{id}")
//    Optional<Article> selectById(@Param("id") Long id);
//
//    @Select("SELECT * FROM article WHERE member_id=#{memberId}")
//    @ResultMap("articleResult")
//    List<Article> selectByMemberId(@Param("memberId") Long memberId);
//
//    @Select("SELECT COUNT(*) FROM article")
//    int selectCount();



//    @Select("SELECT * FROM article")
//    List<Article> selectAll();
//
//    @Select("SELECT COUNT(*) FROM article")
//    int selectAllcount();
////
//    @Select("SELECT * FROM article WHERE id=#{id}")
//    Optional<Article> selectById(@Param("id") Long id);
//
//    @Select("SELECT * FROM article WHERE member_id=#{memberId}")
//    List<Article> selectBUMemberID(@Param("memberId") Long memberId);
//

}
