package com.example.demo.entitys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "studentsnew", schema = "public")
public class StudentsNewEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "studenid")
	private Integer id;
	@Column(name = "name")
	private String name;
	@Column(name = "lastname")
	private String lastName;
	@Column(name = "mlastname")
	private String mLastName;
	@Column(name = "updated_at")
	private String updatedAt;

	public StudentsNewEntity() {

	}

	public StudentsNewEntity(Integer id, String name, String lastName, String mLastName, String updatedAt) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.mLastName = mLastName;
		this.updatedAt = updatedAt;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getmLastName() {
		return mLastName;
	}

	public void setmLastName(String mLastName) {
		this.mLastName = mLastName;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public String toString() {
		return "StudentsNewEntity [id=" + id + ", name=" + name + ", lastName=" + lastName + ", mLastName=" + mLastName
				+ ", updatedAt=" + updatedAt + "]";
	}

}
