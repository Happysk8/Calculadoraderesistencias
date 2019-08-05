package com.estebanacevedo.calculadoraderesistencias

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

   /* private lateinit var COLOR1_KEY: Int?
    var colorb1 = getResources().getColor((R.color.black))*/

    private var b1 = 0
    private var b2 = 0
    private var b3: Float  = 1.0F
    private var b4: Float  = 1.0F
    private var result = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        colorb1 = savedInstanceState?.getInt(COLOR1_KEY)

        btnegro1.setOnClickListener {
            txbarra1.setBackgroundColor(getResources().getColor((R.color.black)))
            b1 = 0

            if ((b1*10+b2)*b3 >= 1000000000) {
                result = (((b1 * 10 + b2) * b3 / 1000000000) ).toString()
                txresultado.text = result + "G" + "Ω" + "±" + b4 + "%"
            }else if((b1*10+b2)*b3 >= 1000000){
                result = (((b1*10+b2)*b3/1000000) ).toString()
                txresultado.text = result + "M" + "Ω" + "±" + b4 + "%"
            }else if ((b1*10+b2)*b3 >= 1000){
                result = (((b1*10+b2)*b3/1000) ).toString()
                txresultado.text = result + "K" + "Ω" + "±" + b4 + "%"
            }else{
                result = (((b1*10+b2)*b3) ).toString()
                txresultado.text = result + "Ω" + "±" + b4 + "%"
            }
//            txbarra1.setBackgroundColor(colorb1)
        }

        btnegro2.setOnClickListener {
            txbarra2.setBackgroundColor(getResources().getColor((R.color.black)))
            b2 = 0
            if ((b1*10+b2)*b3 >= 1000000000) {
                result = (((b1 * 10 + b2) * b3 / 1000000000) ).toString()
                txresultado.text = result + "G" + "Ω" + "±" + b4 + "%"
            }else if((b1*10+b2)*b3 >= 1000000){
                result = (((b1*10+b2)*b3/1000000) ).toString()
                txresultado.text = result + "M" + "Ω" + "±" + b4 + "%"
            }else if ((b1*10+b2)*b3 >= 1000){
                result = (((b1*10+b2)*b3/1000) ).toString()
                txresultado.text = result + "K" + "Ω" + "±" + b4 + "%"
            }else{
                result = (((b1*10+b2)*b3) ).toString()
                txresultado.text = result + "Ω" + "±" + b4 + "%"
            }
        }

        btnegro3.setOnClickListener {
            txbarra3.setBackgroundColor(getResources().getColor((R.color.black)))
            b3 = 1F
            if ((b1*10+b2)*b3 >= 1000000000) {
                result = (((b1 * 10 + b2) * b3 / 1000000000) ).toString()
                txresultado.text = result + "G" + "Ω" + "±" + b4 + "%"
            }else if((b1*10+b2)*b3 >= 1000000){
                result = (((b1*10+b2)*b3/1000000) ).toString()
                txresultado.text = result + "M" + "Ω" + "±" + b4 + "%"
            }else if ((b1*10+b2)*b3 >= 1000){
                result = (((b1*10+b2)*b3/1000) ).toString()
                txresultado.text = result + "K" + "Ω" + "±" + b4 + "%"
            }else{
                result = (((b1*10+b2)*b3) ).toString()
                txresultado.text = result + "Ω" + "±" + b4 + "%"
            }
        }

        btcafe1.setOnClickListener {
            txbarra1.setBackgroundColor(getResources().getColor((R.color.saddlebrown)))
            b1 = 1
            if ((b1*10+b2)*b3 >= 1000000000) {
                result = (((b1 * 10 + b2) * b3 / 1000000000) ).toString()
                txresultado.text = result + "G" + "Ω" + "±" + b4 + "%"
            }else if((b1*10+b2)*b3 >= 1000000){
                result = (((b1*10+b2)*b3/1000000) ).toString()
                txresultado.text = result + "M" + "Ω" + "±" + b4 + "%"
            }else if ((b1*10+b2)*b3 >= 1000){
                result = (((b1*10+b2)*b3/1000) ).toString()
                txresultado.text = result + "K" + "Ω" + "±" + b4 + "%"
            }else{
                result = (((b1*10+b2)*b3) ).toString()
                txresultado.text = result + "Ω" + "±" + b4 + "%"
            }
        }

        btcafe2.setOnClickListener {
            txbarra2.setBackgroundColor(getResources().getColor((R.color.saddlebrown)))
            b2 = 1
            if ((b1*10+b2)*b3 >= 1000000000) {
                result = (((b1 * 10 + b2) * b3 / 1000000000) ).toString()
                txresultado.text = result + "G" + "Ω" + "±" + b4 + "%"
            }else if((b1*10+b2)*b3 >= 1000000){
                result = (((b1*10+b2)*b3/1000000) ).toString()
                txresultado.text = result + "M" + "Ω" + "±" + b4 + "%"
            }else if ((b1*10+b2)*b3 >= 1000){
                result = (((b1*10+b2)*b3/1000) ).toString()
                txresultado.text = result + "K" + "Ω" + "±" + b4 + "%"
            }else{
                result = (((b1*10+b2)*b3) ).toString()
                txresultado.text = result + "Ω" + "±" + b4 + "%"
            }
        }

        btcafe3.setOnClickListener {
            txbarra3.setBackgroundColor(getResources().getColor((R.color.saddlebrown)))
            b3 = 10F
            if ((b1*10+b2)*b3 >= 1000000000) {
                result = (((b1 * 10 + b2) * b3 / 1000000000) ).toString()
                txresultado.text = result + "G" + "Ω" + "±" + b4 + "%"
            }else if((b1*10+b2)*b3 >= 1000000){
                result = (((b1*10+b2)*b3/1000000) ).toString()
                txresultado.text = result + "M" + "Ω" + "±" + b4 + "%"
            }else if ((b1*10+b2)*b3 >= 1000){
                result = (((b1*10+b2)*b3/1000) ).toString()
                txresultado.text = result + "K" + "Ω" + "±" + b4 + "%"
            }else{
                result = (((b1*10+b2)*b3) ).toString()
                txresultado.text = result + "Ω" + "±" + b4 + "%"
            }
        }

        btcafe4.setOnClickListener {
            txbarra4.setBackgroundColor(getResources().getColor((R.color.saddlebrown)))
            b4 = 1.0F
            if ((b1*10+b2)*b3 >= 1000000000) {
                result = (((b1 * 10 + b2) * b3 / 1000000000) ).toString()
                txresultado.text = result + "G" + "Ω" + "±" + b4 + "%"
            }else if((b1*10+b2)*b3 >= 1000000){
                result = (((b1*10+b2)*b3/1000000) ).toString()
                txresultado.text = result + "M" + "Ω" + "±" + b4 + "%"
            }else if ((b1*10+b2)*b3 >= 1000){
                result = (((b1*10+b2)*b3/1000) ).toString()
                txresultado.text = result + "K" + "Ω" + "±" + b4 + "%"
            }else{
                result = (((b1*10+b2)*b3) ).toString()
                txresultado.text = result + "Ω" + "±" + b4 + "%"
            }
        }

        btrojo1.setOnClickListener {
            txbarra1.setBackgroundColor(getResources().getColor((R.color.red)))
            b1 = 2
            if ((b1*10+b2)*b3 >= 1000000000) {
                result = (((b1 * 10 + b2) * b3 / 1000000000) ).toString()
                txresultado.text = result + "G" + "Ω" + "±" + b4 + "%"
            }else if((b1*10+b2)*b3 >= 1000000){
                result = (((b1*10+b2)*b3/1000000) ).toString()
                txresultado.text = result + "M" + "Ω" + "±" + b4 + "%"
            }else if ((b1*10+b2)*b3 >= 1000){
                result = (((b1*10+b2)*b3/1000) ).toString()
                txresultado.text = result + "K" + "Ω" + "±" + b4 + "%"
            }else{
                result = (((b1*10+b2)*b3) ).toString()
                txresultado.text = result + "Ω" + "±" + b4 + "%"
            }
        }

        btrojo2.setOnClickListener {
            txbarra2.setBackgroundColor(getResources().getColor((R.color.red)))
            b2 = 2
            if ((b1*10+b2)*b3 >= 1000000000) {
                result = (((b1 * 10 + b2) * b3 / 1000000000) ).toString()
                txresultado.text = result + "G" + "Ω" + "±" + b4 + "%"
            }else if((b1*10+b2)*b3 >= 1000000){
                result = (((b1*10+b2)*b3/1000000) ).toString()
                txresultado.text = result + "M" + "Ω" + "±" + b4 + "%"
            }else if ((b1*10+b2)*b3 >= 1000){
                result = (((b1*10+b2)*b3/1000) ).toString()
                txresultado.text = result + "K" + "Ω" + "±" + b4 + "%"
            }else{
                result = (((b1*10+b2)*b3) ).toString()
                txresultado.text = result + "Ω" + "±" + b4 + "%"
            }
        }

        btrojo3.setOnClickListener {
            txbarra3.setBackgroundColor(getResources().getColor((R.color.red)))
            b3 = 100F
            if ((b1*10+b2)*b3 >= 1000000000) {
                result = (((b1 * 10 + b2) * b3 / 1000000000) ).toString()
                txresultado.text = result + "G" + "Ω" + "±" + b4 + "%"
            }else if((b1*10+b2)*b3 >= 1000000){
                result = (((b1*10+b2)*b3/1000000) ).toString()
                txresultado.text = result + "M" + "Ω" + "±" + b4 + "%"
            }else if ((b1*10+b2)*b3 >= 1000){
                result = (((b1*10+b2)*b3/1000) ).toString()
                txresultado.text = result + "K" + "Ω" + "±" + b4 + "%"
            }else{
                result = (((b1*10+b2)*b3) ).toString()
                txresultado.text = result + "Ω" + "±" + b4 + "%"
            }
        }

        btrojo4.setOnClickListener {
            txbarra4.setBackgroundColor(getResources().getColor((R.color.red)))
            b4 = 2.0F
            if ((b1*10+b2)*b3 >= 1000000000) {
                result = (((b1 * 10 + b2) * b3 / 1000000000) ).toString()
                txresultado.text = result + "G" + "Ω" + "±" + b4 + "%"
            }else if((b1*10+b2)*b3 >= 1000000){
                result = (((b1*10+b2)*b3/1000000) ).toString()
                txresultado.text = result + "M" + "Ω" + "±" + b4 + "%"
            }else if ((b1*10+b2)*b3 >= 1000){
                result = (((b1*10+b2)*b3/1000) ).toString()
                txresultado.text = result + "K" + "Ω" + "±" + b4 + "%"
            }else{
                result = (((b1*10+b2)*b3) ).toString()
                txresultado.text = result + "Ω" + "±" + b4 + "%"
            }
        }

        btnaranja1.setOnClickListener {
            txbarra1.setBackgroundColor(getResources().getColor((R.color.orange)))
            b1 = 3
            if ((b1*10+b2)*b3 >= 1000000000) {
                result = (((b1 * 10 + b2) * b3 / 1000000000) ).toString()
                txresultado.text = result + "G" + "Ω" + "±" + b4 + "%"
            }else if((b1*10+b2)*b3 >= 1000000){
                result = (((b1*10+b2)*b3/1000000) ).toString()
                txresultado.text = result + "M" + "Ω" + "±" + b4 + "%"
            }else if ((b1*10+b2)*b3 >= 1000){
                result = (((b1*10+b2)*b3/1000) ).toString()
                txresultado.text = result + "K" + "Ω" + "±" + b4 + "%"
            }else{
                result = (((b1*10+b2)*b3) ).toString()
                txresultado.text = result + "Ω" + "±" + b4 + "%"
            }
        }

        btnaranja2.setOnClickListener {
            txbarra2.setBackgroundColor(getResources().getColor((R.color.orange)))
            b2 = 3
            if ((b1*10+b2)*b3 >= 1000000000) {
                result = (((b1 * 10 + b2) * b3 / 1000000000) ).toString()
                txresultado.text = result + "G" + "Ω" + "±" + b4 + "%"
            }else if((b1*10+b2)*b3 >= 1000000){
                result = (((b1*10+b2)*b3/1000000) ).toString()
                txresultado.text = result + "M" + "Ω" + "±" + b4 + "%"
            }else if ((b1*10+b2)*b3 >= 1000){
                result = (((b1*10+b2)*b3/1000) ).toString()
                txresultado.text = result + "K" + "Ω" + "±" + b4 + "%"
            }else{
                result = (((b1*10+b2)*b3) ).toString()
                txresultado.text = result + "Ω" + "±" + b4 + "%"
            }
        }

        btnaranja3.setOnClickListener {
            txbarra3.setBackgroundColor(getResources().getColor((R.color.orange)))
            b3 = 1000F
            if ((b1*10+b2)*b3 >= 1000000000) {
                result = (((b1 * 10 + b2) * b3 / 1000000000) ).toString()
                txresultado.text = result + "G" + "Ω" + "±" + b4 + "%"
            }else if((b1*10+b2)*b3 >= 1000000){
                result = (((b1*10+b2)*b3/1000000) ).toString()
                txresultado.text = result + "M" + "Ω" + "±" + b4 + "%"
            }else if ((b1*10+b2)*b3 >= 1000){
                result = (((b1*10+b2)*b3/1000) ).toString()
                txresultado.text = result + "K" + "Ω" + "±" + b4 + "%"
            }else{
                result = (((b1*10+b2)*b3) ).toString()
                txresultado.text = result + "Ω" + "±" + b4 + "%"
            }
        }

        btamarillo1.setOnClickListener {
            txbarra1.setBackgroundColor(getResources().getColor((R.color.yellow)))
            b1 = 4
            if ((b1*10+b2)*b3 >= 1000000000) {
                result = (((b1 * 10 + b2) * b3 / 1000000000) ).toString()
                txresultado.text = result + "G" + "Ω" + "±" + b4 + "%"
            }else if((b1*10+b2)*b3 >= 1000000){
                result = (((b1*10+b2)*b3/1000000) ).toString()
                txresultado.text = result + "M" + "Ω" + "±" + b4 + "%"
            }else if ((b1*10+b2)*b3 >= 1000){
                result = (((b1*10+b2)*b3/1000) ).toString()
                txresultado.text = result + "K" + "Ω" + "±" + b4 + "%"
            }else{
                result = (((b1*10+b2)*b3) ).toString()
                txresultado.text = result + "Ω" + "±" + b4 + "%"
            }
        }

        btamarillo2.setOnClickListener {
            txbarra2.setBackgroundColor(getResources().getColor((R.color.yellow)))
            b2 = 4
            if ((b1*10+b2)*b3 >= 1000000000) {
                result = (((b1 * 10 + b2) * b3 / 1000000000) ).toString()
                txresultado.text = result + "G" + "Ω" + "±" + b4 + "%"
            }else if((b1*10+b2)*b3 >= 1000000){
                result = (((b1*10+b2)*b3/1000000) ).toString()
                txresultado.text = result + "M" + "Ω" + "±" + b4 + "%"
            }else if ((b1*10+b2)*b3 >= 1000){
                result = (((b1*10+b2)*b3/1000) ).toString()
                txresultado.text = result + "K" + "Ω" + "±" + b4 + "%"
            }else{
                result = (((b1*10+b2)*b3) ).toString()
                txresultado.text = result + "Ω" + "±" + b4 + "%"
            }
        }

        btamarillo3.setOnClickListener {
            txbarra3.setBackgroundColor(getResources().getColor((R.color.yellow)))
            b3 = 10000F
            if ((b1*10+b2)*b3 >= 1000000000) {
                result = (((b1 * 10 + b2) * b3 / 1000000000) ).toString()
                txresultado.text = result + "G" + "Ω" + "±" + b4 + "%"
            }else if((b1*10+b2)*b3 >= 1000000){
                result = (((b1*10+b2)*b3/1000000) ).toString()
                txresultado.text = result + "M" + "Ω" + "±" + b4 + "%"
            }else if ((b1*10+b2)*b3 >= 1000){
                result = (((b1*10+b2)*b3/1000) ).toString()
                txresultado.text = result + "K" + "Ω" + "±" + b4 + "%"
            }else{
                result = (((b1*10+b2)*b3) ).toString()
                txresultado.text = result + "Ω" + "±" + b4 + "%"
            }
        }

        btverde1.setOnClickListener {
            txbarra1.setBackgroundColor(getResources().getColor((R.color.green)))
            b1 = 5
            if ((b1*10+b2)*b3 >= 1000000000) {
                result = (((b1 * 10 + b2) * b3 / 1000000000) ).toString()
                txresultado.text = result + "G" + "Ω" + "±" + b4 + "%"
            }else if((b1*10+b2)*b3 >= 1000000){
                result = (((b1*10+b2)*b3/1000000) ).toString()
                txresultado.text = result + "M" + "Ω" + "±" + b4 + "%"
            }else if ((b1*10+b2)*b3 >= 1000){
                result = (((b1*10+b2)*b3/1000) ).toString()
                txresultado.text = result + "K" + "Ω" + "±" + b4 + "%"
            }else{
                result = (((b1*10+b2)*b3) ).toString()
                txresultado.text = result + "Ω" + "±" + b4 + "%"
            }
        }

        btverde2.setOnClickListener {
            txbarra2.setBackgroundColor(getResources().getColor((R.color.green)))
            b2 = 5
            if ((b1*10+b2)*b3 >= 1000000000) {
                result = (((b1 * 10 + b2) * b3 / 1000000000) ).toString()
                txresultado.text = result + "G" + "Ω" + "±" + b4 + "%"
            }else if((b1*10+b2)*b3 >= 1000000){
                result = (((b1*10+b2)*b3/1000000) ).toString()
                txresultado.text = result + "M" + "Ω" + "±" + b4 + "%"
            }else if ((b1*10+b2)*b3 >= 1000){
                result = (((b1*10+b2)*b3/1000) ).toString()
                txresultado.text = result + "K" + "Ω" + "±" + b4 + "%"
            }else{
                result = (((b1*10+b2)*b3) ).toString()
                txresultado.text = result + "Ω" + "±" + b4 + "%"
            }
        }

        btverde3.setOnClickListener {
            txbarra3.setBackgroundColor(getResources().getColor((R.color.green)))
            b3 = 100000F
            if ((b1*10+b2)*b3 >= 1000000000) {
                result = (((b1 * 10 + b2) * b3 / 1000000000) ).toString()
                txresultado.text = result + "G" + "Ω" + "±" + b4 + "%"
            }else if((b1*10+b2)*b3 >= 1000000){
                result = (((b1*10+b2)*b3/1000000) ).toString()
                txresultado.text = result + "M" + "Ω" + "±" + b4 + "%"
            }else if ((b1*10+b2)*b3 >= 1000){
                result = (((b1*10+b2)*b3/1000) ).toString()
                txresultado.text = result + "K" + "Ω" + "±" + b4 + "%"
            }else{
                result = (((b1*10+b2)*b3) ).toString()
                txresultado.text = result + "Ω" + "±" + b4 + "%"
            }
        }

        btverde4.setOnClickListener {
            txbarra4.setBackgroundColor(getResources().getColor((R.color.green)))
            b4 = 0.5F
            if ((b1*10+b2)*b3 >= 1000000000) {
                result = (((b1 * 10 + b2) * b3 / 1000000000) ).toString()
                txresultado.text = result + "G" + "Ω" + "±" + b4 + "%"
            }else if((b1*10+b2)*b3 >= 1000000){
                result = (((b1*10+b2)*b3/1000000) ).toString()
                txresultado.text = result + "M" + "Ω" + "±" + b4 + "%"
            }else if ((b1*10+b2)*b3 >= 1000){
                result = (((b1*10+b2)*b3/1000) ).toString()
                txresultado.text = result + "K" + "Ω" + "±" + b4 + "%"
            }else{
                result = (((b1*10+b2)*b3) ).toString()
                txresultado.text = result + "Ω" + "±" + b4 + "%"
            }
        }

        btazul1.setOnClickListener {
            txbarra1.setBackgroundColor(getResources().getColor((R.color.blue)))
            b1 = 6
            if ((b1*10+b2)*b3 >= 1000000000) {
                result = (((b1 * 10 + b2) * b3 / 1000000000) ).toString()
                txresultado.text = result + "G" + "Ω" + "±" + b4 + "%"
            }else if((b1*10+b2)*b3 >= 1000000){
                result = (((b1*10+b2)*b3/1000000) ).toString()
                txresultado.text = result + "M" + "Ω" + "±" + b4 + "%"
            }else if ((b1*10+b2)*b3 >= 1000){
                result = (((b1*10+b2)*b3/1000) ).toString()
                txresultado.text = result + "K" + "Ω" + "±" + b4 + "%"
            }else{
                result = (((b1*10+b2)*b3) ).toString()
                txresultado.text = result + "Ω" + "±" + b4 + "%"
            }
        }

        btazul2.setOnClickListener {
            txbarra2.setBackgroundColor(getResources().getColor((R.color.blue)))
            b2 = 6
            if ((b1*10+b2)*b3 >= 1000000000) {
                result = (((b1 * 10 + b2) * b3 / 1000000000) ).toString()
                txresultado.text = result + "G" + "Ω" + "±" + b4 + "%"
            }else if((b1*10+b2)*b3 >= 1000000){
                result = (((b1*10+b2)*b3/1000000) ).toString()
                txresultado.text = result + "M" + "Ω" + "±" + b4 + "%"
            }else if ((b1*10+b2)*b3 >= 1000){
                result = (((b1*10+b2)*b3/1000) ).toString()
                txresultado.text = result + "K" + "Ω" + "±" + b4 + "%"
            }else{
                result = (((b1*10+b2)*b3) ).toString()
                txresultado.text = result + "Ω" + "±" + b4 + "%"
            }
        }

        btazul3.setOnClickListener {
            txbarra3.setBackgroundColor(getResources().getColor((R.color.blue)))
            b3 = 1000000F
            if ((b1*10+b2)*b3 >= 1000000000) {
                result = (((b1 * 10 + b2) * b3 / 1000000000) ).toString()
                txresultado.text = result + "G" + "Ω" + "±" + b4 + "%"
            }else if((b1*10+b2)*b3 >= 1000000){
                result = (((b1*10+b2)*b3/1000000) ).toString()
                txresultado.text = result + "M" + "Ω" + "±" + b4 + "%"
            }else if ((b1*10+b2)*b3 >= 1000){
                result = (((b1*10+b2)*b3/1000) ).toString()
                txresultado.text = result + "K" + "Ω" + "±" + b4 + "%"
            }else{
                result = (((b1*10+b2)*b3) ).toString()
                txresultado.text = result + "Ω" + "±" + b4 + "%"
            }
        }

        btazul4.setOnClickListener {
            txbarra4.setBackgroundColor(getResources().getColor((R.color.blue)))
            b4 = 0.25F
            if ((b1*10+b2)*b3 >= 1000000000) {
                result = (((b1 * 10 + b2) * b3 / 1000000000) ).toString()
                txresultado.text = result + "G" + "Ω" + "±" + b4 + "%"
            }else if((b1*10+b2)*b3 >= 1000000){
                result = (((b1*10+b2)*b3/1000000) ).toString()
                txresultado.text = result + "M" + "Ω" + "±" + b4 + "%"
            }else if ((b1*10+b2)*b3 >= 1000){
                result = (((b1*10+b2)*b3/1000) ).toString()
                txresultado.text = result + "K" + "Ω" + "±" + b4 + "%"
            }else{
                result = (((b1*10+b2)*b3) ).toString()
                txresultado.text = result + "Ω" + "±" + b4 + "%"
            }
        }

        btmorado1.setOnClickListener {
            txbarra1.setBackgroundColor(getResources().getColor((R.color.purple)))
            b1 = 7
            if ((b1*10+b2)*b3 >= 1000000000) {
                result = (((b1 * 10 + b2) * b3 / 1000000000) ).toString()
                txresultado.text = result + "G" + "Ω" + "±" + b4 + "%"
            }else if((b1*10+b2)*b3 >= 1000000){
                result = (((b1*10+b2)*b3/1000000) ).toString()
                txresultado.text = result + "M" + "Ω" + "±" + b4 + "%"
            }else if ((b1*10+b2)*b3 >= 1000){
                result = (((b1*10+b2)*b3/1000) ).toString()
                txresultado.text = result + "K" + "Ω" + "±" + b4 + "%"
            }else{
                result = (((b1*10+b2)*b3) ).toString()
                txresultado.text = result + "Ω" + "±" + b4 + "%"
            }
        }

        btmorado2.setOnClickListener {
            txbarra2.setBackgroundColor(getResources().getColor((R.color.purple)))
            b2 = 7
            if ((b1*10+b2)*b3 >= 1000000000) {
                result = (((b1 * 10 + b2) * b3 / 1000000000) ).toString()
                txresultado.text = result + "G" + "Ω" + "±" + b4 + "%"
            }else if((b1*10+b2)*b3 >= 1000000){
                result = (((b1*10+b2)*b3/1000000) ).toString()
                txresultado.text = result + "M" + "Ω" + "±" + b4 + "%"
            }else if ((b1*10+b2)*b3 >= 1000){
                result = (((b1*10+b2)*b3/1000) ).toString()
                txresultado.text = result + "K" + "Ω" + "±" + b4 + "%"
            }else{
                result = (((b1*10+b2)*b3) ).toString()
                txresultado.text = result + "Ω" + "±" + b4 + "%"
            }
        }

        btmorado3.setOnClickListener {
            txbarra3.setBackgroundColor(getResources().getColor((R.color.purple)))
            b3 = 10000000F
            if ((b1*10+b2)*b3 >= 1000000000) {
                result = (((b1 * 10 + b2) * b3 / 1000000000) ).toString()
                txresultado.text = result + "G" + "Ω" + "±" + b4 + "%"
            }else if((b1*10+b2)*b3 >= 1000000){
                result = (((b1*10+b2)*b3/1000000) ).toString()
                txresultado.text = result + "M" + "Ω" + "±" + b4 + "%"
            }else if ((b1*10+b2)*b3 >= 1000){
                result = (((b1*10+b2)*b3/1000) ).toString()
                txresultado.text = result + "K" + "Ω" + "±" + b4 + "%"
            }else{
                result = (((b1*10+b2)*b3) ).toString()
                txresultado.text = result + "Ω" + "±" + b4 + "%"
            }
        }

        btmorado4.setOnClickListener {
            txbarra4.setBackgroundColor(getResources().getColor((R.color.purple)))
            b4 = 0.1F
            if ((b1*10+b2)*b3 >= 1000000000) {
                result = (((b1 * 10 + b2) * b3 / 1000000000) ).toString()
                txresultado.text = result + "G" + "Ω" + "±" + b4 + "%"
            }else if((b1*10+b2)*b3 >= 1000000){
                result = (((b1*10+b2)*b3/1000000) ).toString()
                txresultado.text = result + "M" + "Ω" + "±" + b4 + "%"
            }else if ((b1*10+b2)*b3 >= 1000){
                result = (((b1*10+b2)*b3/1000) ).toString()
                txresultado.text = result + "K" + "Ω" + "±" + b4 + "%"
            }else{
                result = (((b1*10+b2)*b3) ).toString()
                txresultado.text = result + "Ω" + "±" + b4 + "%"
            }
        }

        btgris1.setOnClickListener {
            txbarra1.setBackgroundColor(getResources().getColor((R.color.gray)))
            b1 = 8
            if ((b1*10+b2)*b3 >= 1000000000) {
                result = (((b1 * 10 + b2) * b3 / 1000000000) ).toString()
                txresultado.text = result + "G" + "Ω" + "±" + b4 + "%"
            }else if((b1*10+b2)*b3 >= 1000000){
                result = (((b1*10+b2)*b3/1000000) ).toString()
                txresultado.text = result + "M" + "Ω" + "±" + b4 + "%"
            }else if ((b1*10+b2)*b3 >= 1000){
                result = (((b1*10+b2)*b3/1000) ).toString()
                txresultado.text = result + "K" + "Ω" + "±" + b4 + "%"
            }else{
                result = (((b1*10+b2)*b3) ).toString()
                txresultado.text = result + "Ω" + "±" + b4 + "%"
            }
        }


        btgris2.setOnClickListener {
            txbarra2.setBackgroundColor(getResources().getColor((R.color.gray)))
            b2 = 8
            if ((b1*10+b2)*b3 >= 1000000000) {
                result = (((b1 * 10 + b2) * b3 / 1000000000) ).toString()
                txresultado.text = result + "G" + "Ω" + "±" + b4 + "%"
            }else if((b1*10+b2)*b3 >= 1000000){
                result = (((b1*10+b2)*b3/1000000) ).toString()
                txresultado.text = result + "M" + "Ω" + "±" + b4 + "%"
            }else if ((b1*10+b2)*b3 >= 1000){
                result = (((b1*10+b2)*b3/1000) ).toString()
                txresultado.text = result + "K" + "Ω" + "±" + b4 + "%"
            }else{
                result = (((b1*10+b2)*b3) ).toString()
                txresultado.text = result + "Ω" + "±" + b4 + "%"
            }
        }

        btgris3.setOnClickListener {
            txbarra3.setBackgroundColor(getResources().getColor((R.color.gray)))
            b3 = 100000000F
            if ((b1*10+b2)*b3 >= 1000000000) {
                result = (((b1 * 10 + b2) * b3 / 1000000000) ).toString()
                txresultado.text = result + "G" + "Ω" + "±" + b4 + "%"
            }else if((b1*10+b2)*b3 >= 1000000){
                result = (((b1*10+b2)*b3/1000000) ).toString()
                txresultado.text = result + "M" + "Ω" + "±" + b4 + "%"
            }else if ((b1*10+b2)*b3 >= 1000){
                result = (((b1*10+b2)*b3/1000) ).toString()
                txresultado.text = result + "K" + "Ω" + "±" + b4 + "%"
            }else{
                result = (((b1*10+b2)*b3) ).toString()
                txresultado.text = result + "Ω" + "±" + b4 + "%"
            }
        }

        btgris4.setOnClickListener {
            txbarra4.setBackgroundColor(getResources().getColor((R.color.gray)))
            b4 = 0.05F
            if ((b1*10+b2)*b3 >= 1000000000) {
                result = (((b1 * 10 + b2) * b3 / 1000000000) ).toString()
                txresultado.text = result + "G" + "Ω" + "±" + b4 + "%"
            }else if((b1*10+b2)*b3 >= 1000000){
                result = (((b1*10+b2)*b3/1000000) ).toString()
                txresultado.text = result + "M" + "Ω" + "±" + b4 + "%"
            }else if ((b1*10+b2)*b3 >= 1000){
                result = (((b1*10+b2)*b3/1000) ).toString()
                txresultado.text = result + "K" + "Ω" + "±" + b4 + "%"
            }else{
                result = (((b1*10+b2)*b3) ).toString()
                txresultado.text = result + "Ω" + "±" + b4 + "%"
            }
        }

        btblanco1.setOnClickListener {
            txbarra1.setBackgroundColor(getResources().getColor((R.color.whitesmoke)))
            b1 = 9
            if ((b1*10+b2)*b3 >= 1000000000) {
                result = (((b1 * 10 + b2) * b3 / 1000000000) ).toString()
                txresultado.text = result + "G" + "Ω" + "±" + b4 + "%"
            }else if((b1*10+b2)*b3 >= 1000000){
                result = (((b1*10+b2)*b3/1000000) ).toString()
                txresultado.text = result + "M" + "Ω" + "±" + b4 + "%"
            }else if ((b1*10+b2)*b3 >= 1000){
                result = (((b1*10+b2)*b3/1000) ).toString()
                txresultado.text = result + "K" + "Ω" + "±" + b4 + "%"
            }else{
                result = (((b1*10+b2)*b3) ).toString()
                txresultado.text = result + "Ω" + "±" + b4 + "%"
            }
        }

        btblanco2.setOnClickListener {
            txbarra2.setBackgroundColor(getResources().getColor((R.color.whitesmoke)))
            b2 = 9
            if ((b1*10+b2)*b3 >= 1000000000) {
                result = (((b1 * 10 + b2) * b3 / 1000000000) ).toString()
                txresultado.text = result + "G" + "Ω" + "±" + b4 + "%"
            }else if((b1*10+b2)*b3 >= 1000000){
                result = (((b1*10+b2)*b3/1000000) ).toString()
                txresultado.text = result + "M" + "Ω" + "±" + b4 + "%"
            }else if ((b1*10+b2)*b3 >= 1000){
                result = (((b1*10+b2)*b3/1000) ).toString()
                txresultado.text = result + "K" + "Ω" + "±" + b4 + "%"
            }else{
                result = (((b1*10+b2)*b3) ).toString()
                txresultado.text = result + "Ω" + "±" + b4 + "%"
            }
        }

        btblanco3.setOnClickListener {
            txbarra3.setBackgroundColor(getResources().getColor((R.color.whitesmoke)))
            b3 = 1000000000F
            if ((b1*10+b2)*b3 >= 1000000000) {
                result = (((b1 * 10 + b2) * b3 / 1000000000) ).toString()
                txresultado.text = result + "G" + "Ω" + "±" + b4 + "%"
            }else if((b1*10+b2)*b3 >= 1000000){
                result = (((b1*10+b2)*b3/1000000) ).toString()
                txresultado.text = result + "M" + "Ω" + "±" + b4 + "%"
            }else if ((b1*10+b2)*b3 >= 1000){
                result = (((b1*10+b2)*b3/1000) ).toString()
                txresultado.text = result + "K" + "Ω" + "±" + b4 + "%"
            }else{
                result = (((b1*10+b2)*b3) ).toString()
                txresultado.text = result + "Ω" + "±" + b4 + "%"
            }
        }

        btdorado3.setOnClickListener {
            txbarra3.setBackgroundColor(getResources().getColor((R.color.goldenrod)))
            b3 = 0.1F
            if ((b1*10+b2)*b3 >= 1000000000) {
                result = (((b1 * 10 + b2) * b3 / 1000000000) ).toString()
                txresultado.text = result + "G" + "Ω" + "±" + b4 + "%"
            }else if((b1*10+b2)*b3 >= 1000000){
                result = (((b1*10+b2)*b3/1000000) ).toString()
                txresultado.text = result + "M" + "Ω" + "±" + b4 + "%"
            }else if ((b1*10+b2)*b3 >= 1000){
                result = (((b1*10+b2)*b3/1000) ).toString()
                txresultado.text = result + "K" + "Ω" + "±" + b4 + "%"
            }else{
                result = (((b1*10+b2)*b3) ).toString()
                txresultado.text = result + "Ω" + "±" + b4 + "%"
            }
        }

        btdorado4.setOnClickListener {
            txbarra4.setBackgroundColor(getResources().getColor((R.color.goldenrod)))
            b4 = 5.0F
            if ((b1*10+b2)*b3 >= 1000000000) {
                result = (((b1 * 10 + b2) * b3 / 1000000000) ).toString()
                txresultado.text = result + "G" + "Ω" + "±" + b4 + "%"
            }else if((b1*10+b2)*b3 >= 1000000){
                result = (((b1*10+b2)*b3/1000000) ).toString()
                txresultado.text = result + "M" + "Ω" + "±" + b4 + "%"
            }else if ((b1*10+b2)*b3 >= 1000){
                result = (((b1*10+b2)*b3/1000) ).toString()
                txresultado.text = result + "K" + "Ω" + "±" + b4 + "%"
            }else{
                result = (((b1*10+b2)*b3) ).toString()
                txresultado.text = result + "Ω" + "±" + b4 + "%"
            }
        }

        btplateado3.setOnClickListener {
            txbarra3.setBackgroundColor(getResources().getColor((R.color.silver)))
            b3 = 0.01F
            if ((b1*10+b2)*b3 >= 1000000000) {
                result = (((b1 * 10 + b2) * b3 / 1000000000) ).toString()
                txresultado.text = result + "G" + "Ω" + "±" + b4 + "%"
            }else if((b1*10+b2)*b3 >= 1000000){
                result = (((b1*10+b2)*b3/1000000) ).toString()
                txresultado.text = result + "M" + "Ω" + "±" + b4 + "%"
            }else if ((b1*10+b2)*b3 >= 1000){
                result = (((b1*10+b2)*b3/1000) ).toString()
                txresultado.text = result + "K" + "Ω" + "±" + b4 + "%"
            }else{
                result = (((b1*10+b2)*b3) ).toString()
                txresultado.text = result + "Ω" + "±" + b4 + "%"
            }
        }

        btplateado4.setOnClickListener {
            txbarra4.setBackgroundColor(getResources().getColor((R.color.silver)))
            b4 = 10.0F
            if ((b1*10+b2)*b3 >= 1000000000) {
                result = (((b1 * 10 + b2) * b3 / 1000000000) ).toString()
                txresultado.text = result + "G" + "Ω" + "±" + b4 + "%"
            }else if((b1*10+b2)*b3 >= 1000000){
                result = (((b1*10+b2)*b3/1000000) ).toString()
                txresultado.text = result + "M" + "Ω" + "±" + b4 + "%"
            }else if ((b1*10+b2)*b3 >= 1000){
                result = (((b1*10+b2)*b3/1000) ).toString()
                txresultado.text = result + "K" + "Ω" + "±" + b4 + "%"
            }else{
                result = (((b1*10+b2)*b3) ).toString()
                txresultado.text = result + "Ω" + "±" + b4 + "%"
            }
        }
    }

//    fun Text
//    override fun onSaveInstanceState(outState: Bundle?) {
//        outState?.run {
//            putInt(COLOR1_KEY?, colorb1)
//
//        }
//        // call superclass to save any view hierarchy
//        super.onSaveInstanceState(outState)
//    }


}
