package domain;

public class Question {
	private int questionid;
	private String question;
	private String A;
	private String B;
	private String C;
	private String D;
	private String answer;
	public int getQuestionid() {
		return questionid;
	}
	public void setQuestionid(int questionid) {
		this.questionid = questionid;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getA() {
		return A;
	}
	public void setA(String a) {
		A = a;
	}
	public String getB() {
		return B;
	}
	public void setB(String b) {
		B = b;
	}
	public String getC() {
		return C;
	}
	public void setC(String c) {
		C = c;
	}
	public String getD() {
		return D;
	}
	public void setD(String d) {
		D = d;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Question() {
		super();
	}
	
	
	public Question(String question, String a, String b, String c, String d, String answer) {
		super();
		this.question = question;
		A = a;
		B = b;
		C = c;
		D = d;
		this.answer = answer;
	}
	public Question(int questionid, String question, String a, String b, String c, String d, String answer) {
		super();
		this.questionid = questionid;
		this.question = question;
		A = a;
		B = b;
		C = c;
		D = d;
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Question [questionid:" + questionid + ", question:" + question + ", A:" + A + ", B:" + B + ", C:" + C
				+ ", D:" + D + ", answer:" + answer + "]";
	}
	
	
}
