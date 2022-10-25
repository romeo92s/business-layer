package com.codestates.member;

import lombok.Getter;
import org.springframework.stereotype.Service;

import java.lang.reflect.Member;
import java.util.List;
@Service
@Getter
public class MemberService {
    public Member createMember(Member member) {
        // TODO should business logic

        // TODO member 객체는 나중에 DB에 저장 후, 되돌려 받는 것으로 변경 필요.
        Member createdMember = member;
        return createdMember;
    }

    public Member updateMember(Member member) {

        Member updatedMember = member;
        return updatedMember;
    }

    public Member findMember(long memberId) {

        Member member =
                new Member(memberId, "hgd@gmail.com", "홍길동", "010-1234-5678");
        return member;
    }

    public List<Member> findMembers() {

        List<Member> members = List.of(
                new Member(1, "hgd@gmail.com", "홍길동", "010-1234-5678"),
                new Member(2, "lml@gmail.com", "이몽룡", "010-1111-2222")
        );
        return members;
    }

    public void deleteMember(long memberId) {
    }
}