package com.iu.b5.member;


import java.sql.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class MemberVO {

	@NotBlank
	private String id;
	@Length(min = 6, max = 12)
	private String pw;
	private String pwCheck;
	@NotBlank
	private String name;
	@Email
	private String email;
	@NotNull
	@Range(min = 0, max = 150)
	private Integer age;
	@Past
	@DateTimeFormat(pattern = "yyyyMMdd")
	private java.util.Date birth;
	private String role;
	
	private MemberFilesVO memberFile;
	private Integer idCheck;
}
