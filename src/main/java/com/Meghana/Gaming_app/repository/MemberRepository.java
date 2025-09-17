package com.Meghana.Gaming_app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Meghana.Gaming_app.entity.Member;

public interface MemberRepository extends MongoRepository<Member, String> {
}
