public class VignereEncode {
    public static void main (String[] args throws Exception){

    }
//    public String vignereEncode(String plaintext, String key){
//
//        //TAKEAWALK
//        //DOGDOGDOG
//        //
//
//        StringBuilder output = new StringBuilder(); // new str output == ""
//        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789"; // new str w/ alphabet
//        int keyIndex, ptValue, keyValue;
//        char cipherText;
//
//        plaintext = plaintext.toUpperCase();
//        for (int i = 0; i < plaintext.length(); i++){ //iterating through old str
//            keyIndex = i % key.length();
//            keyValue = alphabet.indexOf(key.charAt(keyIndex));
//            ptValue = alphabet.indexOf(plaintext.charAt(i));
//            cipherText = alphabet.charAt((ptValue + keyValue) % alphabet.length();
////            output.append(alphabet.charAt((alphabet.indexOf(plaintext.charAt(i)) + alphabet.indexOf(key.charAt(i % key.length())))));
//            output.append(cipherText);
//        }
//        return output.toString();
//    }

        public String vignereEncode(String plaintext, String key){

            int keyIndex, ptValue, keyValue, ctValue;
            char cipherText;

            plaintext = plaintext.toUpperCase();

            StringBuilder output = new StringBuilder();
            for (int i = 0; i < plaintext.length(); i++){ //iterating through old str
                keyIndex = i % key.length();
                keyValue = (int)key.charAt(keyIndex) - 'A'; // cast into an integer
                ptValue = (int)(plaintext.charAt(i)) - 'A';

                //
                ctValue = (ptValue + keyValue) % ((int)'Z' - 'A' + 1); //cast into int
                cipherText = (char)(ctValue + 'A');

                output.append(cipherText);
            }
            return output.toString();
        }
}
