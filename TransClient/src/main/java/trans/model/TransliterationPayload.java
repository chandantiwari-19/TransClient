package trans.model;

public class TransliterationPayload {
	
	private String[] data;
	
	private String userProvidedUUID;
	
	private Boolean abbreviate;
	
	private Integer noOfSuggestions;

	private Boolean isBulk;
	
	private Boolean convertNumber;
	
	private Boolean ignoreTaggedEntities;
	
	public String[] getData() {
		return data;
	}

	public void setData(String[] data) {
		this.data = data;
	}

	public String getUserProvidedUUID() {
		return userProvidedUUID;
	}

	public void setUserProvidedUUID(String userProvidedUUID) {
		this.userProvidedUUID = userProvidedUUID;
	}

	public Boolean getAbbreviate() {
		return abbreviate;
	}

	public void setAbbreviate(Boolean abbreviate) {
		this.abbreviate = abbreviate;
	}

	public Integer getNoOfSuggestions() {
		return noOfSuggestions;
	}

	public void setNoOfSuggestions(Integer noOfSuggestions) {
		this.noOfSuggestions = noOfSuggestions;
	}

	public Boolean getIsBulk() {
		return isBulk;
	}

	public void setIsBulk(Boolean isBulk) {
		this.isBulk = isBulk;
	}

	public Boolean getConvertNumber() {
		return convertNumber;
	}

	public void setConvertNumber(Boolean convertNumber) {
		this.convertNumber = convertNumber;
	}

	public Boolean getIgnoreTaggedEntities() {
		return ignoreTaggedEntities;
	}

	public void setIgnoreTaggedEntities(Boolean ignoreTaggedEntities) {
		this.ignoreTaggedEntities = ignoreTaggedEntities;
	}
}
