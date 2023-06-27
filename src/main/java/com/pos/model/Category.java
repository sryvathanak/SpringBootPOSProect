package com.pos.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Category")
public class Category {

	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(name="id")
	  private Long id;
	  @Column(name="code")
	  private String code;
	  @Column(name="title")
	  private String title;
	  @Column(name="title_kh")
	  private String title_kh;
	  @Column(name = "status")
	  private int status;
	  
	  @OneToMany(mappedBy = "category")
	  private List<Product>products;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle_kh() {
		return title_kh;
	}
	public void setTitle_kh(String title_kh) {
		this.title_kh = title_kh;
	}
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Category(Long id, String code, String title, String title_kh) {
		super();
		this.id = id;
		this.code = code;
		this.title = title;
		this.title_kh = title_kh;
	}
	public Category() {
		// TODO Auto-generated constructor stub
	}
	  
	  
}
