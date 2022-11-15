package com.example.mutiplercvrepeat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.mutiplercvrepeat.Adapter.Item1Adapter;
import com.example.mutiplercvrepeat.Adapter.Item2Adapter;
import com.example.mutiplercvrepeat.Adapter.Item3Adapter;
import com.example.mutiplercvrepeat.Model.Item1bamat;
import com.example.mutiplercvrepeat.Model.Item2p10;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView offerRCV, dm3matRCV,dmpp10RCv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //image Slider

        ImageSlider imageSlider;

        imageSlider =findViewById(R.id.image_slider);

        ArrayList<SlideModel> imageList1 = new ArrayList<>();

        imageList1.add(new SlideModel(R.drawable.ic_p10_1, ScaleTypes.FIT));
        imageList1.add(new SlideModel(R.drawable.ic_p10_2,ScaleTypes.CENTER_CROP));
        imageList1.add(new SlideModel(R.drawable.ic_p10_3,ScaleTypes.CENTER_CROP));
        imageList1.add(new SlideModel(R.drawable.ic_p10_2,ScaleTypes.FIT));


        imageSlider.setImageList(imageList1);

        //offer
        offerRCV = findViewById(R.id.DmOfferRCV);
        offerRCV.setHasFixedSize(true);
        offerRCV.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        List<Integer> imageList = new ArrayList<>();
        imageList.add(R.drawable.ic_offer);
        imageList.add(R.drawable.offer2);
        imageList.add(R.drawable.ic_offer);

        Item3Adapter item3Adapter = new Item3Adapter(imageList);
        offerRCV.setAdapter(item3Adapter);

        //3mat
        dm3matRCV = findViewById(R.id.Dm3matRCV);
        dm3matRCV.setHasFixedSize(true);
        dm3matRCV.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        List<Item1bamat> item1bamatList = new ArrayList<>();
        item1bamatList.add(new Item1bamat(R.drawable.a,"Led 3 Mat SHX"));
        item1bamatList.add(new Item1bamat(R.drawable.b,"Led 3 Mat Jiyi"));
        item1bamatList.add(new Item1bamat(R.drawable.c,"Led 3 Mat HHX"));
        item1bamatList.add(new Item1bamat(R.drawable.d,"Led 3 Mat SHX"));

        Item1Adapter item1Adapter = new Item1Adapter(item1bamatList);
        dm3matRCV.setAdapter(item1Adapter);

        //p10

        dmpp10RCv = findViewById(R.id.DmP10RCV);
        dmpp10RCv.setHasFixedSize(true);
        dmpp10RCv.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        List<Item2p10> item2p10List = new ArrayList<>();
        item2p10List.add(new Item2p10(R.drawable.ic_p10,"LED P10 Do SMD"));
        item2p10List.add(new Item2p10(R.drawable.ic_p10_2,"LED P10 Full outdoor"));
        item2p10List.add(new Item2p10(R.drawable.ic_p10,"LED P10 Full indoor"));
        item2p10List.add(new Item2p10(R.drawable.ic_p10,"LED P10 Trang SMD"));

        Item2Adapter item2Adapter = new Item2Adapter(item2p10List);
        dmpp10RCv.setAdapter(item2Adapter);
    }
}