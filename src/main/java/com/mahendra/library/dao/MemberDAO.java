package com.mahendra.library.dao;

import com.mahendra.library.models.Member;

public interface MemberDAO {
	int save(Member member);
	Member findById(int id);
}
