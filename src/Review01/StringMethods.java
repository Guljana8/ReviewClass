package Review01;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class StringMethods {
    public static void main(String[] args) {
        String str = "hello";

        //toUpperCase or lowerCase

        str.toUpperCase();
        System.out.println(str);//lower hello

        System.out.println("------------------");

        str=str.toUpperCase();
        System.out.println(str); // upper HELLO

        //length() -> it give the size of the String(number of characters) -> Returns the length of the String
        int size=str.length();
        System.out.println(size);

        //charAt() -> Returns the char value at the specified index

        char letter=str.charAt(0);
        System.out.println(letter);
        //how to get last character from a char
       char lastCharacter=str.charAt(str.length()-1);
        System.out.println(lastCharacter);

        //
    }
}
