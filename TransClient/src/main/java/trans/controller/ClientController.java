package trans.controller;

import static trans.constant.TransliterationConstant.REV_API_KEY;
import static trans.constant.TransliterationConstant.REV_APPNAME;
import static trans.constant.TransliterationConstant.REV_APP_ID;
import static trans.constant.TransliterationConstant.cat_delfault;
import static trans.constant.TransliterationConstant.contentLanguage;
import static trans.constant.TransliterationConstant.domain;
import static trans.constant.TransliterationConstant.platform;
import static trans.constant.TransliterationConstant.sourceLanguage;
import static trans.constant.TransliterationConstant.targetLanguage;
import static trans.constant.TransliterationConstant.transliteration;
import static trans.constant.TransliterationConstant.xForwardedFor;
import static trans.constant.TransliterationConstant.xRapidapiHost;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import trans.constant.TransliterationConstant;
import trans.model.TransliterationPayload;
import trans.response.TransliterationResponse;
import trans.response.TransliterationResponseElement;

@RestController
public class ClientController {
	
	@Autowired 
	private RestTemplate restTemplate;

	
	@GetMapping("/trans")
	public TransliterationResponseElement hello(@RequestBody TransliterationPayload body,
			@RequestHeader(REV_API_KEY) String revApiKey,
			@RequestHeader(REV_APP_ID) String revAppId,
			@RequestHeader(REV_APPNAME) String revAppName,
			@RequestHeader(sourceLanguage) String srcLang,
			@RequestHeader(targetLanguage) String tgtLang,
			@RequestHeader(name= contentLanguage, required = false) String cntLang,
			@RequestHeader(name= platform, required = false) String pltform,
			@RequestHeader(name= domain, required = false) Integer domain,
			@RequestHeader(name= xForwardedFor, required = false) String xForwardHeader,
			@RequestHeader(name= xRapidapiHost, required = false) String xRapidapiHost
			) {

		if(domain == null) {
			if(xRapidapiHost != null) {
				String[] dom= xRapidapiHost.split("-");
				Integer rapidDomain= TransliterationConstant.rapidApiReverseDomainMap.get(dom[2]);
				if(rapidDomain instanceof Integer)
					domain= rapidDomain;
				else
					domain= TransliterationConstant.rapidApiReverseDomainMap.get(cat_delfault);					
			}
			else
				domain= TransliterationConstant.rapidApiReverseDomainMap.get(cat_delfault);
		}
			
		MultiValueMap<String, Object> map= new LinkedMultiValueMap<String, Object>();
		map.add(REV_API_KEY, revApiKey);
		map.add(REV_APP_ID, revAppId);
		map.add(REV_APPNAME, revAppName);
		map.add(sourceLanguage, srcLang);
		map.add(targetLanguage, tgtLang);
		map.add(contentLanguage, cntLang);
		map.add(platform, pltform);
		map.add("domain", domain.toString());
		
		HttpEntity entity = new HttpEntity(body, map);
		
		TransliterationResponse transResp= new TransliterationResponse();
		TransliterationResponseElement res= transResp.getTransliterationResponseElement();
		
		ResponseEntity<TransliterationResponseElement> rest= restTemplate.exchange(transliteration, HttpMethod.POST, entity, TransliterationResponseElement.class);
		res = rest.getBody();
		return res;
		
	}
}
