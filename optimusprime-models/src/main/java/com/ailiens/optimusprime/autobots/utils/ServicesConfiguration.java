package com.ailiens.optimusprime.autobots.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class ServicesConfiguration implements EnvironmentAware{
	private final static Logger log = LoggerFactory.getLogger(ServicesConfiguration.class);

    private static RelaxedPropertyResolver propertyResolver;

    @Override
    public void setEnvironment(Environment environment) {
       propertyResolver = new RelaxedPropertyResolver(environment, "services.");
    }

	public String getCamundaURL() {
		return propertyResolver.getProperty("camunda",String.class,"") + "/engine-rest";
	}

	public String getFcmURL() {
		return propertyResolver.getProperty("fcm.base",String.class,"");
	}

    public String getPricingEngineURL() {
        return propertyResolver.getProperty("pricingEngine", String.class, ""); }

    public String getLmsURL() {
        return propertyResolver.getProperty("lms",String.class,"");
    }

    public String getImsURL() { return propertyResolver.getProperty("ims",String.class,""); }

    public String getIms2URL() { return propertyResolver.getProperty("ims2",String.class,""); }

    public String getImsEanDataURL() { return propertyResolver.getProperty("imsEan",String.class,""); }

    public String getIms2ReserveGlobalQuantityURL() { return propertyResolver.getProperty("imsReserveGlobalQuantity",String.class,""); }


    @Deprecated
    public String getImsFclistFilterURL() { return propertyResolver.getProperty("ims2FclistFilter",String.class,""); }

    public String getIms2UpdateStockToReserve() { return propertyResolver.getProperty("ims2UpdateStockToReserve",String.class,""); }


    public String getGatewayURL() { return propertyResolver.getProperty("gateway.base",String.class,""); }

    public String getPaymentsURL() { return propertyResolver.getProperty("kuber",String.class,""); }

    public static String getKeyCloakURL () {
        log.info("Keycloak URL IS: "+propertyResolver.getProperty("keycloak.url"), String.class, "");
        return propertyResolver.getProperty("keycloak.url", String.class, "");
    }

    public static String getKeyCloakUser () {
        return propertyResolver.getProperty("keycloak.username", String.class, "");
    }

    public static String getKeyCloakPassword() {
        return propertyResolver.getProperty("keycloak.password", String.class, "");
    }

    public static String getKeyCloakClientId() {
        return propertyResolver.getProperty("keycloak.clientId", String.class, "");
    }

    public static String getKeyCloakGrantType() {
        return propertyResolver.getProperty("keycloak.grantType", String.class, "password");
    }

    public String getMyAccountURL() {
		return propertyResolver.getProperty("myaccount",String.class,"");
	}

	public String getLoyaltyURL() {
		return propertyResolver.getProperty("loyalty",String.class,"");
	}

    public String getCheckoutURL() { return propertyResolver.getProperty("heimdall",String.class,""); }

    public String getNaradURL() { return propertyResolver.getProperty("narad",String.class,""); }

    public String getNaradCreateTemplateURL() { return propertyResolver.getProperty("narad_template",String.class,""); }

    public String getTicketingURL() { return propertyResolver.getProperty("ticketing",String.class,""); }

    public String getPcmURL() { return propertyResolver.getProperty("baahubali",String.class,""); }

    public String getUncleScroogeURL() { log.info("\n\n\nUncle Scrooge prrop: "+propertyResolver.getProperty("uncleScrooge", String.class, ""));return propertyResolver.getProperty("uncleScrooge", String.class, ""); }

    public String getQuicksilverURL() { return propertyResolver.getProperty("quicksilver",String.class,""); }

    public String getKongURL() { return propertyResolver.getProperty("kong",String.class,""); }

    public String getRedisURL(){
        return propertyResolver.getProperty("redisUrl",String.class,"");
    }

    public String getSambhaUrl() { return propertyResolver.getProperty("sambha.url",String.class,"");  } ///
    
    public String getRoadbusterURL(){
        return propertyResolver.getProperty("roadbuster",String.class,"");
    }

    public String getGatewayBookingOrderURL() { return propertyResolver.getProperty("gateway.booking",String.class,""); }

    public String getGatewaySellOrderURL() { return propertyResolver.getProperty("gateway.sell",String.class,""); }

    public String getFCMUpdateOrderQuantityAPI() {return propertyResolver.getProperty("fcm.updateOrderQuantity",String.class,""); }

    public String getChandlerURL() { return propertyResolver.getProperty("chandler", String.class,"");}
    public String getChandlerSellOrderURL() { return propertyResolver.getProperty("chandler.sell", String.class,"");}

    public String getOmsURL() { return propertyResolver.getProperty("oms.base", String.class, ""); }
    public String getOmsBTCreateOrder() { return propertyResolver.getProperty("oms.btCreateOrder", String.class,""); }
    public String getOmsBTOrderChangeStatus() { return propertyResolver.getProperty("oms.btOrderChangeStatus", String.class,""); }


    public String getTransporterBaseUrl() { return propertyResolver.getProperty("transporter.base", String.class, ""); }
    public String getTransporterSendMailUrl() { return  getTransporterBaseUrl() + propertyResolver.getProperty("transporter.sendMail", String.class, ""); }
    public String getIVRUrl() { return  propertyResolver.getProperty("transporter.sendIVR", String.class, ""); }
    public String isThirdPartyEnable() { return propertyResolver.getProperty("transporter.callThirdParty", String.class, ""); }


    public String getNickFuryCreateOrderURL() { return propertyResolver.getProperty("nickfuryCreateOrder", String.class,"");}

    public String getMyAccountCartURL(){ return propertyResolver.getProperty("cartUrl", String.class, "");}

    public String getMyAccountClearCartURL(){return propertyResolver.getProperty("clearCartUrl", String.class, "") ;}
    
    public String getSambhaBucketBasetUrl(){return propertyResolver.getProperty("sambhaBucket.baseUrl", String.class, "") ;}
    
    public String getServiceName(){return propertyResolver.getProperty("sambhaBucket.serviceName", String.class, "") ;}
    
    public String getDefaultInvoiceUrl(){return propertyResolver.getProperty("sambhaBucket.defaultInvoiceUrl", String.class, "") ;}
    
}
