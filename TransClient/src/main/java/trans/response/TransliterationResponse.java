package trans.response;

public class TransliterationResponse {
	
	TransliterationResponseElement transliterationResponseElement;
	
	public TransliterationResponse() {
		this.transliterationResponseElement = new TransliterationResponseElement();
	}
	
	private String uuid;
	
	private String preProcessorResponse;

	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public TransliterationResponseElement getTransliterationResponseElement() {
		return transliterationResponseElement;
	}
	public void setResponseList(TransliterationResponseElement transliterationResponseElement) {
		this.transliterationResponseElement = transliterationResponseElement;
	}
	public String getPreProcessorResponse() {
		return preProcessorResponse;
	}
	public void setPreProcessorResponse(String preProcessorResponse) {
		this.preProcessorResponse = preProcessorResponse;
	}
	

}
