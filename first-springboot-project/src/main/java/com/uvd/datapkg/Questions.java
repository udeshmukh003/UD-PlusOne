package com.uvd.datapkg;

import java.util.List;

public class Questions {
	
	private String id;
	private String description;
	private String correctanswer;
	
	private List<String> options;
	
	public Questions(){
		
	}

	public Questions(String id, String description, String correctanswer, List<String> options) {
		super();
		this.id = id;
		this.description = description;
		this.correctanswer = correctanswer;
		this.options = options;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCorrectanswer() {
		return correctanswer;
	}

	public void setCorrectanswer(String correctanswer) {
		this.correctanswer = correctanswer;
	}

	public List<String> getOptions() {
		return options;
	}

	public void setOptions(List<String> options) {
		this.options = options;
	}

	@Override
	public String toString() {
		return "Questions [id=" + id + ", description=" + description + ", correctanswer=" + correctanswer
				+ ", options=" + options + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Questions other = (Questions) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}



	
	

}
