package trans.response;

import java.util.LinkedList;
import java.util.List;

public class TransliterationResponseElement {
	private List<TransliterationResponseNode> responseList = new LinkedList<>();
	
	
	public List<TransliterationResponseNode> getResponseList() {
		return responseList;
	}
	public void setResponseList(List<TransliterationResponseNode> responseList) {
		this.responseList = responseList;
	}

}
