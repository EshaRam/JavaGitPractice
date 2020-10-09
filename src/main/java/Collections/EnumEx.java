package Collections;

 enum Months{
     JANUARY,
     FEBRUARY,
     MARCH,
     APRIL,
     MAY,JUNE,JULY,AUGUST,SEPTEMBER,OCTOBER,NOVEMBER,DECEMBER


}

public class  EnumEx {
     Months mon;

     public EnumEx(Months mon){

        this.mon = mon;
     }
     public void getMonth() {
         switch (mon) {

             case JANUARY:
                 System.out.println("if you are born before JAN 19 your zodiac is Capricorn after JAN 19 Aquarius");
                 break;
             case FEBRUARY:
                 System.out.println("if you are born before FEB 19 your zodiac is Aquarius after Feb 20 Pisces");
                 break;
             case MARCH:
                 System.out.println("if you are born before Mar 20 your zodiac is Pisces after Mar 21 Aries");
                 break;
             case APRIL:
                 System.out.println("if you are born before April 20 your zodiac is Aries after Apr 21 Aquarius");
                 break;
             case MAY:
                 System.out.println("if you are born before MAY 20 your zodiac is Taurus after May 21 Gemini");
                 break;
             case JUNE:
                 System.out.println("if you are born before JUN 20 your zodiac is Gemini after JUN 21 Cancer");
                 break;
             case JULY:
                 System.out.println("if you are born before JUl 22 your zodiac is Cancer after JUl 23 Leo");
                 break;
             case AUGUST:
                 System.out.println("if you are born before Aug 22 your zodiac is Leo after Aug 23 Virgo");
                 break;
             case SEPTEMBER:
                 System.out.println("if you are born before Sep 22 your zodiac is Virgo after Sep 23 Libra");
                 break;
             case OCTOBER:
                 System.out.println("if you are born before OCT 22 your zodiac is Libra after OCT 23 Scorpio");
                 break;
             case NOVEMBER:
                 System.out.println("if you are born before NOV 22 your zodiac is Scorpio after NOV 23 Sagittarius ");
                 break;
             case DECEMBER:
                 System.out.println("if you are born before DEC 21 your zodiac is Sagittarius  after DEC 22 Capricorn");
                 break;
             default:
                 System.out.println("Please enter a valid month");

         }
     }

    public static void main(String[] args) {
        EnumEx enumEx = new EnumEx(Months.MARCH);
        enumEx.getMonth();
        EnumEx enumEx1 = new EnumEx(Months.AUGUST);
        enumEx1.getMonth();
        for(Months mon : Months.values()){
            System.out.println(mon);
        }

    }

}
