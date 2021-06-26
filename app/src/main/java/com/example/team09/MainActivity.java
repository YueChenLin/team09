package com.example.team09;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Spinner city;
    Spinner nightmarkets;
    TextView txv;
    Button B01;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txv=findViewById(R.id.txv);
        nightmarkets =findViewById(R.id.nightmarkets);
        city=findViewById(R.id.city);
        B01=this.findViewById(R.id.B01);
        city.setOnItemSelectedListener(new Spinner.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String[] tempSet = new String[0];
                if (position==0)
                    tempSet=getResources().getStringArray(R.array.error);
                else if (position==1)
                    tempSet=getResources().getStringArray(R.array.nightmarket);
                else if (position==2)
                    tempSet=getResources().getStringArray(R.array.nightmarket1);
                else if (position==3)
                    tempSet=getResources().getStringArray(R.array.nightmarket2);
                else if (position==4)
                    tempSet=getResources().getStringArray(R.array.nightmarket3);
                else if (position==5)
                    tempSet=getResources().getStringArray(R.array.nightmarket4);
                else if (position==6)
                    tempSet=getResources().getStringArray(R.array.nightmarket5);
                else if (position==7)
                    tempSet=getResources().getStringArray(R.array.nightmarket6);
                else if (position==8)
                    tempSet=getResources().getStringArray(R.array.nightmarket7);
                else if (position==9)
                    tempSet=getResources().getStringArray(R.array.nightmarket8);
                else if (position==10)
                    tempSet=getResources().getStringArray(R.array.nightmarket9);
                else if (position==11)
                    tempSet=getResources().getStringArray(R.array.nightmarket10);
                else if (position==12)
                    tempSet=getResources().getStringArray(R.array.nightmarket11);
                else if (position==13)
                    tempSet=getResources().getStringArray(R.array.nightmarket12);
                else if (position==14)
                    tempSet=getResources().getStringArray(R.array.nightmarket13);
                else if (position==15)
                    tempSet=getResources().getStringArray(R.array.nightmarket14);
                else if (position==16)
                    tempSet=getResources().getStringArray(R.array.nightmarket15);
                else if (position==17)
                    tempSet=getResources().getStringArray(R.array.nightmarket16);
                else if (position==18)
                    tempSet=getResources().getStringArray(R.array.nightmarket17);
                else if (position==19)
                    tempSet=getResources().getStringArray(R.array.nightmarket18);
                else if (position==20)
                    tempSet=getResources().getStringArray(R.array.nightmarket19);
                else if (position==21)
                    tempSet=getResources().getStringArray(R.array.nightmarket20);
                else if (position==22)
                    tempSet=getResources().getStringArray(R.array.nightmarket21);
                ArrayAdapter<String>tempAd=new ArrayAdapter<>(
                        MainActivity.this,
                        R.layout.support_simple_spinner_dropdown_item,tempSet);
                tempAd.setDropDownViewResource(
                        R.layout.support_simple_spinner_dropdown_item);
                nightmarkets.setAdapter(tempAd);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        B01.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                int idcity=city.getSelectedItemPosition();
                int idnightmarket=nightmarkets.getSelectedItemPosition();
                if(idcity==1&idnightmarket==1)
                    txv.setText(getResources().getString(R.string.KLUfood));
                else if(idcity==1&idnightmarket==2)
                    txv.setText(getResources().getString(R.string.KLUfood1));
                else if(idcity==1&idnightmarket==3)
                    txv.setText(getResources().getString(R.string.KLUfood2));
                else if(idcity==1&idnightmarket==4)
                    txv.setText(getResources().getString(R.string.KLUfood3));
                else if(idcity==2&idnightmarket==1)
                    txv.setText(getResources().getString(R.string.NTPfood));
                else if(idcity==2&idnightmarket==2)
                    txv.setText(getResources().getString(R.string.NTPfood1));
                else if(idcity==2&idnightmarket==3)
                    txv.setText(getResources().getString(R.string.NTPfood2));
                else if(idcity==2&idnightmarket==4)
                    txv.setText(getResources().getString(R.string.NTPfood3));
                else if(idcity==2&idnightmarket==5)
                    txv.setText(getResources().getString(R.string.NTPfood4));
                else if(idcity==2&idnightmarket==6)
                    txv.setText(getResources().getString(R.string.NTPfood5));
                else if(idcity==2&idnightmarket==7)
                    txv.setText(getResources().getString(R.string.NTPfood6));
                else if(idcity==2&idnightmarket==8)
                    txv.setText(getResources().getString(R.string.NTPfood7));
                else if(idcity==2&idnightmarket==9)
                    txv.setText(getResources().getString(R.string.NTPfood8));
                else if(idcity==2&idnightmarket==10)
                    txv.setText(getResources().getString(R.string.NTPfood9));
                else if(idcity==2&idnightmarket==11)
                    txv.setText(getResources().getString(R.string.NTPfood10));
                else if(idcity==2&idnightmarket==12)
                    txv.setText(getResources().getString(R.string.NTPfood11));
                else if(idcity==2&idnightmarket==13)
                    txv.setText(getResources().getString(R.string.NTPfood12));
                else if(idcity==2&idnightmarket==14)
                    txv.setText(getResources().getString(R.string.NTPfood13));
                else if(idcity==2&idnightmarket==15)
                    txv.setText(getResources().getString(R.string.NTPfood14));
                else if(idcity==2&idnightmarket==16)
                    txv.setText(getResources().getString(R.string.NTPfood15));
                else if(idcity==2&idnightmarket==17)
                    txv.setText(getResources().getString(R.string.NTPfood16));
                else if(idcity==2&idnightmarket==18)
                    txv.setText(getResources().getString(R.string.NTPfood17));
                else if(idcity==2&idnightmarket==19)
                    txv.setText(getResources().getString(R.string.NTPfood18));
                else if(idcity==2&idnightmarket==20)
                    txv.setText(getResources().getString(R.string.NTPfood19));
                else if(idcity==2&idnightmarket==21)
                    txv.setText(getResources().getString(R.string.NTPfood20));
                else if(idcity==2&idnightmarket==22)
                    txv.setText(getResources().getString(R.string.NTPfood21));
                else if(idcity==2&idnightmarket==23)
                    txv.setText(getResources().getString(R.string.NTPfood22));
                else if(idcity==2&idnightmarket==24)
                    txv.setText(getResources().getString(R.string.NTPfood23));
                else if(idcity==2&idnightmarket==25)
                    txv.setText(getResources().getString(R.string.NTPfood24));
                else if(idcity==2&idnightmarket==26)
                    txv.setText(getResources().getString(R.string.NTPfood25));
                else if(idcity==2&idnightmarket==27)
                    txv.setText(getResources().getString(R.string.NTPfood26));
                else if(idcity==3&idnightmarket==1)
                    txv.setText(getResources().getString(R.string.TPEfood));
                else if(idcity==3&idnightmarket==2)
                    txv.setText(getResources().getString(R.string.TPEfood1));
                else if(idcity==3&idnightmarket==3)
                    txv.setText(getResources().getString(R.string.TPEfood2));
                else if(idcity==3&idnightmarket==4)
                    txv.setText(getResources().getString(R.string.TPEfood3));
                else if(idcity==3&idnightmarket==5)
                    txv.setText(getResources().getString(R.string.TPEfood4));
                else if(idcity==3&idnightmarket==6)
                    txv.setText(getResources().getString(R.string.TPEfood5));
                else if(idcity==3&idnightmarket==7)
                    txv.setText(getResources().getString(R.string.TPEfood6));
                else if(idcity==3&idnightmarket==8)
                    txv.setText(getResources().getString(R.string.TPEfood7));
                else if(idcity==3&idnightmarket==9)
                    txv.setText(getResources().getString(R.string.TPEfood8));
                else if(idcity==3&idnightmarket==10)
                    txv.setText(getResources().getString(R.string.TPEfood9));
                else if(idcity==3&idnightmarket==11)
                    txv.setText(getResources().getString(R.string.TPEfood10));
                else if(idcity==3&idnightmarket==12)
                    txv.setText(getResources().getString(R.string.TPEfood11));
                else if(idcity==3&idnightmarket==13)
                    txv.setText(getResources().getString(R.string.TPEfood12));
                else if(idcity==3&idnightmarket==14)
                    txv.setText(getResources().getString(R.string.TPEfood13));
                else if(idcity==3&idnightmarket==15)
                    txv.setText(getResources().getString(R.string.TPEfood14));
                else if(idcity==3&idnightmarket==16)
                    txv.setText(getResources().getString(R.string.TPEfood15));
                else if(idcity==3&idnightmarket==17)
                    txv.setText(getResources().getString(R.string.TPEfood16));
                else if(idcity==3&idnightmarket==18)
                    txv.setText(getResources().getString(R.string.TPEfood17));
                else if(idcity==4&idnightmarket==1)
                    txv.setText(getResources().getString(R.string.TYCfood));
                else if(idcity==4&idnightmarket==2)
                    txv.setText(getResources().getString(R.string.TYCfood1));
                else if(idcity==4&idnightmarket==3)
                    txv.setText(getResources().getString(R.string.TYCfood2));
                else if(idcity==4&idnightmarket==4)
                    txv.setText(getResources().getString(R.string.TYCfood3));
                else if(idcity==4&idnightmarket==5)
                    txv.setText(getResources().getString(R.string.TYCfood4));
                else if(idcity==4&idnightmarket==6)
                    txv.setText(getResources().getString(R.string.TYCfood5));
                else if(idcity==4&idnightmarket==7)
                    txv.setText(getResources().getString(R.string.TYCfood6));
                else if(idcity==4&idnightmarket==8)
                    txv.setText(getResources().getString(R.string.TYCfood7));
                else if(idcity==4&idnightmarket==9)
                    txv.setText(getResources().getString(R.string.TYCfood8));
                else if(idcity==4&idnightmarket==10)
                    txv.setText(getResources().getString(R.string.TYCfood9));
                else if(idcity==4&idnightmarket==11)
                    txv.setText(getResources().getString(R.string.TYCfood10));
                else if(idcity==4&idnightmarket==12)
                    txv.setText(getResources().getString(R.string.TYCfood11));
                else if(idcity==4&idnightmarket==13)
                    txv.setText(getResources().getString(R.string.TYCfood12));
                else if(idcity==4&idnightmarket==14)
                    txv.setText(getResources().getString(R.string.TYCfood13));
                else if(idcity==4&idnightmarket==15)
                    txv.setText(getResources().getString(R.string.TYCfood14));
                else if(idcity==4&idnightmarket==16)
                    txv.setText(getResources().getString(R.string.TYCfood15));
                else if(idcity==4&idnightmarket==17)
                    txv.setText(getResources().getString(R.string.TYCfood16));
                else if(idcity==4&idnightmarket==18)
                    txv.setText(getResources().getString(R.string.TYCfood17));
                else if(idcity==4&idnightmarket==19)
                    txv.setText(getResources().getString(R.string.TYCfood18));
                else if(idcity==4&idnightmarket==20)
                    txv.setText(getResources().getString(R.string.TYCfood19));
                else if(idcity==4&idnightmarket==21)
                    txv.setText(getResources().getString(R.string.TYCfood20));
                else if(idcity==4&idnightmarket==22)
                    txv.setText(getResources().getString(R.string.TYCfood21));
                else if(idcity==5&idnightmarket==1)
                    txv.setText(getResources().getString(R.string.HSCfood));
                else if(idcity==5&idnightmarket==2)
                    txv.setText(getResources().getString(R.string.HSCfood1));
                else if(idcity==5&idnightmarket==3)
                    txv.setText(getResources().getString(R.string.HSCfood2));
                else if(idcity==5&idnightmarket==4)
                    txv.setText(getResources().getString(R.string.HSCfood3));
                else if(idcity==5&idnightmarket==5)
                    txv.setText(getResources().getString(R.string.HSCfood4));
                else if(idcity==5&idnightmarket==6)
                    txv.setText(getResources().getString(R.string.HSCfood5));
                else if(idcity==5&idnightmarket==7)
                    txv.setText(getResources().getString(R.string.HSCfood6));
                else if(idcity==5&idnightmarket==8)
                    txv.setText(getResources().getString(R.string.HSCfood7));
                else if(idcity==6&idnightmarket==1)
                    txv.setText(getResources().getString(R.string.HSHfood));
                else if(idcity==6&idnightmarket==2)
                    txv.setText(getResources().getString(R.string.HSHfood1));
                else if(idcity==6&idnightmarket==3)
                    txv.setText(getResources().getString(R.string.HSHfood2));
                else if(idcity==6&idnightmarket==4)
                    txv.setText(getResources().getString(R.string.HSHfood3));
                else if(idcity==6&idnightmarket==5)
                    txv.setText(getResources().getString(R.string.HSHfood4));
                else if(idcity==6&idnightmarket==6)
                    txv.setText(getResources().getString(R.string.HSHfood5));
                else if(idcity==6&idnightmarket==7)
                    txv.setText(getResources().getString(R.string.HSHfood6));
                else if(idcity==6&idnightmarket==8)
                    txv.setText(getResources().getString(R.string.HSHfood7));
                else if(idcity==6&idnightmarket==9)
                    txv.setText(getResources().getString(R.string.HSHfood8));
                else if(idcity==6&idnightmarket==10)
                    txv.setText(getResources().getString(R.string.HSHfood9));
                else if(idcity==6&idnightmarket==11)
                    txv.setText(getResources().getString(R.string.HSHfood10));
                else if(idcity==6&idnightmarket==12)
                    txv.setText(getResources().getString(R.string.HSHfood11));
                else if(idcity==7&idnightmarket==1)
                    txv.setText(getResources().getString(R.string.MALfood));
                else if(idcity==7&idnightmarket==2)
                    txv.setText(getResources().getString(R.string.MALfood1));
                else if(idcity==7&idnightmarket==3)
                    txv.setText(getResources().getString(R.string.MALfood2));
                else if(idcity==7&idnightmarket==4)
                    txv.setText(getResources().getString(R.string.MALfood3));
                else if(idcity==7&idnightmarket==5)
                    txv.setText(getResources().getString(R.string.MALfood4));
                else if(idcity==7&idnightmarket==6)
                    txv.setText(getResources().getString(R.string.MALfood5));
                else if(idcity==7&idnightmarket==7)
                    txv.setText(getResources().getString(R.string.MALfood6));
                else if(idcity==7&idnightmarket==8)
                    txv.setText(getResources().getString(R.string.MALfood7));
                else if(idcity==7&idnightmarket==9)
                    txv.setText(getResources().getString(R.string.MALfood8));
                else if(idcity==7&idnightmarket==10)
                    txv.setText(getResources().getString(R.string.MALfood9));
                else if(idcity==7&idnightmarket==11)
                    txv.setText(getResources().getString(R.string.MALfood10));
                else if(idcity==7&idnightmarket==12)
                    txv.setText(getResources().getString(R.string.MALfood11));
                else if(idcity==7&idnightmarket==13)
                    txv.setText(getResources().getString(R.string.MALfood12));
                else if(idcity==8&idnightmarket==1)
                    txv.setText(getResources().getString(R.string.TXGfood));
                else if(idcity==8&idnightmarket==2)
                    txv.setText(getResources().getString(R.string.TXGfood1));
                else if(idcity==8&idnightmarket==3)
                    txv.setText(getResources().getString(R.string.TXGfood2));
                else if(idcity==8&idnightmarket==4)
                    txv.setText(getResources().getString(R.string.TXGfood3));
                else if(idcity==8&idnightmarket==5)
                    txv.setText(getResources().getString(R.string.TXGfood4));
                else if(idcity==8&idnightmarket==6)
                    txv.setText(getResources().getString(R.string.TXGfood5));
                else if(idcity==8&idnightmarket==7)
                    txv.setText(getResources().getString(R.string.TXGfood6));
                else if(idcity==8&idnightmarket==8)
                    txv.setText(getResources().getString(R.string.TXGfood7));
                else if(idcity==8&idnightmarket==9)
                    txv.setText(getResources().getString(R.string.TXGfood8));
                else if(idcity==8&idnightmarket==10)
                    txv.setText(getResources().getString(R.string.TXGfood9));
                else if(idcity==8&idnightmarket==11)
                    txv.setText(getResources().getString(R.string.TXGfood10));
                else if(idcity==8&idnightmarket==12)
                    txv.setText(getResources().getString(R.string.TXGfood11));
                else if(idcity==8&idnightmarket==13)
                    txv.setText(getResources().getString(R.string.TXGfood12));
                else if(idcity==8&idnightmarket==14)
                    txv.setText(getResources().getString(R.string.TXGfood13));
                else if(idcity==8&idnightmarket==15)
                    txv.setText(getResources().getString(R.string.TXGfood14));
                else if(idcity==8&idnightmarket==16)
                    txv.setText(getResources().getString(R.string.TXGfood15));
                else if(idcity==8&idnightmarket==17)
                    txv.setText(getResources().getString(R.string.TXGfood16));
                else if(idcity==8&idnightmarket==18)
                    txv.setText(getResources().getString(R.string.TXGfood17));
                else if(idcity==8&idnightmarket==19)
                    txv.setText(getResources().getString(R.string.TXGfood18));
                else if(idcity==8&idnightmarket==20)
                    txv.setText(getResources().getString(R.string.TXGfood19));
                else if(idcity==8&idnightmarket==21)
                    txv.setText(getResources().getString(R.string.TXGfood20));
                else if(idcity==8&idnightmarket==22)
                    txv.setText(getResources().getString(R.string.TXGfood21));
                else if(idcity==8&idnightmarket==23)
                    txv.setText(getResources().getString(R.string.TXGfood22));
                else if(idcity==8&idnightmarket==24)
                    txv.setText(getResources().getString(R.string.TXGfood23));
                else if(idcity==8&idnightmarket==25)
                    txv.setText(getResources().getString(R.string.TXGfood24));
                else if(idcity==8&idnightmarket==26)
                    txv.setText(getResources().getString(R.string.TXGfood25));
                else if(idcity==8&idnightmarket==27)
                    txv.setText(getResources().getString(R.string.TXGfood26));
                else if(idcity==8&idnightmarket==28)
                    txv.setText(getResources().getString(R.string.TXGfood27));
                else if(idcity==8&idnightmarket==29)
                    txv.setText(getResources().getString(R.string.TXGfood28));
                else if(idcity==8&idnightmarket==30)
                    txv.setText(getResources().getString(R.string.TXGfood29));
                else if(idcity==8&idnightmarket==31)
                    txv.setText(getResources().getString(R.string.TXGfood30));
                else if(idcity==8&idnightmarket==32)
                    txv.setText(getResources().getString(R.string.TXGfood31));
                else if(idcity==8&idnightmarket==33)
                    txv.setText(getResources().getString(R.string.TXGfood32));
                else if(idcity==8&idnightmarket==34)
                    txv.setText(getResources().getString(R.string.TXGfood33));
                else if(idcity==8&idnightmarket==35)
                    txv.setText(getResources().getString(R.string.TXGfood34));
                else if(idcity==8&idnightmarket==36)
                    txv.setText(getResources().getString(R.string.TXGfood35));
                else if(idcity==8&idnightmarket==37)
                    txv.setText(getResources().getString(R.string.TXGfood36));
                else if(idcity==8&idnightmarket==38)
                    txv.setText(getResources().getString(R.string.TXGfood37));
                else if(idcity==8&idnightmarket==39)
                    txv.setText(getResources().getString(R.string.TXGfood38));
                else if(idcity==8&idnightmarket==40)
                    txv.setText(getResources().getString(R.string.TXGfood39));
                else if(idcity==8&idnightmarket==41)
                    txv.setText(getResources().getString(R.string.TXGfood40));
                else if(idcity==9&idnightmarket==1)
                    txv.setText(getResources().getString(R.string.CHWfood));
                else if(idcity==9&idnightmarket==2)
                    txv.setText(getResources().getString(R.string.CHWfood1));
                else if(idcity==9&idnightmarket==3)
                    txv.setText(getResources().getString(R.string.CHWfood2));
                else if(idcity==9&idnightmarket==4)
                    txv.setText(getResources().getString(R.string.CHWfood3));
                else if(idcity==9&idnightmarket==5)
                    txv.setText(getResources().getString(R.string.CHWfood4));
                else if(idcity==9&idnightmarket==6)
                    txv.setText(getResources().getString(R.string.CHWfood5));
                else if(idcity==9&idnightmarket==7)
                    txv.setText(getResources().getString(R.string.CHWfood6));
                else if(idcity==9&idnightmarket==8)
                    txv.setText(getResources().getString(R.string.CHWfood7));
                else if(idcity==9&idnightmarket==9)
                    txv.setText(getResources().getString(R.string.CHWfood8));
                else if(idcity==9&idnightmarket==10)
                    txv.setText(getResources().getString(R.string.CHWfood9));
                else if(idcity==9&idnightmarket==11)
                    txv.setText(getResources().getString(R.string.CHWfood10));
                else if(idcity==9&idnightmarket==12)
                    txv.setText(getResources().getString(R.string.CHWfood11));
                else if(idcity==9&idnightmarket==13)
                    txv.setText(getResources().getString(R.string.CHWfood12));
                else if(idcity==9&idnightmarket==14)
                    txv.setText(getResources().getString(R.string.CHWfood13));
                else if(idcity==9&idnightmarket==15)
                    txv.setText(getResources().getString(R.string.CHWfood14));
                else if(idcity==9&idnightmarket==16)
                    txv.setText(getResources().getString(R.string.CHWfood15));
                else if(idcity==9&idnightmarket==17)
                    txv.setText(getResources().getString(R.string.CHWfood16));
                else if(idcity==9&idnightmarket==18)
                    txv.setText(getResources().getString(R.string.CHWfood17));
                else if(idcity==9&idnightmarket==19)
                    txv.setText(getResources().getString(R.string.CHWfood18));
                else if(idcity==9&idnightmarket==20)
                    txv.setText(getResources().getString(R.string.CHWfood19));
                else if(idcity==9&idnightmarket==21)
                    txv.setText(getResources().getString(R.string.CHWfood20));
                else if(idcity==9&idnightmarket==22)
                    txv.setText(getResources().getString(R.string.CHWfood21));
                else if(idcity==9&idnightmarket==23)
                    txv.setText(getResources().getString(R.string.CHWfood22));
                else if(idcity==9&idnightmarket==24)
                    txv.setText(getResources().getString(R.string.CHWfood23));
                else if(idcity==9&idnightmarket==25)
                    txv.setText(getResources().getString(R.string.CHWfood24));
                else if(idcity==9&idnightmarket==26)
                    txv.setText(getResources().getString(R.string.CHWfood25));
                else if(idcity==9&idnightmarket==27)
                    txv.setText(getResources().getString(R.string.CHWfood26));
                else if(idcity==9&idnightmarket==28)
                    txv.setText(getResources().getString(R.string.CHWfood27));
                else if(idcity==9&idnightmarket==29)
                    txv.setText(getResources().getString(R.string.CHWfood28));
                else if(idcity==9&idnightmarket==30)
                    txv.setText(getResources().getString(R.string.CHWfood29));
                else if(idcity==9&idnightmarket==31)
                    txv.setText(getResources().getString(R.string.CHWfood30));
                else if(idcity==9&idnightmarket==32)
                    txv.setText(getResources().getString(R.string.CHWfood31));
                else if(idcity==9&idnightmarket==33)
                    txv.setText(getResources().getString(R.string.CHWfood32));
                else if(idcity==9&idnightmarket==34)
                    txv.setText(getResources().getString(R.string.CHWfood33));
                else if(idcity==9&idnightmarket==35)
                    txv.setText(getResources().getString(R.string.CHWfood34));
                else if(idcity==9&idnightmarket==36)
                    txv.setText(getResources().getString(R.string.CHWfood35));
                else if(idcity==9&idnightmarket==37)
                    txv.setText(getResources().getString(R.string.CHWfood36));
                else if(idcity==9&idnightmarket==38)
                    txv.setText(getResources().getString(R.string.CHWfood37));
                else if(idcity==9&idnightmarket==39)
                    txv.setText(getResources().getString(R.string.CHWfood38));
                else if(idcity==9&idnightmarket==40)
                    txv.setText(getResources().getString(R.string.CHWfood39));
                else if(idcity==9&idnightmarket==41)
                    txv.setText(getResources().getString(R.string.CHWfood40));
                else if(idcity==9&idnightmarket==42)
                    txv.setText(getResources().getString(R.string.CHWfood41));
                else if(idcity==9&idnightmarket==43)
                    txv.setText(getResources().getString(R.string.CHWfood42));
                else if(idcity==9&idnightmarket==44)
                    txv.setText(getResources().getString(R.string.CHWfood43));
                else if(idcity==9&idnightmarket==45)
                    txv.setText(getResources().getString(R.string.CHWfood44));
                else if(idcity==10&idnightmarket==1)
                    txv.setText(getResources().getString(R.string.NTCfood));
                else if(idcity==10&idnightmarket==2)
                    txv.setText(getResources().getString(R.string.NTCfood1));
                else if(idcity==10&idnightmarket==3)
                    txv.setText(getResources().getString(R.string.NTCfood2));
                else if(idcity==10&idnightmarket==4)
                    txv.setText(getResources().getString(R.string.NTCfood3));
                else if(idcity==10&idnightmarket==5)
                    txv.setText(getResources().getString(R.string.NTCfood4));
                else if(idcity==10&idnightmarket==6)
                    txv.setText(getResources().getString(R.string.NTCfood5));
                else if(idcity==10&idnightmarket==7)
                    txv.setText(getResources().getString(R.string.NTCfood6));
                else if(idcity==10&idnightmarket==8)
                    txv.setText(getResources().getString(R.string.NTCfood7));
                else if(idcity==10&idnightmarket==9)
                    txv.setText(getResources().getString(R.string.NTCfood8));
                else if(idcity==10&idnightmarket==10)
                    txv.setText(getResources().getString(R.string.NTCfood9));
                else if(idcity==10&idnightmarket==11)
                    txv.setText(getResources().getString(R.string.NTCfood10));
                else if(idcity==10&idnightmarket==12)
                    txv.setText(getResources().getString(R.string.NTCfood11));
                else if(idcity==10&idnightmarket==13)
                    txv.setText(getResources().getString(R.string.NTCfood12));
                else if(idcity==10&idnightmarket==14)
                    txv.setText(getResources().getString(R.string.NTCfood13));
                else if(idcity==10&idnightmarket==15)
                    txv.setText(getResources().getString(R.string.NTCfood14));
                else if(idcity==10&idnightmarket==16)
                    txv.setText(getResources().getString(R.string.NTCfood15));
                else if(idcity==10&idnightmarket==17)
                    txv.setText(getResources().getString(R.string.NTCfood16));
                else if(idcity==10&idnightmarket==18)
                    txv.setText(getResources().getString(R.string.NTCfood17));
                else if(idcity==10&idnightmarket==19)
                    txv.setText(getResources().getString(R.string.NTCfood18));
                else if(idcity==11&idnightmarket==1)
                    txv.setText(getResources().getString(R.string.YLHfood));
                else if(idcity==11&idnightmarket==2)
                    txv.setText(getResources().getString(R.string.YLHfood1));
                else if(idcity==11&idnightmarket==3)
                    txv.setText(getResources().getString(R.string.YLHfood2));
                else if(idcity==11&idnightmarket==4)
                    txv.setText(getResources().getString(R.string.YLHfood3));
                else if(idcity==11&idnightmarket==5)
                    txv.setText(getResources().getString(R.string.YLHfood4));
                else if(idcity==11&idnightmarket==6)
                    txv.setText(getResources().getString(R.string.YLHfood5));
                else if(idcity==11&idnightmarket==7)
                    txv.setText(getResources().getString(R.string.YLHfood6));
                else if(idcity==11&idnightmarket==8)
                    txv.setText(getResources().getString(R.string.YLHfood7));
                else if(idcity==11&idnightmarket==9)
                    txv.setText(getResources().getString(R.string.YLHfood8));
                else if(idcity==11&idnightmarket==10)
                    txv.setText(getResources().getString(R.string.YLHfood9));
                else if(idcity==11&idnightmarket==11)
                    txv.setText(getResources().getString(R.string.YLHfood10));
                else if(idcity==11&idnightmarket==12)
                    txv.setText(getResources().getString(R.string.YLHfood11));
                else if(idcity==11&idnightmarket==13)
                    txv.setText(getResources().getString(R.string.YLHfood12));
                else if(idcity==11&idnightmarket==14)
                    txv.setText(getResources().getString(R.string.YLHfood13));
                else if(idcity==11&idnightmarket==15)
                    txv.setText(getResources().getString(R.string.YLHfood14));
                else if(idcity==11&idnightmarket==16)
                    txv.setText(getResources().getString(R.string.YLHfood15));
                else if(idcity==11&idnightmarket==17)
                    txv.setText(getResources().getString(R.string.YLHfood16));
                else if(idcity==11&idnightmarket==18)
                    txv.setText(getResources().getString(R.string.YLHfood17));
                else if(idcity==11&idnightmarket==19)
                    txv.setText(getResources().getString(R.string.YLHfood18));
                else if(idcity==11&idnightmarket==20)
                    txv.setText(getResources().getString(R.string.YLHfood19));
                else if(idcity==11&idnightmarket==21)
                    txv.setText(getResources().getString(R.string.YLHfood20));
                else if(idcity==11&idnightmarket==22)
                    txv.setText(getResources().getString(R.string.YLHfood21));
                else if(idcity==11&idnightmarket==23)
                    txv.setText(getResources().getString(R.string.YLHfood22));
                else if(idcity==11&idnightmarket==24)
                    txv.setText(getResources().getString(R.string.YLHfood23));
                else if(idcity==11&idnightmarket==25)
                    txv.setText(getResources().getString(R.string.YLHfood24));
                else if(idcity==11&idnightmarket==26)
                    txv.setText(getResources().getString(R.string.YLHfood25));
                else if(idcity==11&idnightmarket==27)
                    txv.setText(getResources().getString(R.string.YLHfood26));
                else if(idcity==11&idnightmarket==28)
                    txv.setText(getResources().getString(R.string.YLHfood27));
                else if(idcity==12&idnightmarket==1)
                    txv.setText(getResources().getString(R.string.CYIfood));
                else if(idcity==12&idnightmarket==2)
                    txv.setText(getResources().getString(R.string.CYIfood1));
                else if(idcity==12&idnightmarket==3)
                    txv.setText(getResources().getString(R.string.CYIfood2));
                else if(idcity==13&idnightmarket==1)
                    txv.setText(getResources().getString(R.string.CHYfood));
                else if(idcity==13&idnightmarket==2)
                    txv.setText(getResources().getString(R.string.CHYfood1));
                else if(idcity==13&idnightmarket==3)
                    txv.setText(getResources().getString(R.string.CHYfood2));
                else if(idcity==13&idnightmarket==4)
                    txv.setText(getResources().getString(R.string.CHYfood3));
                else if(idcity==13&idnightmarket==5)
                    txv.setText(getResources().getString(R.string.CHYfood4));
                else if(idcity==13&idnightmarket==6)
                    txv.setText(getResources().getString(R.string.CHYfood5));
                else if(idcity==13&idnightmarket==7)
                    txv.setText(getResources().getString(R.string.CHYfood6));
                else if(idcity==13&idnightmarket==8)
                    txv.setText(getResources().getString(R.string.CHYfood7));
                else if(idcity==13&idnightmarket==9)
                    txv.setText(getResources().getString(R.string.CHYfood8));
                else if(idcity==13&idnightmarket==10)
                    txv.setText(getResources().getString(R.string.CHYfood9));
                else if(idcity==13&idnightmarket==11)
                    txv.setText(getResources().getString(R.string.CHYfood10));
                else if(idcity==13&idnightmarket==12)
                    txv.setText(getResources().getString(R.string.CHYfood11));
                else if(idcity==13&idnightmarket==13)
                    txv.setText(getResources().getString(R.string.CHYfood12));
                else if(idcity==13&idnightmarket==14)
                    txv.setText(getResources().getString(R.string.CHYfood13));
                else if(idcity==13&idnightmarket==15)
                    txv.setText(getResources().getString(R.string.CHYfood14));
                else if(idcity==13&idnightmarket==16)
                    txv.setText(getResources().getString(R.string.CHYfood15));
                else if(idcity==13&idnightmarket==17)
                    txv.setText(getResources().getString(R.string.CHYfood16));
                else if(idcity==13&idnightmarket==18)
                    txv.setText(getResources().getString(R.string.CHYfood17));
                else if(idcity==13&idnightmarket==19)
                    txv.setText(getResources().getString(R.string.CHYfood18));
                else if(idcity==13&idnightmarket==20)
                    txv.setText(getResources().getString(R.string.CHYfood19));
                else if(idcity==13&idnightmarket==21)
                    txv.setText(getResources().getString(R.string.CHYfood20));
                else if(idcity==13&idnightmarket==22)
                    txv.setText(getResources().getString(R.string.CHYfood21));
                else if(idcity==13&idnightmarket==23)
                    txv.setText(getResources().getString(R.string.CHYfood22));
                else if(idcity==13&idnightmarket==24)
                    txv.setText(getResources().getString(R.string.CHYfood23));
                else if(idcity==13&idnightmarket==25)
                    txv.setText(getResources().getString(R.string.CHYfood24));
                else if(idcity==13&idnightmarket==26)
                    txv.setText(getResources().getString(R.string.CHYfood25));
                else if(idcity==14&idnightmarket==1)
                    txv.setText(getResources().getString(R.string.TNNfood));
                else if(idcity==14&idnightmarket==2)
                    txv.setText(getResources().getString(R.string.TNNfood1));
                else if(idcity==14&idnightmarket==3)
                    txv.setText(getResources().getString(R.string.TNNfood2));
                else if(idcity==14&idnightmarket==4)
                    txv.setText(getResources().getString(R.string.TNNfood3));
                else if(idcity==14&idnightmarket==5)
                    txv.setText(getResources().getString(R.string.TNNfood4));
                else if(idcity==14&idnightmarket==6)
                    txv.setText(getResources().getString(R.string.TNNfood5));
                else if(idcity==14&idnightmarket==7)
                    txv.setText(getResources().getString(R.string.TNNfood6));
                else if(idcity==14&idnightmarket==8)
                    txv.setText(getResources().getString(R.string.TNNfood7));
                else if(idcity==14&idnightmarket==9)
                    txv.setText(getResources().getString(R.string.TNNfood8));
                else if(idcity==14&idnightmarket==10)
                    txv.setText(getResources().getString(R.string.TNNfood9));
                else if(idcity==14&idnightmarket==11)
                    txv.setText(getResources().getString(R.string.TNNfood10));
                else if(idcity==14&idnightmarket==12)
                    txv.setText(getResources().getString(R.string.TNNfood11));
                else if(idcity==14&idnightmarket==13)
                    txv.setText(getResources().getString(R.string.TNNfood12));
                else if(idcity==14&idnightmarket==14)
                    txv.setText(getResources().getString(R.string.TNNfood13));
                else if(idcity==14&idnightmarket==15)
                    txv.setText(getResources().getString(R.string.TNNfood14));
                else if(idcity==14&idnightmarket==16)
                    txv.setText(getResources().getString(R.string.TNNfood15));
                else if(idcity==14&idnightmarket==17)
                    txv.setText(getResources().getString(R.string.TNNfood16));
                else if(idcity==14&idnightmarket==18)
                    txv.setText(getResources().getString(R.string.TNNfood17));
                else if(idcity==14&idnightmarket==19)
                    txv.setText(getResources().getString(R.string.TNNfood18));
                else if(idcity==14&idnightmarket==20)
                    txv.setText(getResources().getString(R.string.TNNfood19));
                else if(idcity==14&idnightmarket==21)
                    txv.setText(getResources().getString(R.string.TNNfood20));
                else if(idcity==14&idnightmarket==22)
                    txv.setText(getResources().getString(R.string.TNNfood21));
                else if(idcity==14&idnightmarket==23)
                    txv.setText(getResources().getString(R.string.TNNfood22));
                else if(idcity==14&idnightmarket==24)
                    txv.setText(getResources().getString(R.string.TNNfood23));
                else if(idcity==14&idnightmarket==25)
                    txv.setText(getResources().getString(R.string.TNNfood24));
                else if(idcity==14&idnightmarket==26)
                    txv.setText(getResources().getString(R.string.TNNfood25));
                else if(idcity==14&idnightmarket==27)
                    txv.setText(getResources().getString(R.string.TNNfood26));
                else if(idcity==14&idnightmarket==28)
                    txv.setText(getResources().getString(R.string.TNNfood27));
                else if(idcity==14&idnightmarket==29)
                    txv.setText(getResources().getString(R.string.TNNfood28));
                else if(idcity==14&idnightmarket==30)
                    txv.setText(getResources().getString(R.string.TNNfood29));
                else if(idcity==14&idnightmarket==31)
                    txv.setText(getResources().getString(R.string.TNNfood30));
                else if(idcity==14&idnightmarket==32)
                    txv.setText(getResources().getString(R.string.TNNfood31));
                else if(idcity==14&idnightmarket==33)
                    txv.setText(getResources().getString(R.string.TNNfood32));
                else if(idcity==14&idnightmarket==34)
                    txv.setText(getResources().getString(R.string.TNNfood33));
                else if(idcity==14&idnightmarket==35)
                    txv.setText(getResources().getString(R.string.TNNfood34));
                else if(idcity==14&idnightmarket==36)
                    txv.setText(getResources().getString(R.string.TNNfood35));
                else if(idcity==14&idnightmarket==37)
                    txv.setText(getResources().getString(R.string.TNNfood36));
                else if(idcity==14&idnightmarket==38)
                    txv.setText(getResources().getString(R.string.TNNfood37));
                else if(idcity==14&idnightmarket==39)
                    txv.setText(getResources().getString(R.string.TNNfood38));
                else if(idcity==14&idnightmarket==40)
                    txv.setText(getResources().getString(R.string.TNNfood39));
                else if(idcity==14&idnightmarket==41)
                    txv.setText(getResources().getString(R.string.TNNfood40));
                else if(idcity==14&idnightmarket==42)
                    txv.setText(getResources().getString(R.string.TNNfood41));
                else if(idcity==14&idnightmarket==43)
                    txv.setText(getResources().getString(R.string.TNNfood42));
                else if(idcity==14&idnightmarket==44)
                    txv.setText(getResources().getString(R.string.TNNfood43));
                else if(idcity==14&idnightmarket==45)
                    txv.setText(getResources().getString(R.string.TNNfood44));
                else if(idcity==14&idnightmarket==46)
                    txv.setText(getResources().getString(R.string.TNNfood45));
                else if(idcity==14&idnightmarket==47)
                    txv.setText(getResources().getString(R.string.TNNfood46));
                else if(idcity==14&idnightmarket==48)
                    txv.setText(getResources().getString(R.string.TNNfood47));
                else if(idcity==14&idnightmarket==49)
                    txv.setText(getResources().getString(R.string.TNNfood48));
                else if(idcity==14&idnightmarket==50)
                    txv.setText(getResources().getString(R.string.TNNfood49));
                else if(idcity==14&idnightmarket==51)
                    txv.setText(getResources().getString(R.string.TNNfood50));
                else if(idcity==14&idnightmarket==52)
                    txv.setText(getResources().getString(R.string.TNNfood51));
                else if(idcity==14&idnightmarket==53)
                    txv.setText(getResources().getString(R.string.TNNfood52));
                else if(idcity==14&idnightmarket==54)
                    txv.setText(getResources().getString(R.string.TNNfood53));
                else if(idcity==14&idnightmarket==55)
                    txv.setText(getResources().getString(R.string.TNNfood54));
                else if(idcity==14&idnightmarket==56)
                    txv.setText(getResources().getString(R.string.TNNfood55));
                else if(idcity==14&idnightmarket==57)
                    txv.setText(getResources().getString(R.string.TNNfood56));
                else if(idcity==14&idnightmarket==58)
                    txv.setText(getResources().getString(R.string.TNNfood57));
                else if(idcity==14&idnightmarket==59)
                    txv.setText(getResources().getString(R.string.TNNfood58));
                else if(idcity==14&idnightmarket==60)
                    txv.setText(getResources().getString(R.string.TNNfood59));
                else if(idcity==14&idnightmarket==61)
                    txv.setText(getResources().getString(R.string.TNNfood60));
                else if(idcity==15&idnightmarket==1)
                    txv.setText(getResources().getString(R.string.KHHfood));
                else if(idcity==15&idnightmarket==2)
                    txv.setText(getResources().getString(R.string.KHHfood1));
                else if(idcity==15&idnightmarket==3)
                    txv.setText(getResources().getString(R.string.KHHfood2));
                else if(idcity==15&idnightmarket==4)
                    txv.setText(getResources().getString(R.string.KHHfood3));
                else if(idcity==15&idnightmarket==5)
                    txv.setText(getResources().getString(R.string.KHHfood4));
                else if(idcity==15&idnightmarket==6)
                    txv.setText(getResources().getString(R.string.KHHfood5));
                else if(idcity==15&idnightmarket==7)
                    txv.setText(getResources().getString(R.string.KHHfood6));
                else if(idcity==15&idnightmarket==8)
                    txv.setText(getResources().getString(R.string.KHHfood7));
                else if(idcity==15&idnightmarket==9)
                    txv.setText(getResources().getString(R.string.KHHfood8));
                else if(idcity==15&idnightmarket==10)
                    txv.setText(getResources().getString(R.string.KHHfood9));
                else if(idcity==15&idnightmarket==11)
                    txv.setText(getResources().getString(R.string.KHHfood10));
                else if(idcity==15&idnightmarket==12)
                    txv.setText(getResources().getString(R.string.KHHfood11));
                else if(idcity==15&idnightmarket==13)
                    txv.setText(getResources().getString(R.string.KHHfood12));
                else if(idcity==15&idnightmarket==14)
                    txv.setText(getResources().getString(R.string.KHHfood13));
                else if(idcity==15&idnightmarket==15)
                    txv.setText(getResources().getString(R.string.KHHfood14));
                else if(idcity==15&idnightmarket==16)
                    txv.setText(getResources().getString(R.string.KHHfood15));
                else if(idcity==15&idnightmarket==17)
                    txv.setText(getResources().getString(R.string.KHHfood16));
                else if(idcity==15&idnightmarket==18)
                    txv.setText(getResources().getString(R.string.KHHfood17));
                else if(idcity==15&idnightmarket==19)
                    txv.setText(getResources().getString(R.string.KHHfood18));
                else if(idcity==15&idnightmarket==20)
                    txv.setText(getResources().getString(R.string.KHHfood19));
                else if(idcity==15&idnightmarket==21)
                    txv.setText(getResources().getString(R.string.KHHfood20));
                else if(idcity==15&idnightmarket==22)
                    txv.setText(getResources().getString(R.string.KHHfood21));
                else if(idcity==15&idnightmarket==23)
                    txv.setText(getResources().getString(R.string.KHHfood22));
                else if(idcity==15&idnightmarket==24)
                    txv.setText(getResources().getString(R.string.KHHfood23));
                else if(idcity==15&idnightmarket==25)
                    txv.setText(getResources().getString(R.string.KHHfood24));
                else if(idcity==15&idnightmarket==26)
                    txv.setText(getResources().getString(R.string.KHHfood25));
                else if(idcity==15&idnightmarket==27)
                    txv.setText(getResources().getString(R.string.KHHfood26));
                else if(idcity==15&idnightmarket==28)
                    txv.setText(getResources().getString(R.string.KHHfood27));
                else if(idcity==15&idnightmarket==29)
                    txv.setText(getResources().getString(R.string.KHHfood28));
                else if(idcity==15&idnightmarket==30)
                    txv.setText(getResources().getString(R.string.KHHfood29));
                else if(idcity==15&idnightmarket==31)
                    txv.setText(getResources().getString(R.string.KHHfood30));
                else if(idcity==15&idnightmarket==32)
                    txv.setText(getResources().getString(R.string.KHHfood31));
                else if(idcity==15&idnightmarket==33)
                    txv.setText(getResources().getString(R.string.KHHfood32));
                else if(idcity==15&idnightmarket==34)
                    txv.setText(getResources().getString(R.string.KHHfood33));
                else if(idcity==15&idnightmarket==35)
                    txv.setText(getResources().getString(R.string.KHHfood34));
                else if(idcity==15&idnightmarket==36)
                    txv.setText(getResources().getString(R.string.KHHfood35));
                else if(idcity==15&idnightmarket==37)
                    txv.setText(getResources().getString(R.string.KHHfood36));
                else if(idcity==15&idnightmarket==38)
                    txv.setText(getResources().getString(R.string.KHHfood37));
                else if(idcity==15&idnightmarket==39)
                    txv.setText(getResources().getString(R.string.KHHfood38));
                else if(idcity==15&idnightmarket==40)
                    txv.setText(getResources().getString(R.string.KHHfood39));
                else if(idcity==15&idnightmarket==41)
                    txv.setText(getResources().getString(R.string.KHHfood40));
                else if(idcity==15&idnightmarket==42)
                    txv.setText(getResources().getString(R.string.KHHfood41));
                else if(idcity==15&idnightmarket==43)
                    txv.setText(getResources().getString(R.string.KHHfood42));
                else if(idcity==15&idnightmarket==44)
                    txv.setText(getResources().getString(R.string.KHHfood43));
                else if(idcity==15&idnightmarket==45)
                    txv.setText(getResources().getString(R.string.KHHfood44));
                else if(idcity==15&idnightmarket==46)
                    txv.setText(getResources().getString(R.string.KHHfood45));
                else if(idcity==16&idnightmarket==1)
                    txv.setText(getResources().getString(R.string.PIFfood));
                else if(idcity==16&idnightmarket==2)
                    txv.setText(getResources().getString(R.string.PIFfood1));
                else if(idcity==16&idnightmarket==3)
                    txv.setText(getResources().getString(R.string.PIFfood2));
                else if(idcity==16&idnightmarket==4)
                    txv.setText(getResources().getString(R.string.PIFfood3));
                else if(idcity==16&idnightmarket==5)
                    txv.setText(getResources().getString(R.string.PIFfood4));
                else if(idcity==16&idnightmarket==6)
                    txv.setText(getResources().getString(R.string.PIFfood5));
                else if(idcity==16&idnightmarket==7)
                    txv.setText(getResources().getString(R.string.PIFfood6));
                else if(idcity==16&idnightmarket==8)
                    txv.setText(getResources().getString(R.string.PIFfood7));
                else if(idcity==16&idnightmarket==9)
                    txv.setText(getResources().getString(R.string.PIFfood8));
                else if(idcity==16&idnightmarket==10)
                    txv.setText(getResources().getString(R.string.PIFfood9));
                else if(idcity==16&idnightmarket==11)
                    txv.setText(getResources().getString(R.string.PIFfood10));
                else if(idcity==16&idnightmarket==12)
                    txv.setText(getResources().getString(R.string.PIFfood11));
                else if(idcity==16&idnightmarket==13)
                    txv.setText(getResources().getString(R.string.PIFfood12));
                else if(idcity==16&idnightmarket==14)
                    txv.setText(getResources().getString(R.string.PIFfood13));
                else if(idcity==16&idnightmarket==15)
                    txv.setText(getResources().getString(R.string.PIFfood14));
                else if(idcity==16&idnightmarket==16)
                    txv.setText(getResources().getString(R.string.PIFfood15));
                else if(idcity==16&idnightmarket==17)
                    txv.setText(getResources().getString(R.string.PIFfood16));
                else if(idcity==16&idnightmarket==18)
                    txv.setText(getResources().getString(R.string.PIFfood17));
                else if(idcity==16&idnightmarket==19)
                    txv.setText(getResources().getString(R.string.PIFfood18));
                else if(idcity==16&idnightmarket==20)
                    txv.setText(getResources().getString(R.string.PIFfood19));
                else if(idcity==16&idnightmarket==21)
                    txv.setText(getResources().getString(R.string.PIFfood20));
                else if(idcity==16&idnightmarket==22)
                    txv.setText(getResources().getString(R.string.PIFfood21));
                else if(idcity==16&idnightmarket==23)
                    txv.setText(getResources().getString(R.string.PIFfood22));
                else if(idcity==16&idnightmarket==24)
                    txv.setText(getResources().getString(R.string.PIFfood23));
                else if(idcity==16&idnightmarket==25)
                    txv.setText(getResources().getString(R.string.PIFfood24));
                else if(idcity==16&idnightmarket==26)
                    txv.setText(getResources().getString(R.string.PIFfood25));
                else if(idcity==16&idnightmarket==27)
                    txv.setText(getResources().getString(R.string.PIFfood26));
                else if(idcity==16&idnightmarket==28)
                    txv.setText(getResources().getString(R.string.PIFfood27));
                else if(idcity==16&idnightmarket==29)
                    txv.setText(getResources().getString(R.string.PIFfood28));
                else if(idcity==16&idnightmarket==30)
                    txv.setText(getResources().getString(R.string.PIFfood29));
                else if(idcity==16&idnightmarket==31)
                    txv.setText(getResources().getString(R.string.PIFfood30));
                else if(idcity==16&idnightmarket==32)
                    txv.setText(getResources().getString(R.string.PIFfood31));
                else if(idcity==17&idnightmarket==1)
                    txv.setText(getResources().getString(R.string.ILAfood));
                else if(idcity==17&idnightmarket==2)
                    txv.setText(getResources().getString(R.string.ILAfood1));
                else if(idcity==17&idnightmarket==3)
                    txv.setText(getResources().getString(R.string.ILAfood2));
                else if(idcity==17&idnightmarket==4)
                    txv.setText(getResources().getString(R.string.ILAfood3));
                else if(idcity==17&idnightmarket==5)
                    txv.setText(getResources().getString(R.string.ILAfood4));
                else if(idcity==17&idnightmarket==6)
                    txv.setText(getResources().getString(R.string.ILAfood5));
                else if(idcity==17&idnightmarket==7)
                    txv.setText(getResources().getString(R.string.ILAfood6));
                else if(idcity==17&idnightmarket==8)
                    txv.setText(getResources().getString(R.string.ILAfood7));
                else if(idcity==17&idnightmarket==9)
                    txv.setText(getResources().getString(R.string.ILAfood8));
                else if(idcity==17&idnightmarket==10)
                    txv.setText(getResources().getString(R.string.ILAfood9));
                else if(idcity==18&idnightmarket==1)
                    txv.setText(getResources().getString(R.string.HUNfood));
                else if(idcity==18&idnightmarket==2)
                    txv.setText(getResources().getString(R.string.HUNfood1));
                else if(idcity==18&idnightmarket==3)
                    txv.setText(getResources().getString(R.string.HUNfood2));
                else if(idcity==18&idnightmarket==4)
                    txv.setText(getResources().getString(R.string.HUNfood3));
                else if(idcity==18&idnightmarket==5)
                    txv.setText(getResources().getString(R.string.HUNfood4));
                else if(idcity==18&idnightmarket==6)
                    txv.setText(getResources().getString(R.string.HUNfood5));
                else if(idcity==18&idnightmarket==7)
                    txv.setText(getResources().getString(R.string.HUNfood6));
                else if(idcity==18&idnightmarket==8)
                    txv.setText(getResources().getString(R.string.HUNfood7));
                else if(idcity==18&idnightmarket==9)
                    txv.setText(getResources().getString(R.string.HUNfood8));
                else if(idcity==18&idnightmarket==10)
                    txv.setText(getResources().getString(R.string.HUNfood9));
                else if(idcity==18&idnightmarket==11)
                    txv.setText(getResources().getString(R.string.HUNfood10));
                else if(idcity==18&idnightmarket==12)
                    txv.setText(getResources().getString(R.string.HUNfood11));
                else if(idcity==18&idnightmarket==13)
                    txv.setText(getResources().getString(R.string.HUNfood12));
                else if(idcity==18&idnightmarket==14)
                    txv.setText(getResources().getString(R.string.HUNfood13));
                else if(idcity==18&idnightmarket==15)
                    txv.setText(getResources().getString(R.string.HUNfood14));
                else if(idcity==18&idnightmarket==16)
                    txv.setText(getResources().getString(R.string.HUNfood15));
                else if(idcity==18&idnightmarket==17)
                    txv.setText(getResources().getString(R.string.HUNfood16));
                else if(idcity==18&idnightmarket==18)
                    txv.setText(getResources().getString(R.string.HUNfood17));
                else if(idcity==18&idnightmarket==19)
                    txv.setText(getResources().getString(R.string.HUNfood18));
                else if(idcity==19&idnightmarket==1)
                    txv.setText(getResources().getString(R.string.TTTfood));
                else if(idcity==19&idnightmarket==2)
                    txv.setText(getResources().getString(R.string.TTTfood1));
                else if(idcity==19&idnightmarket==3)
                    txv.setText(getResources().getString(R.string.TTTfood2));
                else if(idcity==19&idnightmarket==4)
                    txv.setText(getResources().getString(R.string.TTTfood3));
                else if(idcity==19&idnightmarket==5)
                    txv.setText(getResources().getString(R.string.TTTfood4));
                else if(idcity==19&idnightmarket==6)
                    txv.setText(getResources().getString(R.string.TTTfood5));
                else if(idcity==19&idnightmarket==7)
                    txv.setText(getResources().getString(R.string.TTTfood6));
                else if(idcity==19&idnightmarket==8)
                    txv.setText(getResources().getString(R.string.TTTfood7));
                else if(idcity==19&idnightmarket==9)
                    txv.setText(getResources().getString(R.string.TTTfood8));
                else if(idcity==19&idnightmarket==10)
                    txv.setText(getResources().getString(R.string.TTTfood9));
                else if(idcity==19&idnightmarket==11)
                    txv.setText(getResources().getString(R.string.TTTfood10));
                else if(idcity==19&idnightmarket==12)
                    txv.setText(getResources().getString(R.string.TTTfood11));
                else if(idcity==20&idnightmarket==1)
                    txv.setText(getResources().getString(R.string.PEHfood));
                else if(idcity==20&idnightmarket==2)
                    txv.setText(getResources().getString(R.string.PEHfood1));
                else if(idcity==20&idnightmarket==3)
                    txv.setText(getResources().getString(R.string.PEHfood2));
                else if(idcity==21&idnightmarket==1)
                    txv.setText(getResources().getString(R.string.KNHfood));
                else if(idcity==21&idnightmarket==2)
                    txv.setText(getResources().getString(R.string.KNHfood1));
                else if(idcity==22&idnightmarket==1)
                    txv.setText(getResources().getString(R.string.LNNfood));
                else
                    txv.setText("請選擇縣市或夜市");
            }
        });
    }
}