public class BarkingDog {

    public static void main(String[] args) {
        bark(true,-1);


    }

    public static boolean bark(boolean barking, int hourOfDay){


        if (( hourOfDay >= 0 && hourOfDay < 24) && barking){

            if ( hourOfDay < 8 || hourOfDay > 22 ){

                return  true;

            } else{

                return  false;
            }


        } else{
            System.out.print("out of range");
            return false;
        }






    }
}
