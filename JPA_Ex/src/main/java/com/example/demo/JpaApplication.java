package com.example.demo;

import com.example.demo.model.Member;
import com.example.demo.repository.MemberRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class JpaApplication implements ApplicationRunner {
    @Autowired
    private MemberRepository memberRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        var member = Member.builder()
                .name("윤서준")
                .email("SeonjunYoon@hanbit.com.kr")
                .age(10).build();
        memberRepository.save(member);
        log.info("회원 = {}", member);

        member = Member.builder()
                .name("윤광철")
                .email("KwangcheolYoon@hanbit.com.kr")
                .age(43).build();
        memberRepository.save(member);

        member = Member.builder()
                .name("윤서준")
                .age(10).build();
        Example<Member> example = Example.of(member);

        var members = memberRepository.findAll(example);
        log.info("회원 = {}", members);
    }
}
