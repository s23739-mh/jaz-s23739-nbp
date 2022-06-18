package jazs23739nbp.Class;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Gold {
    private final Integer id;
    private final GoldValues goldvalues;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private final Date tstart;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private final Date tend;
    private final float rate;
    private final Date trequest;

    public Gold(Integer id, GoldValues goldvalues, Date tstart, Date tend, float rate, Date trequest) {
        this.id = id;
        this.goldvalues = goldvalues;
        this.tstart = tstart;
        this.tend = tend;
        this.rate = rate;
        this.trequest = trequest;
    }

    public Integer getId() {
        return id;
    }

    public GoldValues getGoldvalues() {
        return goldvalues;
    }

    public Date getTstart() {
        return tstart;
    }

    public Date getTend() {
        return tend;
    }

    public float getRate() {
        return rate;
    }

    public Date getTrequest() {
        return trequest;
    }
}
