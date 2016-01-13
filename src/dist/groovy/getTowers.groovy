import com.fasterxml.jackson.databind.ObjectMapper

/**
 * @author gdharley
 *
 */

def mapper = new ObjectMapper()
List<String> towers = new ArrayList<>();



if(input.id == 1){
    towers.add("BM4543");
    towers.add("BM1234");
} else if(input.id == 2){
    towers.add("BH4543");
    towers.add("BH1234");
} else if(input.id == 3){
    towers.add("DV4543");
    towers.add("DV1234");
}

return mapper.writeValueAsString(towers)


