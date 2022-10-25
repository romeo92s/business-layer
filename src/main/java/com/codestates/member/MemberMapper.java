package com.codestates.member;


import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MemberMapper{
    Member memberPostDtoToMember(MemberPostDto memberPostDto);
    Member memberPatchDtoToMember(MemberPatchDto memberPatchDto);

    MemberResponseDto memberToMemberResponseDto(Member member);

}
//
//@Component
//public class MemberMapper {
//    public Member memberPostDtoToMember(MemberPostDto memberPostDto) {
//        return new Member(0L,
//                memberPostDto.getEmail(),
//                memberPostDto.getName(),
//                memberPostDto.getPhone());
//    }
//    public Member memberPatchDtoToMember(MemberPatchDto memberPatchDto) {
//        return new Member(memberPatchDto.getMemberId(), null,
//                memberPatchDto.getName(),
//                memberPatchDto.getPhone());
//    }
//
//    public MemberResponseDto memberToMemberResponseDto(Member member) {
//        return new MemberResponseDto(member.getMemberId(),
//                member.getEmail(),
//                member.getName(),
//                member.getPhone());
//    }
//}
