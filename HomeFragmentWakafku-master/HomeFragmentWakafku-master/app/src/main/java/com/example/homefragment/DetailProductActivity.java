package com.example.homefragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.viewpager2.widget.ViewPager2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class DetailProductActivity extends AppCompatActivity {

    AdapterDetailProduct adapterDetailProduct;
    LinearLayout layoutIndicator;
    ViewPager2 viewPager2;
    Button btnActionBuyNow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_product);
        layoutIndicator = findViewById(R.id.indicator_image_detail_product);
        btnActionBuyNow = findViewById(R.id.btn_action_buy_now);


        setImageItems();
        setupIndicator();
        setCurrentIndicator(0);

        viewPager2 = findViewById(R.id.viewpager_image_detail_product);
        viewPager2.setAdapter(adapterDetailProduct);
        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                setCurrentIndicator(position);
            }
        });

        btnActionBuyNow.setOnClickListener(v ->
                startActivity(new Intent(getApplication(), DetailPesananActivity.class)));

    }
    private void setImageItems(){
        ArrayList<DataModelDetailProduct> dataModelDetailProducts = new ArrayList<>();

        DataModelDetailProduct image1 = new DataModelDetailProduct();
        image1.setImg(R.drawable.product1);
        DataModelDetailProduct image2 = new DataModelDetailProduct();
        image2.setImg(R.drawable.produc2);
        DataModelDetailProduct image3 = new DataModelDetailProduct();
        image3.setImg(R.drawable.product1);

        dataModelDetailProducts.add(image1);
        dataModelDetailProducts.add(image2);
        dataModelDetailProducts.add(image3);

        adapterDetailProduct = new AdapterDetailProduct(dataModelDetailProducts);
    }
    private void setupIndicator(){
        ImageView[] indicators = new ImageView[adapterDetailProduct.getItemCount()];
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT
        );
        layoutParams.setMargins(8,0,8,0);
        for (int i=0; i<indicators.length; i++){
            indicators[i] = new ImageView(getApplicationContext());
            indicators[i].setImageDrawable(ContextCompat.getDrawable(
                    getApplicationContext(),
                    R.drawable.button_round_inactive
            ));
            indicators[i].setLayoutParams(layoutParams);
            layoutIndicator.addView(indicators[i]);
        }
    }
    @SuppressLint("SetTextI18n")
    private void setCurrentIndicator(int index){
        int childCount = layoutIndicator.getChildCount();
        for (int i=0;i<childCount;i++){
            ImageView imageView = (ImageView) layoutIndicator.getChildAt(i);
            if (i==index){
                imageView.setImageDrawable(
                        ContextCompat.getDrawable(getApplicationContext(),R.drawable.button_round)
                );
            }else {
                imageView.setImageDrawable(
                        ContextCompat.getDrawable(getApplicationContext(),R.drawable.button_round_inactive)
                );
            }
        }
    }

}