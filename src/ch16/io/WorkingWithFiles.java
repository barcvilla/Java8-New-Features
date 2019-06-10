/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch16.io;

import ch16.io.Ini;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.SequenceInputStream;

/**
 *
 * @author PC
 */
public class WorkingWithFiles {
    
    private static void fisTest()throws FileNotFoundException, IOException
    {
        try (FileInputStream fis = new FileInputStream(Ini.getPropertyFile1())) {
            int i = 0;
            while((i = fis.read()) != -1)
            {
                System.out.print((char)i);
            }
            System.out.println("");
        }
    }
    
    private static void FileInputStreamWithBuffered()throws FileNotFoundException, IOException
    {
        try (FileInputStream fis = new FileInputStream(Ini.getPropertyFile1())) {
            BufferedInputStream bis = new BufferedInputStream(fis);
            int i = 0;
            while((i = bis.read()) != -1)
            {
                System.out.print((char)i);
            }
            bis.close();
        }
    }
    
    //SecuenceInputStream
    private static void sisTest()throws FileNotFoundException, IOException
    {
        try(FileInputStream fis1 = new FileInputStream(Ini.getPropertyFile1()))
        {
            FileInputStream fis2 = new FileInputStream(Ini.getPropertyFile2());
            SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
            int j;
            while((j = sis.read()) != -1)
            {
                System.out.print((char) j);
            }
            sis.close();
            fis2.close();
        }
    }
    
    //FileReader
    private static void fileReaderTest()throws FileNotFoundException, IOException
    {
        try(FileReader fr = new FileReader(Ini.getPropertyFile1()))
        {
            int i;
            while((i = fr.read()) != -1)
            {
                System.out.print((char) i);
            }
        }
    }
    
    private static void fileWriterTest()throws FileNotFoundException, IOException
    {
        try(FileWriter fw = new FileWriter(Ini.getPropertyFile3()))
        {
            fw.write("Hola mundo Java");
            System.out.println("Tarea completada");
        }
    }
    
    // working with FileOutputStream
    private static void  writeCharacter(int unicode)throws FileNotFoundException, IOException
    {
        try(FileOutputStream fos = new FileOutputStream(Ini.getPropertyFile2()))
        {
            fos.write(unicode);
            System.out.println("Tarea completada");
        }
    }
    
    private static void writeString(String value)throws FileNotFoundException, IOException
    {
        try(FileOutputStream fos = new FileOutputStream(Ini.getPropertyFile3()))
        {
            byte[] b = value.getBytes(); // convertimos string en un byte array
            fos.write(b);
            System.out.println("Tarea completada");
        }
    }
    
    private static void FileWriterWithBuffered()throws FileNotFoundException, IOException
    {
        try(FileWriter fr = new FileWriter(Ini.getPropertyFile3()); BufferedWriter buffer = new BufferedWriter(fr) )
        {
            buffer.write("prueba de escritura en un archivo usando buffered write");
            //buffer.close();
            System.out.println("Tarea completada");
        }
    }
    
    private static void ByteArrayOutputStreamTest()throws FileNotFoundException, IOException
    {
        try(FileOutputStream fos1 = new FileOutputStream(Ini.getPropertyFile2()); 
                FileOutputStream fos2 = new FileOutputStream(Ini.getPropertyFile3());
                ByteArrayOutputStream baos = new ByteArrayOutputStream())
        {
            String word = "Este es un ejemplo usando ByteArrayOutputStream";
            byte[] bytes = word.getBytes();
            baos.write(bytes);
            baos.writeTo(fos1);
            baos.writeTo(fos2);
            System.out.println("La tarea termino");
        }
                
    }
    
    //DataOutputStream - escribimos datos primitivos java en un archivo
    private static void DataOutputStreamTest()throws FileNotFoundException, IOException
    {
        try(FileOutputStream fos = new FileOutputStream(Ini.getPropertyFile3()); 
                DataOutputStream dos = new DataOutputStream(fos))
        {
            
            dos.writeInt(101);
            dos.writeBoolean(Boolean.TRUE);
            dos.writeChar('R');
            dos.writeDouble(1000.50);
            dos.writeLong(23456L);
            /**
            dos.writeUTF("101");
            dos.writeUTF(Boolean.TRUE.toString());
            dos.writeUTF("R");
            dos.writeUTF("1000.50");
            dos.writeUTF("23456L");
            * */
            dos.writeUTF("Pedro Alberto Gomez Padilla");
            System.out.println("Tarea completada");
        }
    }
    
    private static void DataInputStreamTest()throws FileNotFoundException, IOException
    {
        try(FileInputStream fis = new FileInputStream(Ini.getPropertyFile3());
                DataInputStream dis = new DataInputStream(fis))
        {
            System.out.println(dis.readInt() + 50);
            System.out.println(dis.readBoolean());
            System.out.println(dis.readChar());
            System.out.println(dis.readDouble());
            System.out.println(dis.readLong());
            System.out.println(dis.readUTF());
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        DataInputStreamTest();
        //DataOutputStreamTest();
        //ByteArrayOutputStreamTest();
        //FileWriterWithBuffered();
        //writeString("Hello world!");
        //writeCharacter(524);
        //fileWriterTest();
        //fileReaderTest();
        //sisTest();
        //bisTest();
        //fisTest();
    }
}
