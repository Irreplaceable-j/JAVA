package com.grepp.library.g_io.filter;

import com.grepp.library.g_io.dto.Music;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class D_ObjectIO {

    public static void main(String[] args) {
        writeObject();
        readObject();
    }

    // NOTE GD2 : 객체직렬화
    // 직렬화 : 통신이 가능한 형태로 변경
    public static void writeObject(){

        Music music = new Music("시작의 아이", "마크튭");
        Music music2 = new Music("건물사이에 피어난 장미", "하이키");
        Music music3 = new Music("popcorn", "D.O");

        try(ObjectOutput oos = new ObjectOutputStream(new FileOutputStream("music.dat"))){
            oos.writeObject(music);
            oos.writeObject(music2);
            oos.writeObject(music3);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void readObject(){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("music.dat"))){
            while(true){
                Object res = ois.readObject();
                System.out.println(res);
            }
        } catch(EOFException e){
            System.out.println("파일의 모든 객체를 읽었습니다.");
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}
