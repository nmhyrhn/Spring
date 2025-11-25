package com.example.spring.SpringDataJDBC;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository  extends CrudRepository<Member, Long> {
    //기본적인 CRUD 메서드(save, findByID, findAll,deleteByID) 자동 제공
    List<Member> findByName(String name);
    List<Member> findByEmail(String email);
    List<Member> findByNameContaining(String name);
    List<Member> findByAgeBetween(int min, int max);

    @Query("SELECT * FROM member WHERE age >= 13 AND age <=19")
    List<Member> findTeenAge();

}
