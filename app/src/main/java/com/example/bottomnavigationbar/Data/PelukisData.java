package com.example.bottomnavigationbar.Data;

import com.example.bottomnavigationbar.R;

import java.util.ArrayList;

public class PelukisData {
    private static String[] namaPelukis = {
            "Seniman: Leonardo da Vinci",
            "Seniman: Vincent van Gogh",
            "Seniman: Claude Monet",
            "Seniman: Max Ernst",
            "Seniman: Édouard Manet",
            "Seniman: Salvador Dalí\n",
            "Seniman: Pablo Picasso\n",
            "Seniman: Leonardo da Vinci\n",
            "Seniman: Jacques-Louis David\n",
            "Seniman: Katsushika Hokusai"
    };

    private static String[] namaKarya = {
            "monalisa",
            "The Starry Night\n",
            "Poppy Field",
            "The weatherman",
            "The Old Musician",
            "The Persistence of Memory",
            "Guernica",
            "Perjamuan Terakhir",
            "Napoleon Crossing the Alps",
            "The Great Wave off Kanagawa"
    };

    private static String[] deskripsiKarya = {
            "Mona Lisa, Monalisa adalah lukisan minyak di atas kayu poplar yang dibuat oleh Leonardo da Vinci pada abad ke-16. Lukisan ini sering dianggap sebagai salah satu lukisan paling terkenal di dunia dan hanya sedikit karya seni lain yang menjadi pusat perhatian, studi, mitologi, dan parodi\n",
            "Malam Berbintang adalah sebuah lukisan minyak di kanvas karya pelukis pasca-Impresionis Belanda Vincent van Gogh.\n",
            "Dalam lanskap, sepasang ibu dan anak di latar depan dan satu lagi di latar belakang hanyalah dalih untuk menggambar garis diagonal yang menyusun lukisan itu. Dua zona warna terpisah terbentuk, satu didominasi oleh merah, yang lain oleh hijau kebiruan. Wanita muda dengan kerai dan anak di latar depan mungkin adalah istri seniman, Camille, dan putra mereka Jean.\n",
            "Belum ada deksripsi yang di tulis dari karya ini.\n",
            "Dalam lukisan ini, Manet mewakili seorang musisi berjalan yang diapit oleh seorang gadis gipsi dan bayi, seorang pemain akrobat, seorang anak nakal, seorang pemabuk, dan seorang pemulung—individu-individu yang mungkin telah diamati oleh sang seniman di dekat studionya.\n",
            "The Persistence of Memory adalah lukisan tahun 1931 karya seniman Salvador Dalí dan salah satu karya Surealisme yang paling dikenal.\n",
            "Guernica adalah lukisan minyak besar di atas kanvas karya seniman Spanyol Pablo Picasso yang selesai dibuat pada Juni 1937. Lukisan ini sekarang berada di Museo Reina Sofía di Madrid. Lukisan dengan warna abu-abu, hitam, dan putih ini dibuat di rumah Picasso di Paris.\n",
            "Perjamuan Terakhir adalah sebuah lukisan mural abad ke-15 akhir oleh Leonardo da Vinci yang disimpan di ruang makan Konven Santa Maria delle Grazie in Milan. Lukisan ini merupakan salah satu lukisan paling terkenal di dunia.\n",
            "Napoleon Crossing the Alps adalah rangkaian lima lukisan minyak di atas kanvas potret penunggang kuda Napoleon Bonaparte yang dilukis oleh seniman Prancis Jacques-Louis David antara 1801 dan 1805.\n",
            "Ombak Besar di Kanagawa, juga dikenal dengan nama Ombak Besar atau singkatnya Sang Ombak, adalah sebuah cetakan blok kayu karya seniman ukiyo-e Jepang Hokusai. \n"
    };

    private static int[] gambarKarya = {
            R.drawable.monalisa,
            R.drawable.thestarrynight,
            R.drawable.poppyfield,
            R.drawable.theweatherman,
            R.drawable.theoldmusician,
            R.drawable.thepersistenceofmemory,
            R.drawable.guernica,
            R.drawable.perjamuanterkahir,
            R.drawable.napoleoncrossingthealps,
            R.drawable.thegreatwaveoffkanagawa
    };

    public static ArrayList<Pelukis> getListData() {
        ArrayList<Pelukis> list = new ArrayList<>();
        for (int position = 0; position < namaKarya.length; position++) {
            Pelukis pelukis = new Pelukis();
            pelukis.setNamakarya(namaKarya[position]);
            pelukis.setDeskripsikarya(deskripsiKarya[position]);
            pelukis.setNamapelukis(namaPelukis[position]);
            pelukis.setGambarkarya(gambarKarya[position]);
            list.add(pelukis);
        }
        return list;
    }
}

