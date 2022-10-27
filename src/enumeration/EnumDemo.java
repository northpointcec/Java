package enumeration;

enum Month {
    JAN , FEB, MARCH,APRIL, MAY,JULY, AUG,JUN,SEP,OCT, NOV,DEC;
}
class EnumDemo{
    
    public static void main(String[] args) {
        
        Month mo = Month.MARCH;
        switch(mo) {
        case JAN:
            System.out.println("Holy month of lord shiva");
            break;
        case FEB :
            System.out.println("Golden days of the year");
            break;
        case MARCH:
            System.out.println("Month of hindu new year");
            break;
            default :
                System.out.println("good month");
    }
  }
}
