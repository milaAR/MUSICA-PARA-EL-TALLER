package com.example.act4musicplayermila;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //USO UN ARRAY PARA LAS CANCIONES, UN LISTVIEW PARA MOSTRARLAS Y UN CUSTOM ADAPTER PARA GESTIONARLAS
    private ArrayList<Music> arrayListMAR;
    private CustomMusicAdapter adapterMAR;
    private ListView songListMAR;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ARRAYLIST CON LAS CANCIONES EN LA CARPETA RAW
        //PARA AGREGAR MAS CANCIONES, SE METEN EN RAW Y SE AGREGA AQUI  LA REFERENCIA

        songListMAR = (ListView) findViewById(R.id.songList);
        arrayListMAR = new ArrayList<>();


        arrayListMAR.add(new Music("afterschooljamboreethegreenorbs","youtube",R.raw.afterschooljamboreethegreenorbs));
        arrayListMAR.add(new Music("atthefairthegreenorbs","youtube",R.raw.atthefairthegreenorbs));
        arrayListMAR.add(new Music("ballerinaquincasmoreira","youtube",R.raw.ballerinaquincasmoreira));
        arrayListMAR.add(new Music("ballgamekevinmacleod","youtube",R.raw.ballgamekevinmacleod));
        arrayListMAR.add(new Music("bikeridesthegreenorbs","youtube",R.raw.bikeridesthegreenorbs));
        arrayListMAR.add(new Music("birthdaycakereedmathis","youtube",R.raw.birthdaycakereedmathis));
        arrayListMAR.add(new Music("bubblebaththegreenorbs","youtube",R.raw.bubblebaththegreenorbs));
        arrayListMAR.add(new Music("bunnyhopquincasmoreira","youtube",R.raw.bunnyhopquincasmoreira));
        arrayListMAR.add(new Music("calimbaesjammyjams","youtube",R.raw.calimbaesjammyjams));
        arrayListMAR.add(new Music("claudiothewormthegreenorbs","youtube",R.raw.claudiothewormthegreenorbs));
        arrayListMAR.add(new Music("cuckooclockquincasmoreira","youtube",R.raw.cuckooclockquincasmoreira));
        arrayListMAR.add(new Music("cuteavalancherkvc","youtube",R.raw.cuteavalancherkvc));
        arrayListMAR.add(new Music("dancingongreengrassthegreenorbs","youtube",R.raw.dancingongreengrassthegreenorbs));
        arrayListMAR.add(new Music("fantasylandquincasmoreira","youtube",R.raw.fantasylandquincasmoreira));
        arrayListMAR.add(new Music("goodmorning!reedmathis","youtube",R.raw.goodmorningreedmathis));
        arrayListMAR.add(new Music("happymistakerkvc","youtube",R.raw.happymistakerkvc));
        arrayListMAR.add(new Music("hickorydickorydockthegreenorbs","youtube",R.raw.hickorydickorydockthegreenorbs));
        arrayListMAR.add(new Music("ilovemymomreedmathis","youtube",R.raw.ilovemymomreedmathis));
        arrayListMAR.add(new Music("itsybitsyspiderinstrumentalthegreenorbs","youtube",R.raw.itsybitsyspiderinstrumentalthegreenorbs));
        arrayListMAR.add(new Music("itsybitsyspidervocalthegreenorbs","youtube",R.raw.itsybitsyspidervocalthegreenorbs));
        arrayListMAR.add(new Music("i'vegotababysisterreedmathis","youtube",R.raw.ivegotababysisterreedmathis));
        arrayListMAR.add(new Music("jigsawpuzzlethegreenorbs","youtube",R.raw.jigsawpuzzlethegreenorbs));
        arrayListMAR.add(new Music("kazoomquincasmoreira","youtube",R.raw.kazoomquincasmoreira));
        arrayListMAR.add(new Music("londonbridgeinstrumentalthegreenorbs","youtube",R.raw.londonbridgeinstrumentalthegreenorbs));
        arrayListMAR.add(new Music("londonbridgevocalthegreenorbs","youtube",R.raw.londonbridgevocalthegreenorbs));
        arrayListMAR.add(new Music("lovableclownsitcomsircubworth","youtube",R.raw.lovableclownsitcomsircubworth));
        arrayListMAR.add(new Music("MARyhadalittlelambinstrumentalthegreenorbs","youtube",R.raw.maryhadalittlelambinstrumentalthegreenorbs));
        arrayListMAR.add(new Music("MARyhadalittlelambvocalthegreenorbs","youtube",R.raw.maryhadalittlelambvocalthegreenorbs));
        arrayListMAR.add(new Music("mydogishappyreedmathis","youtube",R.raw.mydogishappyreedmathis));
        arrayListMAR.add(new Music("oldmacdonaldinstrumentalthegreenorbs","youtube",R.raw.oldmacdonaldinstrumentalthegreenorbs));
        arrayListMAR.add(new Music("oldmacdonaldthegreenorbs","youtube",R.raw.oldmacdonaldthegreenorbs));
        arrayListMAR.add(new Music("poniesandballoonsthegreenorbs","youtube",R.raw.poniesandballoonsthegreenorbs));
        arrayListMAR.add(new Music("racingtheclockthegreenorbs","youtube",R.raw.racingtheclockthegreenorbs));
        arrayListMAR.add(new Music("rainbowforestquincasmoreira","youtube",R.raw.rainbowforestquincasmoreira));
        arrayListMAR.add(new Music("rainydaygamesthegreenorbs","youtube",R.raw.rainydaygamesthegreenorbs));
        arrayListMAR.add(new Music("robotboogiequincasmoreira","youtube",R.raw.robotboogiequincasmoreira));
        arrayListMAR.add(new Music("rodeoshowthegreenorbs","youtube",R.raw.rodeoshowthegreenorbs));
        arrayListMAR.add(new Music("sandcastlequincasmoreira","youtube",R.raw.sandcastlequincasmoreira));
        arrayListMAR.add(new Music("splashingaroundthegreenorbs","youtube",R.raw.splashingaroundthegreenorbs));
        arrayListMAR.add(new Music("sunnydayreedmathis","youtube",R.raw.sunnydayreedmathis));
        arrayListMAR.add(new Music("thealphabetsongthegreenorbs","youtube",R.raw.thealphabetsongthegreenorbs));
        arrayListMAR.add(new Music("thefarmerinthedellinstrumentalthegreenorbs","youtube",R.raw.thefarmerinthedellinstrumentalthegreenorbs));
        arrayListMAR.add(new Music("thefarmerinthedellthegreenorbs","youtube",R.raw.thefarmerinthedellthegreenorbs));
        arrayListMAR.add(new Music("themuffinmaninstrumentalthegreenorbs","youtube",R.raw.themuffinmaninstrumentalthegreenorbs));
        arrayListMAR.add(new Music("themuffinmanthegreenorbs","youtube",R.raw.themuffinmanthegreenorbs));
        arrayListMAR.add(new Music("thewheelsonthebusthegreenorbs","youtube",R.raw.thewheelsonthebusthegreenorbs));
        arrayListMAR.add(new Music("thisoldmaninstrumentalthegreenorbs","youtube",R.raw.thisoldmaninstrumentalthegreenorbs));
        arrayListMAR.add(new Music("thisoldmanvocalthegreenorbs","youtube",R.raw.thisoldmanvocalthegreenorbs));
        arrayListMAR.add(new Music("toypianowaynejones","youtube",R.raw.toypianowaynejones));
        arrayListMAR.add(new Music("twirlytopsthegreenorbs","youtube",R.raw.twirlytopsthegreenorbs));




























        adapterMAR = new CustomMusicAdapter(this, R.layout.custom_music_item, arrayListMAR);
        songListMAR.setAdapter(adapterMAR);
    }
}