public class MegaBytesConveter {

    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(2050);
    }
            public static void printMegaBytesAndKiloBytes( int kiloBytes){


                int mBytes = 0;
                int kBytes = 0;

                if ( kiloBytes > 0){

                    mBytes = kiloBytes / 1024;
                    kBytes = kiloBytes % 1024;

                    System.out.println( kiloBytes + " KB = " + mBytes + " MB and " + kBytes  + " KB"  );


                } else if(kiloBytes == 0){


                    System.out.println( kiloBytes + " KB = " + mBytes + " MB and " + kBytes  + " KB");


                } else {

                    System.out.print("Invalid value");
                }

            }



}
