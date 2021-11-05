package com.caerang.sw_exhibition.dto.member;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Alias("MemberOfTeamDto")
@NoArgsConstructor
@AllArgsConstructor
public class MemberOfTeamDto {
    @NotNull private String mem_name;
    @NotNull private int mem_grade;
    private String mem_github;
    @NotNull private String mem_major;
}
