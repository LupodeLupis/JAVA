public class InchesToCentimeters {

    public static void main(String[] args) {

        calcFeetAndInchesToCentimeters(6,-13);

        calcFeetAndInchesToCentimeters(-10);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        // 1 feet = 12 inches
        // 1 inches = 2.54
        double centimeters = 0.0;


            if ( feet >=0 && inches >= 0 && inches <= 12){

                centimeters = (feet * 12) * 2.54;
                centimeters += inches * 2.54;
                System.out.print(feet + "feet + " + inches + "inches = " + centimeters + " centimeter");

            } else{

                return -1;
            }
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){

        if( inches < 0){
            return -1;
        }

        double feet = (int) inches / 12;
        double remindInches = (int) inches % 12;

        System.out.println(inches + " inches are equal to " + feet + " feet and " + remindInches + "inches" );
        return calcFeetAndInchesToCentimeters(feet,remindInches);

    }



}
