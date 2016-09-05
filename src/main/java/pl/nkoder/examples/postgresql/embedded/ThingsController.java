package pl.nkoder.examples.postgresql.embedded;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class ThingsController {

    private final ThingsRepository thingsRepository;

    @Autowired
    public ThingsController(ThingsRepository thingsRepository) {
        this.thingsRepository = thingsRepository;
    }

    @RequestMapping(path = "things", method = GET)
    @ResponseStatus(OK)
    public Iterable<Thing> getThings() {
        return thingsRepository.findAll();
    }
}
