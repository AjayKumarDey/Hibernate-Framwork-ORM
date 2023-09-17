package oneToMany;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Answer {

	
	@Id
	private int answerid;
	private String answer;
	
	@ManyToOne()
	private Question question;
	
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	public int getAnswerid() {
		return answerid;
	}
	public void setAnswerid(int answerid) {
		this.answerid = answerid;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
}
