package kr.or.kkwk.mapper;

import kr.or.kkwk.model.dto.member.MemberDto;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface MemberMapper {


    List<MemberDto> getMemberList();



}
