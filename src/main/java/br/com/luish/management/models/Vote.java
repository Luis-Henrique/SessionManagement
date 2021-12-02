package br.com.luish.management.models;

import java.io.Serializable;
import java.util.Objects;

import br.com.luish.management.models.enums.VoteValue;

public class Vote implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String cpf;
	private Session session;
	private Integer voteValue;
	
	public Vote() {
	}

	public Vote(String cpf, Session session, VoteValue voteValue) {
		this.cpf = cpf;
		this.session = session;
		this.voteValue = voteValue.getCode();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	public Integer getVoteValue() {
		return voteValue;
	}

	public void setVoteValue(Integer voteValue) {
		this.voteValue = voteValue;
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
		Vote other = (Vote) obj;
		return Objects.equals(id, other.id);
	}
	

}
