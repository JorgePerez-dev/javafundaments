package io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BynaryDataOperations {

    public static void main(String[] args) {
        writeBinaryData();
        readBinaryData();
    }

    private static void writeBinaryData() {
        try (DataOutputStream os =
                new DataOutputStream(new FileOutputStream("data.bat"))) {

            os.writeChar(25);
            os.writeInt(32);
            os.writeUTF("Pablo and Andres are playing ..");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readBinaryData() {
        try (DataInputStream is =
                new DataInputStream(new FileInputStream("data.bat"))) {

            char c = is.readChar();
            int n = is.readInt();
            String text = is.readUTF();

            System.out.println("Char: " + c);
            System.out.println("Int: " + n);
            System.out.println("Text: " + text);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
