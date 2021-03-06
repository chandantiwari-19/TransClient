package trans.response;


import java.util.List;

public class TransliterationResponseNode {
	private String inString;

	private List<String> outString;
	private int apiStatus;
	
	public TransliterationResponseNode(String inString, List<String> outString, int apiStatus) {
		this.inString = inString;
		this.outString = outString;
		this.apiStatus = apiStatus;
	}
	
	public TransliterationResponseNode() {
		super();
	}

	public String getInString() {
		return inString;
	}
	public void setInString(String inString) {
		this.inString = inString;
	}
	public List<String> getOutString() {
		return outString;
	}
	public void setOutString(List<String> outString) {
		this.outString = outString;
	}
	public int getApiStatus() {
		return apiStatus;
	}
	public void setApiStatus(int apiStatus) {
		this.apiStatus = apiStatus;
	}
	

}
