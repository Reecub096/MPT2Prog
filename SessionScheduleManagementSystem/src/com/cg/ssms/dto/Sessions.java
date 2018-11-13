package com.cg.ssms.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "ScheduledSessions")
public class Sessions {
		
		@Id
		@Column(name = "id")
		@NotNull(message = " Session Id cannot be null ")
		Integer id;
		@Column(name = "name")
		@NotEmpty(message = "Session Name cannot be empty ")
		String name;
		@Column(name = "duration")
		Integer duration;
		@Column(name = "faculty")
		String faculty;
		@Column(name = "mode1")
		String mode;
		
		public Sessions() {
			// TODO Auto-generated constructor stub
		}
		
		public Sessions(Integer id, String name, Integer duration,
				String faculty, String mode) {
			super();
			this.id = id;
			this.name = name;
			this.duration = duration;
			this.faculty = faculty;
			this.mode = mode;
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
		
		public Integer getDuration() {
			return duration;
		}
		
		public void setDuration(Integer duration) {
			this.duration = duration;
		}
		
		public String getFaculty() {
			return faculty;
		}
		
		public void setFaculty(String faculty) {
			this.faculty = faculty;
		}
		
		public String getMode() {
			return mode;
		}
		
		public void setMode(String mode) {
			this.mode = mode;
		}

		@Override
		public String toString() {
			return "Sessions [id=" + id + ", name=" + name + ", duration="
					+ duration + ", faculty=" + faculty + ", mode=" + mode
					+ "]";
		}
		
}
