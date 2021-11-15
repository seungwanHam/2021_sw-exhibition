package com.caerang.sw_exhibition.dto.guestbook;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Alias("GuestbookAddDto")
@NoArgsConstructor
@AllArgsConstructor
public class GuestbookAddDto {
    @NotNull private String guest_writer;
    @NotNull private String guest_content;
}
