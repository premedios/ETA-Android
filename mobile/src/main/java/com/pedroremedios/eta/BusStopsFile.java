package com.pedroremedios.eta;

import android.util.Log;

import java.io.InputStream;
import java.util.List;

import com.activeandroid.query.Select;
import com.pedroremedios.eta.Model.BusStop;

/**
 * Created by user on 09/05/2016.
 */
public class BusStopsFile {
    private CSVFile CodigoParagensFile;

    public BusStopsFile(InputStream inputStream) {

        BusStop firstRecord = getFirstRecord();
        Log.d("BusStopsFile", firstRecord.busroutenumber);
        if (getFirstRecord() == null) {
            CodigoParagensFile = new CSVFile(inputStream);

            List busStops = CodigoParagensFile.read();

            for (int i = 1; i < busStops.size(); i++) {
                BusStop busStop = new BusStop((String[]) busStops.get(i));
                busStop.SaveBusStop();
            }
        }
    }

    public BusStop getFirstRecord() {
        return new Select().from(BusStop.class).limit(1).executeSingle();
    }

}
