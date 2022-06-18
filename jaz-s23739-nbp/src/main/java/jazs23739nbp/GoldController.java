package jazs23739nbp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/gold")
public class GoldController {
    private final GoldService goldService;

    public GoldController(GoldService goldService) {
        this.goldService=goldService;
    }

    @GetMapping("/getvalues/{tstart}/{tend}")
    public ResponseEntity<Gold> getGold(@PathVariable String tstart, @PathVariable String tend){
        return goldService.getGold(tstart,tend);
    }


}
