package jazs23739nbp;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

@Service
public class GoldService {
    private static String RESOURCE_URL = "http://api.nbp.pl/api/cenyzlota/";
    private final RestTemplate restTemplate;

    public GoldService(RestTemplate restTemplate){
        this.restTemplate=restTemplate;
    }

    public ResponseEntity<Gold> getGold(String tstart, String tend){
    return restTemplate.getForEntity(RESOURCE_URL + tstart + "/"+tend,Gold.class);
    }

}
