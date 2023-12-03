class StringExample{
public static void main(String args[]){
String value = "Batch 20 is genius";
String val = "Bello BTS RM";
System.out.println(value.contains("genius"));
System.out.println(value.concat("By birth"));
System.out.println(value.equals("Batch 20 is genius"));
System.out.println(value.equalsIgnoreCase("Batch 20 is GENIUS"));
System.out.println(value.toUpperCase());
System.out.println(value.toLowerCase());
System.out.println(value.length());
System.out.println("charAt(): " + value.charAt(4));
System.out.println("compareTo (): " + value.compareTo(value));
System.out.println("compareTo (): " + value.compareTo(val));
System.out.println("compareToIgnoreCase(): " + value.compareToIgnoreCase(value));
System.out.println("compareToIgnoreCase(): " + value.compareToIgnoreCase(val));
System.out.println("indexOf(): " + value.indexOf('s'));
System.out.println("indexOf(): " + val.indexOf('S'));
System.out.println("is(): " + value.isEmpty());
System.out.println("replace(): " + value.replace("genius","intelligent"));
System.out.println("trim(): " + value.trim());
System.out.println("substring(): " + value.substring(3,11));
System.out.println("lastIndexOf(): " + value.lastIndexOf('i'));
System.out.println("hashCode(): " + value.hashCode());
System.out.println("format(): " + value.format("%x",5));
System.out.println("join(): " + String.join("/","namjoon","kim","rm"));
System.out.println("replaceAll(): " + value.replaceAll("i","I"));
}
}




