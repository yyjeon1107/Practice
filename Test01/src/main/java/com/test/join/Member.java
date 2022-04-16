package com.test.join;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data//getter,setter, toString, 등등 역할
@Entity //테이블과 매핑
@Table(name="Member")
public class Member {
	
	 @Id
	 private String userId;
	 private String password;
	

}
