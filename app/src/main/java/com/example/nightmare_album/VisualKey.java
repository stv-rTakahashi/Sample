package com.example.nightmare_album;

public class VisualKey {
    protected String bandName;

    protected String Vocal;
    protected String GuitarRight;
    protected String GuitarLeft;
    protected String Base;
    protected String Drums;

    protected int number;

    protected String info;

    //デフォルトコンストラクタ
    public VisualKey(){

    }

    //コンストラクタ
    public VisualKey(String bandName,
                     String Vocal,
                     String GuitarRight,
                     String GuitarLeft,
                     String Base,
                     String Drums,
                     int number){
        this.bandName = bandName;
        this.Vocal = Vocal;
        this.GuitarRight = GuitarRight;
        this.GuitarLeft = GuitarLeft;
        this.Base = Base;
        this.Drums = Drums;
        this.number = number;

        this.info = "ヴィジュアル系";
    }

    //バンド名を取得します
    String getBandName(){
        return this.bandName;
    }

    //ボーカル情報を取得します
    String getVocal(){
        return this.Vocal;
    }

    //ギター情報を取得します
    String getGuitarRight(){
        return this.GuitarRight;
    }

    //ギター情報を取得します
    String getGuitarLeft(){
        return this.GuitarLeft;
    }

    //ベース情報を取得します
    String getBase(){
        return this.Base;
    }

    //ドラム情報を取得します
    String getDrums(){
        return this.Drums;
    }

    //バンド情報を取得します
    String getInfo(){
        return  this.info;
    }

    int push = 0;

    public void push(){
        this.push ++;
    }

    int getPush(){
        return this.push;
    }
}
