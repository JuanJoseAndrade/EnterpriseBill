package edu.eci.arsw.services;



import edu.eci.arsw.httpConnection.ApiAlpha;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Service;

@Service("Stub")
public class ApiServiceStub implements ApiService {


    public ApiServiceStub() {
    }

    @Override
    public ArrayList<String> getAllJSON(String code) throws IOException {
        ArrayList<String> consultas=new ArrayList();
        consultas.add(getJSONDaily( code));
        consultas.add(getJSONWeekly( code));
        consultas.add(getJSONMonthly( code));
        consultas.add(getJSONIntraDay( code));
        return consultas;
}

    @Override
    public String getJSONDaily(String code) throws IOException {
        return ApiAlpha.getJson("DAILY", code);
    }

    @Override
    public String getJSONWeekly(String code) throws IOException {
        return ApiAlpha.getJson("WEEKLY", code);
    }

    @Override
    public String getJSONMonthly(String code) throws IOException {
        return ApiAlpha.getJson("MONTHLY", code);
    }

    @Override
    public String getJSONIntraDay(String code) throws IOException {
        return ApiAlpha.getJson("INTRADAY", code);
    }
}
