package org.ashina.mycontact.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "class")


public class Class {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "teacher")
	private String teacher;
	
	
}
