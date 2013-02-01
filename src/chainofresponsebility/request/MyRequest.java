package chainofresponsebility.request;

public class MyRequest {
	
	private String grade;
	private String content;
	
	public MyRequest(String type, String content){
		this.grade = type;
		this.content = content;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}


	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	

}
