package com.hcl.java.StudentCousrse;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MonthCalculation {


        public void getNextMonth(String date) throws ParseException{


            DateFormat format = new SimpleDateFormat("MM/dd/yyyy");
            Date dt = format.parse(date);


            Date begining, end;

            {
                Calendar calendar = getCalendarForNow(dt);
                calendar.set(Calendar.DAY_OF_MONTH,calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
                setTimeToEndofDay(calendar);
                end = calendar.getTime();

                SimpleDateFormat endDt = new SimpleDateFormat("MM/dd/yyyy");
                String endStrDt = endDt.format(end);
                if(date != null && date.equalsIgnoreCase(endStrDt)){
                    System.out.println("Ending of the month");
                    calendar.add(Calendar.DAY_OF_MONTH, 1);
                    Date lastDate = calendar.getTime();
                    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
                    String lastDateofNextMonth = sdf.format(lastDate);
                    System.out.println("Next Month :"+lastDateofNextMonth);

                    Calendar c = getCalendarForNow(new Date(lastDateofNextMonth));
                    calendar.set(Calendar.DAY_OF_MONTH,calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
                    setTimeToEndofDay(calendar);
                    end = calendar.getTime();

                    SimpleDateFormat sfd = new SimpleDateFormat("MM/dd/yyyy");
                    String lastDated = endDt.format(end);
                    System.out.println("Testing side :"+lastDated);

                }else if (findLeapYear(dt)){
                    Calendar calendar3 = getCalendarForNow(dt);
                    calendar3.add(Calendar.YEAR, 1);
                    Date ds = calendar3.getTime();
                    SimpleDateFormat dtft = new SimpleDateFormat("MM/dd/yyyy");
                    String dates = dtft.format(ds);
                    dtft.setLenient(false);
                    System.out.println("YEAR : "+dates);

                }else{
                                    SimpleDateFormat dtft = new SimpleDateFormat("MM/dd/yyyy");
                    Calendar calendar2 = getCalendarForNow(dt);
                    System.out.println(" Calendar time :->> " + dtft.format(calendar2.getTime()));
                    int curre_month = calendar2.get(Calendar.MONTH);
                    int curre_day = calendar2.get(Calendar.DAY_OF_MONTH);
                    int curre_year = calendar2.get(Calendar.YEAR);

                    Date dat = calendar2.getTime();
                    calendar2.add(Calendar.DATE, 31);
                    Date ds = calendar2.getTime();
                    String dates = dtft.format(ds);
                    dtft.setLenient(false);
                    System.out.println("OTHER DAYS : "+dates);

                }
            }

        }

        private static boolean findLeapYear(Date dt){
            boolean isLeapYr = false;
            int yr = dt.getYear();
            if ((yr%4 == 0 && yr%100!=0)){
                isLeapYr = true;
               }
            return isLeapYr;
        }

        private static Calendar getCalendarForNow(Date dt) {
            Calendar calendar = GregorianCalendar.getInstance();
            calendar.setTime(dt);
            return calendar;
        }

        private static void setTimeToBeginningOfDay(Calendar calendar) {
            calendar.set(Calendar.HOUR_OF_DAY, 0);
            calendar.set(Calendar.MINUTE, 0);
            calendar.set(Calendar.SECOND, 0);
            calendar.set(Calendar.MILLISECOND, 0);
            calendar.set(Calendar.DAY_OF_MONTH, 1);
        }

        private static void setTimeToEndofDay(Calendar calendar) {
            System.out.println("For feb calling");
            calendar.set(Calendar.HOUR_OF_DAY, 23);
            calendar.set(Calendar.MINUTE, 59);
            calendar.set(Calendar.SECOND, 59);
            calendar.set(Calendar.MILLISECOND, 999);
        }


        public static void main(String[] args) {

            try {
                String janSt = "01/01/2014" ;
                    String janEnd = "01/31/2014" ;

                    String febSt = "02/01/2014" ;
                    String febEnd = "02/28/2014" ;

                    String marSt = "03/01/2014" ;
                    String marEnd = "03/31/2014" ;

                    String aprilSt = "04/01/2014" ;
                    String aprilEnd = "04/30/2014" ;

                    String maySt = "05/01/2014" ;
                    String mayEnd = "05/31/2014" ;

                    String juneSt = "06/01/2014" ;
                    String juneEnd = "06/30/2014" ;

                    String julySt = "07/01/2014" ;
                    String julyEnd = "07/31/2014" ;

                    String augSt = "08/01/2014" ;
                    String augEnd = "08/31/2014" ;

                    String sepSt = "09/01/2014" ;
                    String sepEnd = "09/30/2014" ;

                    String octSt = "10/01/2014" ;
                    String octEnd = "10/31/2014" ;

                    String novSt = "11/01/2014" ;
                    String novEnd = "11/30/2014" ;

                    String deceSt = "12/01/2014" ;
                    String deceEnd = "12/31/2014" ;

                    String jan15St="01/01/2015";
                    String jan15End="01/31/2015";

                    String leapyr = "02/29/2016";
                    String notaleapyr = "02/28/2015";

                new MonthCalculation().getNextMonth(febSt);
            } catch (ParseException e) {
                e.printStackTrace();
            }

        }
        }