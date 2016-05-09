package com.pedroremedios.eta;

import java.io.InputStream;
import java.util.List;

import android.os.Bundle;
import android.util.Log;

import com.activeandroid.query.Select;
import com.pedroremedios.eta.Model.BusStop;

/**
 * Created by user on 09/05/2016.
 */
public class BusStopsFile {
    private CSVFile CodigoParagensFile;

    public BusStopsFile() {
        InputStream inputStream = getResources().openRawResource(R.raw.codigos_de_paragem);
        CodigoParagensFile = new CSVFile(inputStream);

        List busStops = CodigoParagensFile.read();

        for (int i=0; i<busStops.size(); i++) {
            BusStop busStop = new BusStop((String[]) busStops.get(i));
            busStop.SaveBusStop();
        }
    }

    public BusStop getFirstRecord() {
        return new Select().from(BusStop.class).limit(1).executeSingle();
    }

}
