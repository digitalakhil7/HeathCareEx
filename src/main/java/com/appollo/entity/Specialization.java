package com.appollo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="spec_tab")
public class Specialization {
	@Id
	@Column(name="spec_id_col")
	private Long id;
	
	@Column(name="spec_code_col")
	private String code;
	@Column(name="spec_name_col")
	private String name;
	@Column(name="spec_note_col")
	private String note;
}
