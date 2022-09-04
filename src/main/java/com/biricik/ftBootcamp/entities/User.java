package com.biricik.ftBootcamp.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.biricik.ftBootcamp.core.common.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="users")
@EqualsAndHashCode(callSuper = false)
public class User  extends BaseEntity{
	

	@Column(name = "first_name",length = 50)
	private String firstName;
	
	@Column(name = "last_name",length = 50)
	private String lastName;
	
	@Column(name = "email",length = 50)
	private String email;
	
	@Column(name = "phone_number",length = 50)
	private String phoneNumber;
	
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "user")
	List<Comment> comments;

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
