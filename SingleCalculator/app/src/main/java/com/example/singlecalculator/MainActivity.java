package com.example.singlecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//Khai báo đối tượng làm việc
    EditText editSoA, editSoB;
    TextView textViewKetQua;
    Button nutCong, nutTru, nutNhan, nutChia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimWidget();
    }
    void  TimWidget(){
        editSoA=(EditText)findViewById(R.id.edSoA);
        editSoB=(EditText) findViewById(R.id.edSoB);
        textViewKetQua=(TextView) findViewById(R.id.tvKetQua);
        nutCong=(Button) findViewById(R.id.btnCong);
        nutTru=(Button) findViewById(R.id.btnTru);
        nutNhan=(Button) findViewById(R.id.btnNhan);
        nutChia=(Button) findViewById(R.id.btnChia);
    }
    //Hàm xử lý
    public  void  XuLyCong(View v){
        //Lấy dữ liệu
        String sA = editSoA.getText().toString();
        String sB = editSoB.getText().toString();
        //Chuyển sang kiểu số
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        //Tính toán
        int tong = a+b;
        //Chuyển tổng thành chuỗi
        String chuoiTong = String.valueOf(tong);
        //Xuất kết quả
        textViewKetQua.setText("Tổng là: " + chuoiTong);
    }
    public  void  XuLyTru(View v){
        //Lấy dữ liệu
        String sA = editSoA.getText().toString();
        String sB = editSoB.getText().toString();
        //Chuyển sang kiểu số
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        //Tính toán
        int hieu = a-b;
        //Chuyển hiệu thành chuỗi
        String chuoiHieu = String.valueOf(hieu);
        //Xuất kết quả
        textViewKetQua.setText("Hiệu là: " + chuoiHieu);
    }
    public  void  XuLyNhan(View v){
        //Lấy dữ liệu
        String sA = editSoA.getText().toString();
        String sB = editSoB.getText().toString();
        //Chuyển sang kiểu số
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        //Tính toán
        int tich = a*b;
        //Chuyển tích thành chuỗi
        String chuoiTich = String.valueOf(tich);
        //Xuất kết quả
        textViewKetQua.setText("Tích là: " + chuoiTich);
    }
    public  void  XuLyChia(View v){
        //Lấy dữ liệu
        String sA = editSoA.getText().toString();
        String sB = editSoB.getText().toString();
        //Chuyển sang kiểu số
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        //Tính toán
        int thuong = a+b;
        //Chuyển thương thành chuỗi
        String chuoiThuong = String.valueOf(thuong);
        //Xuất kết quả
        textViewKetQua.setText("Thương là: " + chuoiThuong);
    }
}