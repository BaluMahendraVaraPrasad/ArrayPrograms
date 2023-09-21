package arrays;

	import java.io.*;
	import java.util.*;
	import java.time.LocalDate;

	class Result {

	    public static String findDay(int day, int month, int year) {
	      int d=Integer.valueOf(day);
	      int m=Integer.valueOf(month);
	      int y=Integer.valueOf(year);
	      LocalDate date=LocalDate.of(y, m, d);
	      return date.getDayOfWeek().name();
	    }

	}

	public class FindDay {
	    public static void main(String[] args) throws IOException {
	        Scanner scn=new Scanner(System.in);
	        System.out.println("Enter day");
	        int day=scn.nextInt();
	        System.out.println("Enter Month");
	        int month=scn.nextInt();
	        System.out.println("Enter Year");
	        int year=scn.nextInt();
	        String res = Result.findDay(day, month, year);
	        System.out.println(res);
	    }
	}
