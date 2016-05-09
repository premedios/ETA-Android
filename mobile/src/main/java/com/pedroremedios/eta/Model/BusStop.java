package com.pedroremedios.eta.Model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.activeandroid.query.Select;

/**
 * Created by user on 09/05/2016.
 */

@Table(name = "Bus Stop")
public class BusStop extends Model {

    @Column(name = "Bus Route Number")
    public String busroutenumber;

    @Column(name = "Micro Zone")
    public String microzonename;

    @Column(name = "Direction")
    public String direction;

    @Column(name = "Order")
    public Integer order;

    @Column(name = "SMS Code")
    public String smscode;

    @Column(name = "Stop Name")
    public String stopname;

    @Column(name = "Localization")
    public String localization;

    @Column(name = "Route Destination")
    public String routedestination;

    public BusStop(String[] DataLine) {
        super();

        this.busroutenumber = DataLine[0];
        this.microzonename = DataLine[1];
        this.direction = DataLine[2];
        this.order = Integer.valueOf(DataLine[3]);
        this.smscode = DataLine[4];
        this.stopname = DataLine[5];
        this.localization = DataLine[6];
        this.routedestination = DataLine[7];
    }

    public void SaveBusStop() {
        save();
    }

}
