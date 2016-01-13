import com.bp3.brazosopen.activiti.model.MaintenanceRecord
import com.fasterxml.jackson.databind.ObjectMapper

/**
 * @author gdharley
 *
 */

def mapper = new ObjectMapper()
List<MaintenanceRecord> records = new ArrayList<>();
List<MaintenanceRecord> selectedRecords = new ArrayList<>();

MaintenanceRecord mr = new MaintenanceRecord()
mr.setId(1l);
mr.setTechnician("Dr Emmett Brown");
mr.setDescription("Scheduled maintenance on flux capacitor.");
mr.setStatus("Closed");
mr.setType("Scheduled");
mr.setTower("BM1234");
records.add(mr);

mr = new MaintenanceRecord()
mr.setId(2l);
mr.setTechnician("Greg Brady");
mr.setDescription("Baseball fouled foil");
mr.setStatus("Closed");
mr.setType("Breakdown");
mr.setTower("BH1234");
records.add(mr);

mr = new MaintenanceRecord()
mr.setId(3l);
mr.setTechnician("Taylor Swift");
mr.setDescription("Just another breakup");
mr.setStatus("Closed");
mr.setType("Scheduled");
mr.setTower("DV4543");
records.add(mr);

mr = new MaintenanceRecord()
mr.setId(4l);
mr.setTechnician("Douglas Adams");
mr.setDescription("I love deadlines - I like th whooshing sound as they fly by");
mr.setStatus("Closed");
mr.setType("Follow Up");
mr.setTower("BM1234");
records.add(mr);

mr = new MaintenanceRecord()
mr.setId(5l);
mr.setTechnician("Napolean Bonaparte");
mr.setDescription("Impossible is a word to be found only in the dictionary of fools");
mr.setStatus("Closed");
mr.setType("Scheduled");
mr.setTower("DV4543");
records.add(mr);

for (int i=0;i<records.size();i++) {
    if(records[i].tower == input){
        selectedRecords.add(records[i]);
    }
}

return mapper.writeValueAsString(selectedRecords)


