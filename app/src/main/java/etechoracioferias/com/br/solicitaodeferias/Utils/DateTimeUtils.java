package etechoracioferias.com.br.solicitaodeferias.Utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeUtils {
    public static final DateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");

    public static String formatDate(int dia, int mes, int ano){
        try {
            Calendar c = Calendar.getInstance();
            c.set(ano, mes, dia);
            return DATE_FORMAT.format(c.getTime());
        }
        catch (Exception e){
            return null;

        }
    }
    public static Date toDate(String date)
    {
        try{
            return DATE_FORMAT.parse(date);
        }
        catch (ParseException e){
            return null;
        }
    }

}
