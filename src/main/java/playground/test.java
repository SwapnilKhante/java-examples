package playground;

import org.apache.commons.codec.binary.Base64;

import java.io.ByteArrayInputStream;
import java.util.Map;

/**
 * Created by SK on 1/10/2022
 **/
public class test {

    public static void main(String[] args) {

        test();
    }

    static void test (){
        String contentType = "multipart/form-data; boundary=--------------------------469819905785645892394932";
        //--------------------------469819905785645892394932
        //--------------------------469819905785645892394932
//        String contentType = "multipart/form-data; boundary=\"----=_Part_4_28584871.1472530981917\"";
        //----=_Part_4_28584871.1472530981917
        System.out.println(contentType);
        String replace = contentType.replace("\"", "");

        System.out.println(replace);
        String[] boundaryArray = replace.split("boundary=");

//        String temp = boundaryArray[1].replace("\"", "");
        System.out.println(boundaryArray[1]);

        System.out.println("boundaryArray - " + boundaryArray.toString());
        byte[] boundary = boundaryArray[1].getBytes();
        System.out.println(boundary.toString());
    }
}
