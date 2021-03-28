package com.company;
import java.util.Scanner;


public class Main {
    static int i,j;
    static void sortnilaiasc(
            int[] anim,float[] anilai, String[] anama)
    {
        for (i = 0;i < anilai.length;i++){
            for( j = 0;j < anilai.length;j++){
                if (anilai[i] < anilai[j])
                {
                    int tempnim =anim[i];
                    anim[i]=anim[j];
                    anim[j]=tempnim;
                    String tempnama =anama[i];
                    anama[i]=anama[j];
                    anama[j]=tempnama;
                    float tempnilai =anilai[i];
                    anilai[i]=anilai[j];
                    anilai[j]=tempnilai;
                }
            }
        }
    }
    static void sortnilaidesc(
            int[] anim,float[] anilai, String[] anama)
    {
        for (i = 0;i < anilai.length;i++){
            for( j = 0;j < anilai.length;j++){
                if (anilai[i] > anilai[j])
                {
                    int tempnim =anim[i];
                    anim[i]=anim[j];
                    anim[j]=tempnim;
                    String tempnama =anama[i];
                    anama[i]=anama[j];
                    anama[j]=tempnama;
                    float tempnilai =anilai[i];
                    anilai[i]=anilai[j];
                    anilai[j]=tempnilai;
                }
            }
        }
    }
    public static void main(String[] args) {
        float nilai[] = {45.80f,73.20f,25.80f,71.20f,97.6f,99.80f};
        int nim[] = {10,11,12,13,14,15};
        String nama[] = {"KEVIN PERMANA",
                         "LUHDE ISMAPRA",
                         "ELISABETH PIO",
                         "AKBAR FERNAND",
                         "ALVIN MAULANA",
                         "ANDREW AMBESA"};
        System.out.println("Pilih Urutan Data berdasarkan Nilai");
        System.out.println("Ketik 1 untuk Ascending atau 2 untuk Descending");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        switch (a){
            case 1:
                sortnilaiasc(nim,nilai,nama);
                break;
            case 2:
                sortnilaidesc(nim,nilai,nama);
                break;
        }
        System.out.println("-----Mengurutkan Data berhasil-----");
        for (int x = 0 ; x<nilai.length; x++){
            System.out.println((x+1)+"."+" 20055510"+nim[x]+"---"+nama[x]+" : "+nilai[x]);
        }
    }
}
