package HML_projects.animals;

public class Printer {

    public static String printer_error( String input_string) {

        int error_count = 0;
        boolean error_found;

        int length_of_string = input_string.length();
        char[] charsOfString = input_string.toCharArray();
        char[] validChars = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm'};


        for (int i = 0; i < charsOfString.length ; i++) {
            error_found = true;
            for (int j = 0; j < validChars.length; j++) {
                if (charsOfString[i] == validChars[j]) {
                    error_found = false;
                    break;
                }
            }

            if (error_found) {
                error_count++;
            }


        }

        String errorAsString = String.valueOf(error_count);
        String lengthAsString = String.valueOf(length_of_string);
        String errorRate = errorAsString +"/" + lengthAsString;


        return errorRate;
    }

    public static String printer_error2( String input_string) {

        int error_count = 0;

        char[] charsOfString = input_string.toCharArray();
        //char[] validChars = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm'};

       for ( char x : charsOfString ) {
           if ( x > 'm' ){
               error_count++;
           }
       }

        return error_count + "/" + input_string.length();
    }
    public static String printer_error3(String input_string){


       return input_string.replaceAll("[a-m]", "").length() + "/" + input_string.length();
    }
}
