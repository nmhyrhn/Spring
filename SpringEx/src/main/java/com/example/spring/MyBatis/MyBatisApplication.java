package com.example.spring.MyBatis;

import com.example.spring.MyBatis.mapper.ArticleMapper;
import com.example.spring.MyBatis.mapper.MemberMapper;
import com.example.spring.MyBatis.model.Article;
import com.example.spring.MyBatis.model.Member;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class MyBatisApplication implements ApplicationRunner {
    @Autowired
    private final MemberMapper memberMapper;
    private final ArticleMapper articleMapper;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        int count = memberMapper.selectAllcount();
        log.info("Member count:{}", count);

        Member member = memberMapper
                .selectByEmail("SeounYoon@hanbit.co.kr")
                .orElseThrow();
        log.info("Member: {}", member);

        Article article = Article.builder()
                .title("Hello, MyBatis")
                .description("MyBatis is an SQL Mapper framework")
                .memberId(member.getId())
                .build();
        int inserted = articleMapper.insert(article);
        log.info("inserted:{}", inserted);

    }
}
