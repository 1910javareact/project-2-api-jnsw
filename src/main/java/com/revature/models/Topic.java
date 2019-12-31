package com.revature.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "topic",schema="TopChat")
@Entity
public class Topic {
	
	@Id
	@Column(name="topic_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int topicId;
	
	@Column(name = "topic_name")
	private String topicName;
	
	@Column(name = "created")
	private String created;
	 
	@OneToMany(mappedBy = "topic")
	private List<Board> topicBoards;

	/**
	 * 
	 */
	public Topic() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((created == null) ? 0 : created.hashCode());
		result = prime * result + ((topicBoards == null) ? 0 : topicBoards.hashCode());
		result = prime * result + topicId;
		result = prime * result + ((topicName == null) ? 0 : topicName.hashCode());
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
		Topic other = (Topic) obj;
		if (created == null) {
			if (other.created != null)
				return false;
		} else if (!created.equals(other.created))
			return false;
		if (topicBoards == null) {
			if (other.topicBoards != null)
				return false;
		} else if (!topicBoards.equals(other.topicBoards))
			return false;
		if (topicId != other.topicId)
			return false;
		if (topicName == null) {
			if (other.topicName != null)
				return false;
		} else if (!topicName.equals(other.topicName))
			return false;
		return true;
	}

	/**
	 * @param topicId
	 * @param topicName
	 * @param created
	 * @param topicBoards
	 */
	public Topic(int topicId, String topicName, String created, List<Board> topicBoards) {
		super();
		this.topicId = topicId;
		this.topicName = topicName;
		this.created = created;
		this.topicBoards = topicBoards;
	}

	public int getTopicId() {
		return topicId;
	}

	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public List<Board> getTopicBoards() {
		return topicBoards;
	}

	public void setTopicBoards(List<Board> topicBoards) {
		this.topicBoards = topicBoards;
	}

	@Override
	public String toString() {
		return "Topic [topicId=" + topicId + ", topicName=" + topicName + ", created=" + created + ", topicBoards="
				+ topicBoards + ", hashCode()=" + hashCode() + ", getTopicId()=" + getTopicId() + ", getTopicName()="
				+ getTopicName() + ", getCreated()=" + getCreated() + ", getTopicBoards()=" + getTopicBoards()
				+ ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
