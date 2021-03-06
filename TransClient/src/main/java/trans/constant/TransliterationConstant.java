package trans.constant;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TransliterationConstant {
	
	public static final String REV_API_KEY= "REV-API-KEY";
	public static final String REV_APP_ID= "REV-APP-ID";
	public static final String sourceLanguage= "src_lang";
	public static final String targetLanguage= "tgt_lang";
	public static final String contentLanguage= "cnt_lang";
	public static final String domain= "domain";
	public static final String platform = "platform";
	public static final String xForwardedFor = "X-Forwarded-For";
	public static final String REV_APPNAME ="REV-APPNAME";
	public static final String xRapidapiHost ="x-rapidapi-host";
	public static final String cat_delfault= "default";
	
	public static final String transliteration = "http://localhost:8082/transliteration/";
	
	public static final byte Category_Default = 1;
	

	public static final Map<Integer,String> rapidApiDomainMap = new ConcurrentHashMap<Integer,String>();
	public static final Map<String,Integer> rapidApiReverseDomainMap = new ConcurrentHashMap<String,Integer>();
	
	static {
				//Rapid API domain map
				rapidApiDomainMap.put(1, "default");
				rapidApiDomainMap.put(2, "names");
				rapidApiDomainMap.put(9, "travel");
				rapidApiDomainMap.put(25, "music");
				
				for(Integer key:rapidApiDomainMap.keySet()) {
					rapidApiReverseDomainMap.put(rapidApiDomainMap.get(key), key);
				}

	}
}
