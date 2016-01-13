import com.bp3.brazosopen.activiti.model.SiteInfo
import com.fasterxml.jackson.databind.ObjectMapper

/**
 * @author gdharley
 *
 */

def mapper = new ObjectMapper()

List<SiteInfo> sites = new ArrayList<>();
SiteInfo theSite = new SiteInfo();
//List<String> towers = new ArrayList<>();


SiteInfo site = new SiteInfo()
site.setId(1l);
site.setName("Brokeback Mountain");
site.setDescription("34 GE 4347 Wind Turbines");
site.setLatitude("51.37");
site.setLongitude("-113.42");
site.setMarkerLatitude("51.37");
site.setMarkerLongitude("-113.42");
site.setMarkerTitle("Brokeback 1");
//towers.add("BM1234");
//towers.add("BM2345");
//site.setTowers(towers);

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
//towers = new ArrayList<>();
//towers.add("BH1234");
//towers.add("BH2345");
//site.setTowers(towers);
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
//towers = new ArrayList<>();
//towers.add("DV1234");
//towers.add("DV2345");
//site.setTowers(towers);
sites.add(site);

for (int i=0;i<sites.size();i++) {
    if(sites[i].id == input){
        theSite = sites[i]
    }
}

return mapper.writeValueAsString(theSite)


