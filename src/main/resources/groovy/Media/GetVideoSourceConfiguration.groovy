import org.springframework.context.support.ClassPathXmlApplicationContext;
def ctx = new ClassPathXmlApplicationContext("classpath:groovy/groovy-context.xml");
def cfg = ctx.getBean('videoSourceCfg');

response = new org.onvif.ver10.media.wsdl.GetVideoSourceConfigurationResponse();					
response.setConfiguration(cfg);					
response;
