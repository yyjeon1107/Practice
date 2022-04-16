package com.test.join;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

	@Autowired
	private MemberRepository memberRepository;
	
	
	public Optional<Member> memberFind(String id) {
		return memberRepository.findById(id); //id 주면 객체 찾아옴
	}
	
}
