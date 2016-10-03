import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class EsercizioDate {

	public static void main(String[] args) {

		Date data1= new Date();
		
GregorianCalendar c= new GregorianCalendar();
		
System.out.println(data1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//		String date =sdf.format(new Date());	//trasforma la data in una stringa avente il formato giusto	
		String str = "10/01/2016";

try {
	c.setTime(sdf.parse(str));
//	data=sdf.parse(str);
} catch (ParseException e) {
	e.printStackTrace();
}


Date data=c.getTime();

		System.out.println(data);
		


		

	}

}
