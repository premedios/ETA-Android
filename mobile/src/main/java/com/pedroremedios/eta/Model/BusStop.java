package com.pedroremedios.eta.Model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.activeandroid.query.Select;

/**
 * Created by user on 09/05/2016.
 */

@Table(name = "BusStop")
public class BusStop extends Model {

    @Column(name = "BusRouteNumber")
    public String busroutenumber;

    @Column(name = "MicroZone")
    public String microzonename;

    @Column(name = "Direction")
    public String direction;

    @Column(name = "ListingOrder")
    public Integer order;

    @Column(name = "SMSCode")
    public String smscode;

    @Column(name = "StopName")
    public String stopname;

    @Column(name = "Localization")
    public String localization;

    @Column(name = "RouteDestination")
    public String routedestination;

    public BusStop() {

    }
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
