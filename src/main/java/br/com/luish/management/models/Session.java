package br.com.luish.management.models;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import br.com.luish.management.models.enums.SessionResult;
import br.com.luish.management.models.enums.SessionStatus;

public class Session implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private Integer result;
	private long time;
	private int totalVotes;
	private Integer status;
	private Map<String, Vote> votes = new HashMap<>();
	private Topic topic;
	
	public Session() {
	}

	public Session(long time, Topic topic) {
		this.time = time;
		this.topic = topic;
		this.result = SessionResult.ANDAMENTO.getCode();
		this.totalVotes  = 0;
		this.status = SessionStatus.ABERTA.getCode();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getResult() {
		return result;
	}

	public void setResult(Integer result) {
		this.result = result;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public int getTotalVotes() {
		return totalVotes;
	}

	public void setTotalVotes(int totalVotes) {
		this.totalVotes = totalVotes;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Map<String, Vote> getVotes() {
		return votes;
	}

	public void setVotes(Map<String, Vote> votes) {
		this.votes = votes;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Session other = (Session) obj;
		return Objects.equals(id, other.id);
	}
	
	

}
