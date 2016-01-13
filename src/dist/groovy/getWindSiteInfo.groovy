import com.bp3.brazosopen.activiti.model.SiteInfo
import groovy.json.JsonBuilder

/**
 * @author gdharley
 *
 */

def json = new JsonBuilder()

List<SiteInfo> sites = new ArrayList<>();

SiteInfo site = new SiteInfo()
site.setId(1l);
site.setName("Brokeback Mountain");
site.setDescription("34 GE 4347 Wind Turbines");
site.setLatitude("51.37");
site.setLongitude("-113.42");
site.setMarkerLatitude("51.37");
site.setMarkerLongitude("-113.42");
site.setMarkerTitle("Brokeback 1");
sites.add(site);

site = new SiteInfo()
site.setId(2l);
site.setName("Boot Hill");
site.setDescription("54 GE 4347 and 12 Siemens B-454 Wind Turbines");
site.setLatitude("29.25");
site.setLongitude("-103.75");
site.setMarkerLatitude("29.25");
site.setMarkerLongitude("-103.75");
site.setMarkerTitle("Boot Hill");
sites.add(site);

site = new SiteInfo()
site.setId(3l);
site.setName("Death Valley");
site.setDescription("97 Siemens B-454 Wind Turbines");
site.setLatitude("36.25");
site.setLongitude("-116.81");
site.setMarkerLatitude("36.25");
site.setMarkerLongitude("-116.81");
site.setMarkerTitle("Death Valley");
sites.add(site);

json(sites : sites);

return  json.toString();


