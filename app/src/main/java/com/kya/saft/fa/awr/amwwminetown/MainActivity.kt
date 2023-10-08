package com.kya.saft.fa.awr.amwwminetown

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.PorterDuff
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val st = 1
        val end = 5
        var bal = 10000
        var newbet = 0
        var flag = false


        var img11 = findViewById<ImageView>(R.id.img11)
        var img12 = findViewById<ImageView>(R.id.img12)
        var img13 = findViewById<ImageView>(R.id.img13)
        var img14 = findViewById<ImageView>(R.id.img14)
        var img15 = findViewById<ImageView>(R.id.img15)
        var img21 = findViewById<ImageView>(R.id.img21)
        var img22 = findViewById<ImageView>(R.id.img22)
        var img23 = findViewById<ImageView>(R.id.img23)
        var img24 = findViewById<ImageView>(R.id.img24)
        var img25 = findViewById<ImageView>(R.id.img25)
        var img31 = findViewById<ImageView>(R.id.img31)
        var img32 = findViewById<ImageView>(R.id.img32)
        var img33 = findViewById<ImageView>(R.id.img33)
        var img34 = findViewById<ImageView>(R.id.img34)
        var img35 = findViewById<ImageView>(R.id.img35)
        var img41 = findViewById<ImageView>(R.id.img41)
        var img42 = findViewById<ImageView>(R.id.img42)
        var img43 = findViewById<ImageView>(R.id.img43)
        var img44 = findViewById<ImageView>(R.id.img44)
        var img45 = findViewById<ImageView>(R.id.img45)


        val btn11 = findViewById<Button>(R.id.btn11)
        val btn12 = findViewById<Button>(R.id.btn12)
        val btn13 = findViewById<Button>(R.id.btn13)
        val btn14 = findViewById<Button>(R.id.btn14)
        val btn15 = findViewById<Button>(R.id.btn15)

        val btn21 = findViewById<Button>(R.id.btn21)
        val btn22 = findViewById<Button>(R.id.btn22)
        val btn23 = findViewById<Button>(R.id.btn23)
        val btn24 = findViewById<Button>(R.id.btn24)
        val btn25 = findViewById<Button>(R.id.btn25)

        val btn31 = findViewById<Button>(R.id.btn31)
        val btn32 = findViewById<Button>(R.id.btn32)
        val btn33 = findViewById<Button>(R.id.btn33)
        val btn34 = findViewById<Button>(R.id.btn34)
        val btn35 = findViewById<Button>(R.id.btn35)

        val btn41 = findViewById<Button>(R.id.btn41)
        val btn42 = findViewById<Button>(R.id.btn42)
        val btn43 = findViewById<Button>(R.id.btn43)
        val btn44 = findViewById<Button>(R.id.btn44)
        val btn45 = findViewById<Button>(R.id.btn45)

        val start = findViewById<Button>(R.id.start)
        val balance = findViewById<TextView>(R.id.balance)
        val withdraw = findViewById<Button>(R.id.withdraw)
        val bet = findViewById<EditText>(R.id.bet)

        withdraw.alpha = 0.0F
        withdraw.setEnabled(false)

        fun lose() {
            btn11.setEnabled(false)
            btn12.setEnabled(false)
            btn13.setEnabled(false)
            btn14.setEnabled(false)
            btn15.setEnabled(false)
            btn21.setEnabled(false)
            btn22.setEnabled(false)
            btn23.setEnabled(false)
            btn24.setEnabled(false)
            btn25.setEnabled(false)
            btn31.setEnabled(false)
            btn32.setEnabled(false)
            btn33.setEnabled(false)
            btn34.setEnabled(false)
            btn35.setEnabled(false)
            btn41.setEnabled(false)
            btn42.setEnabled(false)
            btn43.setEnabled(false)
            btn44.setEnabled(false)
            btn45.setEnabled(false)
        }
        lose()

        balance.text = "Balance: $bal"
        fun start() {
            btn11.setEnabled(true)
            btn12.setEnabled(true)
            btn13.setEnabled(true)
            btn14.setEnabled(true)
            btn15.setEnabled(true)

            btn21.setEnabled(false)
            btn22.setEnabled(false)
            btn23.setEnabled(false)
            btn24.setEnabled(false)
            btn25.setEnabled(false)
            btn31.setEnabled(false)
            btn32.setEnabled(false)
            btn33.setEnabled(false)
            btn34.setEnabled(false)
            btn35.setEnabled(false)
            btn41.setEnabled(false)
            btn42.setEnabled(false)
            btn43.setEnabled(false)
            btn44.setEnabled(false)
            btn45.setEnabled(false)



            flag = true

            btn11.text = "x1.2"
            btn12.text = "x1.2"
            btn13.text = "x1.2"
            btn14.text = "x1.2"
            btn15.text = "x1.2"

            btn21.text = "x1.5"
            btn22.text = "x1.5"
            btn23.text = "x1.5"
            btn24.text = "x1.5"
            btn25.text = "x1.5"

            btn31.text = "x2.5"
            btn32.text = "x2.5"
            btn33.text = "x2.5"
            btn34.text = "x2.5"
            btn35.text = "x2.5"

            btn41.text = "x4.0"
            btn42.text = "x4.0"
            btn43.text = "x4.0"
            btn44.text = "x4.0"
            btn45.text = "x4.0"


            btn11.getBackground()
                .setColorFilter(Color.parseColor("#FFF500"), PorterDuff.Mode.MULTIPLY)
            btn12.getBackground()
                .setColorFilter(Color.parseColor("#FFF500"), PorterDuff.Mode.MULTIPLY)
            btn13.getBackground()
                .setColorFilter(Color.parseColor("#FFF500"), PorterDuff.Mode.MULTIPLY)
            btn14.getBackground()
                .setColorFilter(Color.parseColor("#FFF500"), PorterDuff.Mode.MULTIPLY)
            btn15.getBackground()
                .setColorFilter(Color.parseColor("#FFF500"), PorterDuff.Mode.MULTIPLY)

            btn21.getBackground()
                .setColorFilter(Color.parseColor("#FFC700"), PorterDuff.Mode.MULTIPLY)
            btn22.getBackground()
                .setColorFilter(Color.parseColor("#FFC700"), PorterDuff.Mode.MULTIPLY)
            btn23.getBackground()
                .setColorFilter(Color.parseColor("#FFC700"), PorterDuff.Mode.MULTIPLY)
            btn24.getBackground()
                .setColorFilter(Color.parseColor("#FFC700"), PorterDuff.Mode.MULTIPLY)
            btn25.getBackground()
                .setColorFilter(Color.parseColor("#FFC700"), PorterDuff.Mode.MULTIPLY)

            btn31.getBackground()
                .setColorFilter(Color.parseColor("#FF8A00"), PorterDuff.Mode.MULTIPLY)
            btn32.getBackground()
                .setColorFilter(Color.parseColor("#FF8A00"), PorterDuff.Mode.MULTIPLY)
            btn33.getBackground()
                .setColorFilter(Color.parseColor("#FF8A00"), PorterDuff.Mode.MULTIPLY)
            btn34.getBackground()
                .setColorFilter(Color.parseColor("#FF8A00"), PorterDuff.Mode.MULTIPLY)
            btn35.getBackground()
                .setColorFilter(Color.parseColor("#FF8A00"), PorterDuff.Mode.MULTIPLY)

            btn41.getBackground()
                .setColorFilter(Color.parseColor("#FF4D00"), PorterDuff.Mode.MULTIPLY)
            btn42.getBackground()
                .setColorFilter(Color.parseColor("#FF4D00"), PorterDuff.Mode.MULTIPLY)
            btn43.getBackground()
                .setColorFilter(Color.parseColor("#FF4D00"), PorterDuff.Mode.MULTIPLY)
            btn44.getBackground()
                .setColorFilter(Color.parseColor("#FF4D00"), PorterDuff.Mode.MULTIPLY)
            btn45.getBackground()
                .setColorFilter(Color.parseColor("#FF4D00"), PorterDuff.Mode.MULTIPLY)



            withdraw.alpha = 1.0F
            withdraw.setEnabled(true)
        }


        var qwe: String

        start.setOnClickListener {
            if (bet.length() > 0) {
                qwe = bet.text.toString()
                newbet = qwe.toInt()
                if (newbet <= bal) {
                    start()
                    start.setEnabled(false)
                    bal -= newbet
                    balance.text = ("Balance: $bal")

                    img11.alpha = 0.0F
                    img12.alpha = 0.0F
                    img13.alpha = 0.0F
                    img14.alpha = 0.0F
                    img15.alpha = 0.0F
                    img21.alpha = 0.0F
                    img22.alpha = 0.0F
                    img23.alpha = 0.0F
                    img24.alpha = 0.0F
                    img25.alpha = 0.0F
                    img31.alpha = 0.0F
                    img32.alpha = 0.0F
                    img33.alpha = 0.0F
                    img34.alpha = 0.0F
                    img35.alpha = 0.0F
                    img41.alpha = 0.0F
                    img42.alpha = 0.0F
                    img43.alpha = 0.0F
                    img44.alpha = 0.0F
                    img45.alpha = 0.0F

                    btn11.alpha = 1.0F
                    btn12.alpha = 1.0F
                    btn13.alpha = 1.0F
                    btn14.alpha = 1.0F
                    btn15.alpha = 1.0F
                    btn21.alpha = 1.0F
                    btn22.alpha = 1.0F
                    btn23.alpha = 1.0F
                    btn24.alpha = 1.0F
                    btn25.alpha = 1.0F
                    btn31.alpha = 1.0F
                    btn32.alpha = 1.0F
                    btn33.alpha = 1.0F
                    btn34.alpha = 1.0F
                    btn35.alpha = 1.0F
                    btn41.alpha = 1.0F
                    btn42.alpha = 1.0F
                    btn43.alpha = 1.0F
                    btn44.alpha = 1.0F
                    btn45.alpha = 1.0F

                } else {
                    bet.hint = "Your balance is too low"
                }
            } else {
                bet.hint = "Place your bet"
            }
        }

        fun rand(st: Int, end: Int): Int {
            require(st <= end) { "Illegal Argument" }
            val rand = Random(System.nanoTime())
            return (st..end).random(rand)
        }
        withdraw.setOnClickListener {
            if (flag == true) {
                bal = newbet + bal
                balance.text = "Balance: $bal"
                flag = false
                lose()
                start.setEnabled(true)
                bet.setText("")

                withdraw.alpha = 0.0F
                withdraw.setEnabled(false)
            }
        }



        btn11.setOnClickListener {
            if (rand(st, end) != 1) {
                btn11.setEnabled(false)
                btn12.setEnabled(false)
                btn13.setEnabled(false)
                btn14.setEnabled(false)
                btn15.setEnabled(false)
                btn11.getBackground()
                    .setColorFilter(Color.parseColor("#21DA03"), PorterDuff.Mode.MULTIPLY)
                btn21.setEnabled(true)
                btn22.setEnabled(true)
                btn23.setEnabled(true)
                btn24.setEnabled(true)
                btn25.setEnabled(true)

                newbet = (newbet * 1.2).toInt()
                bet.setText("$newbet")

            } else {
                btn11.setEnabled(false)
                btn12.setEnabled(false)
                btn13.setEnabled(false)
                btn14.setEnabled(false)
                btn15.setEnabled(false)
                bet.text = null
                start.setEnabled(true)
                newbet = 0
                flag = false
                withdraw.alpha = 0.0F
                btn11.alpha = 0.0F
                img11.alpha = 1.0F
                withdraw.setEnabled(false)
            }
        }
        btn12.setOnClickListener {
            if (rand(st, end) != 1) {
                btn11.setEnabled(false)
                btn12.setEnabled(false)
                btn13.setEnabled(false)
                btn14.setEnabled(false)
                btn15.setEnabled(false)
                btn12.getBackground()
                    .setColorFilter(Color.parseColor("#21DA03"), PorterDuff.Mode.MULTIPLY)
                btn21.setEnabled(true)
                btn22.setEnabled(true)
                btn23.setEnabled(true)
                btn24.setEnabled(true)
                btn25.setEnabled(true)

                newbet = (newbet * 1.2).toInt()
                bet.setText("$newbet")

            } else {
                btn11.setEnabled(false)
                btn12.setEnabled(false)
                btn13.setEnabled(false)
                btn14.setEnabled(false)
                btn15.setEnabled(false)
                bet.text = null
                start.setEnabled(true)
                newbet = 0
                flag = false
                withdraw.alpha = 0.0F
                btn12.alpha = 0.0F
                img12.alpha = 1.0F
                withdraw.setEnabled(false)
            }
        }
        btn13.setOnClickListener {
            if (rand(st, end) != 1) {
                btn13.getBackground()
                    .setColorFilter(Color.parseColor("#21DA03"), PorterDuff.Mode.MULTIPLY)
                btn11.setEnabled(false)
                btn12.setEnabled(false)
                btn13.setEnabled(false)
                btn14.setEnabled(false)
                btn15.setEnabled(false)
                btn21.setEnabled(true)
                btn22.setEnabled(true)
                btn23.setEnabled(true)
                btn24.setEnabled(true)
                btn25.setEnabled(true)

                newbet = (newbet * 1.2).toInt()
                bet.setText("$newbet")

            } else {
                btn11.setEnabled(false)
                btn12.setEnabled(false)
                btn13.setEnabled(false)
                btn14.setEnabled(false)
                btn15.setEnabled(false)
                bet.text = null
                start.setEnabled(true)
                newbet = 0
                flag = false
                withdraw.alpha = 0.0F
                btn13.alpha = 0.0F
                img13.alpha = 1.0F
                withdraw.setEnabled(false)
            }
        }
        btn14.setOnClickListener {
            if (rand(st, end) != 1) {
                btn11.setEnabled(false)
                btn12.setEnabled(false)
                btn13.setEnabled(false)
                btn14.setEnabled(false)
                btn15.setEnabled(false)
                btn14.getBackground()
                    .setColorFilter(Color.parseColor("#21DA03"), PorterDuff.Mode.MULTIPLY)
                btn21.setEnabled(true)
                btn22.setEnabled(true)
                btn23.setEnabled(true)
                btn24.setEnabled(true)
                btn25.setEnabled(true)

                newbet = (newbet * 1.2).toInt()
                bet.setText("$newbet")

            } else {
                btn11.setEnabled(false)
                btn12.setEnabled(false)
                btn13.setEnabled(false)
                btn14.setEnabled(false)
                btn15.setEnabled(false)
                bet.text = null
                start.setEnabled(true)
                newbet = 0
                flag = false
                withdraw.alpha = 0.0F
                btn14.alpha = 0.0F
                img14.alpha = 1.0F
                withdraw.setEnabled(false)
            }
        }
        btn15.setOnClickListener {
            if (rand(st, end) != 1) {
                btn11.setEnabled(false)
                btn12.setEnabled(false)
                btn13.setEnabled(false)
                btn14.setEnabled(false)
                btn15.setEnabled(false)
                btn15.getBackground()
                    .setColorFilter(Color.parseColor("#21DA03"), PorterDuff.Mode.MULTIPLY)
                btn21.setEnabled(true)
                btn22.setEnabled(true)
                btn23.setEnabled(true)
                btn24.setEnabled(true)
                btn25.setEnabled(true)

                newbet = (newbet * 1.2).toInt()
                bet.setText("$newbet")

            } else {
                btn11.setEnabled(false)
                btn12.setEnabled(false)
                btn13.setEnabled(false)
                btn14.setEnabled(false)
                btn15.setEnabled(false)
                bet.text = null
                start.setEnabled(true)
                newbet = 0
                flag = false
                withdraw.alpha = 0.0F
                btn15.alpha = 0.0F
                img15.alpha = 1.0F
                withdraw.setEnabled(false)
            }
        }
        btn21.setOnClickListener {
            if (rand(st, end) != 1 && rand(st, end) != 2) {
                btn21.setEnabled(false)
                btn22.setEnabled(false)
                btn23.setEnabled(false)
                btn24.setEnabled(false)
                btn25.setEnabled(false)
                btn21.getBackground()
                    .setColorFilter(Color.parseColor("#21DA03"), PorterDuff.Mode.MULTIPLY)
                btn31.setEnabled(true)
                btn32.setEnabled(true)
                btn33.setEnabled(true)
                btn34.setEnabled(true)
                btn35.setEnabled(true)

                newbet = (newbet * 1.5).toInt()
                bet.setText("$newbet")

            } else {
                btn21.setEnabled(false)
                btn22.setEnabled(false)
                btn23.setEnabled(false)
                btn24.setEnabled(false)
                btn25.setEnabled(false)
                bet.text = null
                start.setEnabled(true)
                newbet = 0
                flag = false
                withdraw.alpha = 0.0F
                btn21.alpha = 0.0F
                img21.alpha = 1.0F
                withdraw.setEnabled(false)
            }
        }
        btn22.setOnClickListener {
            if (rand(st, end) != 1 && rand(st, end) != 2) {
                btn21.setEnabled(false)
                btn22.setEnabled(false)
                btn23.setEnabled(false)
                btn24.setEnabled(false)
                btn25.setEnabled(false)
                btn22.getBackground()
                    .setColorFilter(Color.parseColor("#21DA03"), PorterDuff.Mode.MULTIPLY)
                btn31.setEnabled(true)
                btn32.setEnabled(true)
                btn33.setEnabled(true)
                btn34.setEnabled(true)
                btn35.setEnabled(true)

                newbet = (newbet * 1.5).toInt()
                bet.setText("$newbet")

            } else {
                btn21.setEnabled(false)
                btn22.setEnabled(false)
                btn23.setEnabled(false)
                btn24.setEnabled(false)
                btn25.setEnabled(false)
                bet.text = null
                start.setEnabled(true)
                newbet = 0
                flag = false
                withdraw.alpha = 0.0F
                btn22.alpha = 0.0F
                img22.alpha = 1.0F
                withdraw.setEnabled(false)
            }
        }
        btn23.setOnClickListener {
            if (rand(st, end) != 1 && rand(st, end) != 2) {
                btn21.setEnabled(false)
                btn22.setEnabled(false)
                btn23.setEnabled(false)
                btn24.setEnabled(false)
                btn25.setEnabled(false)
                btn23.getBackground()
                    .setColorFilter(Color.parseColor("#21DA03"), PorterDuff.Mode.MULTIPLY)
                btn31.setEnabled(true)
                btn32.setEnabled(true)
                btn33.setEnabled(true)
                btn34.setEnabled(true)
                btn35.setEnabled(true)

                newbet = (newbet * 1.5).toInt()
                bet.setText("$newbet")

            } else {
                btn21.setEnabled(false)
                btn22.setEnabled(false)
                btn23.setEnabled(false)
                btn24.setEnabled(false)
                btn25.setEnabled(false)
                bet.text = null
                start.setEnabled(true)
                newbet = 0
                flag = false
                withdraw.alpha = 0.0F
                btn23.alpha = 0.0F
                img23.alpha = 1.0F
                withdraw.setEnabled(false)
            }
        }
        btn24.setOnClickListener {
            if (rand(st, end) != 1 && rand(st, end) != 2) {
                btn21.setEnabled(false)
                btn22.setEnabled(false)
                btn23.setEnabled(false)
                btn24.setEnabled(false)
                btn25.setEnabled(false)
                btn24.getBackground()
                    .setColorFilter(Color.parseColor("#21DA03"), PorterDuff.Mode.MULTIPLY)
                btn31.setEnabled(true)
                btn32.setEnabled(true)
                btn33.setEnabled(true)
                btn34.setEnabled(true)
                btn35.setEnabled(true)

                newbet = (newbet * 1.5).toInt()
                bet.setText("$newbet")

            } else {
                btn21.setEnabled(false)
                btn22.setEnabled(false)
                btn23.setEnabled(false)
                btn24.setEnabled(false)
                btn25.setEnabled(false)
                bet.text = null
                start.setEnabled(true)
                newbet = 0
                flag = false
                withdraw.alpha = 0.0F
                btn24.alpha = 0.0F
                img24.alpha = 1.0F
                withdraw.setEnabled(false)
            }
        }
        btn25.setOnClickListener {
            if (rand(st, end) != 1 && rand(st, end) != 2) {
                btn21.setEnabled(false)
                btn22.setEnabled(false)
                btn23.setEnabled(false)
                btn24.setEnabled(false)
                btn25.setEnabled(false)
                btn25.getBackground()
                    .setColorFilter(Color.parseColor("#21DA03"), PorterDuff.Mode.MULTIPLY)
                btn31.setEnabled(true)
                btn32.setEnabled(true)
                btn33.setEnabled(true)
                btn34.setEnabled(true)
                btn35.setEnabled(true)

                newbet = (newbet * 1.5).toInt()
                bet.setText("$newbet")

            } else {
                btn21.setEnabled(false)
                btn22.setEnabled(false)
                btn23.setEnabled(false)
                btn24.setEnabled(false)
                btn25.setEnabled(false)
                bet.text = null
                start.setEnabled(true)
                newbet = 0
                flag = false
                withdraw.alpha = 0.0F
                btn25.alpha = 0.0F
                img25.alpha = 1.0F
                withdraw.setEnabled(false)
            }
        }
        btn31.setOnClickListener {
            if (rand(st, end) != 1 && rand(st, end) != 2 && rand(st, end) != 3) {
                btn31.setEnabled(false)
                btn32.setEnabled(false)
                btn33.setEnabled(false)
                btn34.setEnabled(false)
                btn35.setEnabled(false)
                btn31.getBackground()
                    .setColorFilter(Color.parseColor("#21DA03"), PorterDuff.Mode.MULTIPLY)
                btn41.setEnabled(true)
                btn42.setEnabled(true)
                btn43.setEnabled(true)
                btn44.setEnabled(true)
                btn45.setEnabled(true)

                newbet = (newbet * 2.5).toInt()
                bet.setText("$newbet")

            } else {
                btn31.setEnabled(false)
                btn32.setEnabled(false)
                btn33.setEnabled(false)
                btn34.setEnabled(false)
                btn35.setEnabled(false)
                bet.text = null
                start.setEnabled(true)
                newbet = 0
                flag = false
                withdraw.alpha = 0.0F
                btn31.alpha = 0.0F
                img31.alpha = 1.0F
                withdraw.setEnabled(false)
            }
        }
        btn32.setOnClickListener {
            if (rand(st, end) != 1 && rand(st, end) != 2 && rand(st, end) != 3) {
                btn31.setEnabled(false)
                btn32.setEnabled(false)
                btn33.setEnabled(false)
                btn34.setEnabled(false)
                btn35.setEnabled(false)
                btn32.getBackground()
                    .setColorFilter(Color.parseColor("#21DA03"), PorterDuff.Mode.MULTIPLY)
                btn41.setEnabled(true)
                btn42.setEnabled(true)
                btn43.setEnabled(true)
                btn44.setEnabled(true)
                btn45.setEnabled(true)

                newbet = (newbet * 2.5).toInt()
                bet.setText("$newbet")

            } else {
                btn31.setEnabled(false)
                btn32.setEnabled(false)
                btn33.setEnabled(false)
                btn34.setEnabled(false)
                btn35.setEnabled(false)
                bet.text = null
                start.setEnabled(true)
                newbet = 0
                flag = false
                withdraw.alpha = 0.0F
                btn32.alpha = 0.0F
                img32.alpha = 1.0F
                withdraw.setEnabled(false)
            }
        }
        btn33.setOnClickListener {
            if (rand(st, end) != 1 && rand(st, end) != 2 && rand(st, end) != 3) {
                btn31.setEnabled(false)
                btn32.setEnabled(false)
                btn33.setEnabled(false)
                btn34.setEnabled(false)
                btn35.setEnabled(false)
                btn33.getBackground()
                    .setColorFilter(Color.parseColor("#21DA03"), PorterDuff.Mode.MULTIPLY)
                btn41.setEnabled(true)
                btn42.setEnabled(true)
                btn43.setEnabled(true)
                btn44.setEnabled(true)
                btn45.setEnabled(true)

                newbet = (newbet * 2.5).toInt()
                bet.setText("$newbet")

            } else {
                btn31.setEnabled(false)
                btn32.setEnabled(false)
                btn33.setEnabled(false)
                btn34.setEnabled(false)
                btn35.setEnabled(false)
                bet.text = null
                start.setEnabled(true)
                newbet = 0
                flag = false
                withdraw.alpha = 0.0F
                btn33.alpha = 0.0F
                img33.alpha = 1.0F
                withdraw.setEnabled(false)
            }
        }
        btn34.setOnClickListener {
            if (rand(st, end) != 1 && rand(st, end) != 2 && rand(st, end) != 3) {
                btn31.setEnabled(false)
                btn32.setEnabled(false)
                btn33.setEnabled(false)
                btn34.setEnabled(false)
                btn35.setEnabled(false)
                btn34.getBackground()
                    .setColorFilter(Color.parseColor("#21DA03"), PorterDuff.Mode.MULTIPLY)
                btn41.setEnabled(true)
                btn42.setEnabled(true)
                btn43.setEnabled(true)
                btn44.setEnabled(true)
                btn45.setEnabled(true)

                newbet = (newbet * 2.5).toInt()
                bet.setText("$newbet")

            } else {
                btn31.setEnabled(false)
                btn32.setEnabled(false)
                btn33.setEnabled(false)
                btn34.setEnabled(false)
                btn35.setEnabled(false)
                bet.text = null
                start.setEnabled(true)
                newbet = 0
                flag = false
                withdraw.alpha = 0.0F
                btn34.alpha = 0.0F
                img34.alpha = 1.0F
                withdraw.setEnabled(false)
            }
        }
        btn35.setOnClickListener {
            if (rand(st, end) != 1 && rand(st, end) != 2 && rand(st, end) != 3) {
                btn31.setEnabled(false)
                btn32.setEnabled(false)
                btn33.setEnabled(false)
                btn34.setEnabled(false)
                btn35.setEnabled(false)
                btn35.getBackground()
                    .setColorFilter(Color.parseColor("#21DA03"), PorterDuff.Mode.MULTIPLY)
                btn41.setEnabled(true)
                btn42.setEnabled(true)
                btn43.setEnabled(true)
                btn44.setEnabled(true)
                btn45.setEnabled(true)

                newbet = (newbet * 2.5).toInt()
                bet.setText("$newbet")

            } else {
                btn31.setEnabled(false)
                btn32.setEnabled(false)
                btn33.setEnabled(false)
                btn34.setEnabled(false)
                btn35.setEnabled(false)
                bet.text = null

                start.setEnabled(true)
                newbet = 0
                flag = false
                withdraw.alpha = 0.0F
                btn35.alpha = 0.0F
                img35.alpha = 1.0F
                withdraw.setEnabled(false)
            }
        }
        btn41.setOnClickListener {
            if (rand(st, end) != 1 && rand(st, end) != 2 && rand(st, end) != 3 && rand(
                    st,
                    end
                ) != 4
            ) {
                btn41.setEnabled(false)
                btn42.setEnabled(false)
                btn43.setEnabled(false)
                btn44.setEnabled(false)
                btn45.setEnabled(false)
                btn41.getBackground()
                    .setColorFilter(Color.parseColor("#21DA03"), PorterDuff.Mode.MULTIPLY)
                newbet = (newbet * 4).toInt()
                bet.setText("$newbet")

            } else {
                btn41.setEnabled(false)
                btn42.setEnabled(false)
                btn43.setEnabled(false)
                btn44.setEnabled(false)
                btn45.setEnabled(false)
                bet.text = null
                start.setEnabled(true)
                newbet = 0
                flag = false
                withdraw.alpha = 0.0F
                btn41.alpha = 0.0F
                img41.alpha = 1.0F
                withdraw.setEnabled(false)
            }
        }
        btn42.setOnClickListener {
            if (rand(st, end) != 1 && rand(st, end) != 2 && rand(st, end) != 3 && rand(
                    st,
                    end
                ) != 4
            ) {
                btn41.setEnabled(false)
                btn42.setEnabled(false)
                btn43.setEnabled(false)
                btn44.setEnabled(false)
                btn45.setEnabled(false)
                btn42.getBackground()
                    .setColorFilter(Color.parseColor("#21DA03"), PorterDuff.Mode.MULTIPLY)
                newbet = (newbet * 4).toInt()
                bet.setText("$newbet")

            } else {
                btn41.setEnabled(false)
                btn42.setEnabled(false)
                btn43.setEnabled(false)
                btn44.setEnabled(false)
                btn45.setEnabled(false)
                bet.text = null
                start.setEnabled(true)
                newbet = 0
                flag = false
                withdraw.alpha = 0.0F
                btn42.alpha = 0.0F
                img42.alpha = 1.0F
                withdraw.setEnabled(false)
            }
        }
        btn43.setOnClickListener {
            if (rand(st, end) != 1 && rand(st, end) != 2 && rand(st, end) != 3 && rand(
                    st,
                    end
                ) != 4
            ) {
                btn41.setEnabled(false)
                btn42.setEnabled(false)
                btn43.setEnabled(false)
                btn44.setEnabled(false)
                btn45.setEnabled(false)
                btn43.getBackground()
                    .setColorFilter(Color.parseColor("#21DA03"), PorterDuff.Mode.MULTIPLY)
                newbet = (newbet * 4).toInt()
                bet.setText("$newbet")

            } else {
                btn41.setEnabled(false)
                btn42.setEnabled(false)
                btn43.setEnabled(false)
                btn44.setEnabled(false)
                btn45.setEnabled(false)
                bet.text = null
                start.setEnabled(true)
                newbet = 0
                flag = false
                withdraw.alpha = 0.0F
                btn43.alpha = 0.0F
                img43.alpha = 1.0F
                withdraw.setEnabled(false)
            }
        }
        btn44.setOnClickListener {
            if (rand(st, end) != 1 && rand(st, end) != 2 && rand(st, end) != 3 && rand(
                    st,
                    end
                ) != 4
            ) {
                btn41.setEnabled(false)
                btn42.setEnabled(false)
                btn43.setEnabled(false)
                btn44.setEnabled(false)
                btn45.setEnabled(false)
                btn44.getBackground()
                    .setColorFilter(Color.parseColor("#21DA03"), PorterDuff.Mode.MULTIPLY)
                newbet = (newbet * 4).toInt()
                bet.setText("$newbet")

            } else {
                btn41.setEnabled(false)
                btn42.setEnabled(false)
                btn43.setEnabled(false)
                btn44.setEnabled(false)
                btn45.setEnabled(false)
                bet.text = null
                start.setEnabled(true)
                newbet = 0
                flag = false
                withdraw.alpha = 0.0F
                btn44.alpha = 0.0F
                img44.alpha = 1.0F
                withdraw.setEnabled(false)
            }
        }
        btn45.setOnClickListener {
            if (rand(st, end) != 1 && rand(st, end) != 2 && rand(st, end) != 3 && rand(
                    st,
                    end
                ) != 4
            ) {
                btn41.setEnabled(false)
                btn42.setEnabled(false)
                btn43.setEnabled(false)
                btn44.setEnabled(false)
                btn45.setEnabled(false)
                btn45.getBackground()
                    .setColorFilter(Color.parseColor("#21DA03"), PorterDuff.Mode.MULTIPLY)
                newbet = (newbet * 4).toInt()
                bet.setText("$newbet")

            } else {
                btn41.setEnabled(false)
                btn42.setEnabled(false)
                btn43.setEnabled(false)
                btn44.setEnabled(false)
                btn45.setEnabled(false)
                bet.text = null
                start.setEnabled(true)
                newbet = 0
                flag = false
                withdraw.alpha = 0.0F
                btn45.alpha = 0.0F
                img45.alpha = 1.0F
                withdraw.setEnabled(false)
            }
        }
    }
}



