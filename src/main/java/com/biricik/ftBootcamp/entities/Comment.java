package com.biricik.ftBootcamp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.biricik.ftBootcamp.core.common.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="comments")
@EqualsAndHashCode(callSuper = false)
public class Comment extends BaseEntity{
	
	@Column(name ="comment")
	private String comment;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name ="product_id")
	private Product product;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

}
