import java.text.SimpleDateFormat;
import java.util.Date;
class Ist{
public static void main(String args[]){
SimpleDateFormat formatdate = new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss z");
Date date = new Date();
System.out.println(formatdate.format(date));
}
}