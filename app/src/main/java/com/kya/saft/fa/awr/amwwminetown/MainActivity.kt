package com.kya.saft.fa.awr.amwwminetown

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.PorterDuff
import android.os.Bundle
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import androidx.appcompat.app.AppCompatActivity
import com.kya.saft.fa.awr.amwwminetown.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceAsColor")
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val st = 1
        val end = 5
        var newbet = 0
        var bal = 10000
        binding.apply {

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
                withdraw.setEnabled(false)
                withdraw.visibility = INVISIBLE
            }

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

                img11.visibility = INVISIBLE
                img12.visibility = INVISIBLE
                img13.visibility = INVISIBLE
                img14.visibility = INVISIBLE
                img15.visibility = INVISIBLE
                img21.visibility = INVISIBLE
                img22.visibility = INVISIBLE
                img23.visibility = INVISIBLE
                img24.visibility = INVISIBLE
                img25.visibility = INVISIBLE
                img31.visibility = INVISIBLE
                img32.visibility = INVISIBLE
                img33.visibility = INVISIBLE
                img34.visibility = INVISIBLE
                img35.visibility = INVISIBLE
                img41.visibility = INVISIBLE
                img42.visibility = INVISIBLE
                img43.visibility = INVISIBLE
                img44.visibility = INVISIBLE
                img45.visibility = INVISIBLE

                btn11.visibility = VISIBLE
                btn12.visibility = VISIBLE
                btn13.visibility = VISIBLE
                btn14.visibility = VISIBLE
                btn15.visibility = VISIBLE
                btn21.visibility = VISIBLE
                btn22.visibility = VISIBLE
                btn23.visibility = VISIBLE
                btn24.visibility = VISIBLE
                btn25.visibility = VISIBLE
                btn31.visibility = VISIBLE
                btn32.visibility = VISIBLE
                btn33.visibility = VISIBLE
                btn34.visibility = VISIBLE
                btn35.visibility = VISIBLE
                btn41.visibility = VISIBLE
                btn42.visibility = VISIBLE
                btn43.visibility = VISIBLE
                btn44.visibility = VISIBLE
                btn45.visibility = VISIBLE


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


                bet.setEnabled(false)
                withdraw.visibility = VISIBLE
                withdraw.setEnabled(true)
            }

            fun lineActive(winOrLose:String,line:Int){
                withdraw.visibility = VISIBLE
                withdraw.setEnabled(true)
                when(line){
                    1 -> {
                        if (winOrLose == "win"){
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

                        } else if(winOrLose == "lose"){
                            btn11.setEnabled(false)
                            btn12.setEnabled(false)
                            btn13.setEnabled(false)
                            btn14.setEnabled(false)
                            btn15.setEnabled(false)
                            bet.text = null
                            start.setEnabled(true)
                            newbet = 0
                            withdraw.visibility = VISIBLE
                            withdraw.setEnabled(true)
                        }
                    }
                    2 -> {
                        if (winOrLose == "win"){
                            btn21.setEnabled(false)
                            btn22.setEnabled(false)
                            btn23.setEnabled(false)
                            btn24.setEnabled(false)
                            btn25.setEnabled(false)
                            btn31.setEnabled(true)
                            btn32.setEnabled(true)
                            btn33.setEnabled(true)
                            btn34.setEnabled(true)
                            btn35.setEnabled(true)
                            newbet = (newbet * 1.5).toInt()
                            bet.setText("$newbet")

                        } else if(winOrLose == "lose"){
                            btn21.setEnabled(false)
                            btn22.setEnabled(false)
                            btn23.setEnabled(false)
                            btn24.setEnabled(false)
                            btn25.setEnabled(false)
                            bet.text = null
                            start.setEnabled(true)
                            newbet = 0
                            withdraw.visibility = VISIBLE
                            withdraw.setEnabled(true)

                        }
                    }
                    3 -> {
                        if (winOrLose == "win"){
                            btn31.setEnabled(false)
                            btn32.setEnabled(false)
                            btn33.setEnabled(false)
                            btn34.setEnabled(false)
                            btn35.setEnabled(false)
                            btn41.setEnabled(true)
                            btn42.setEnabled(true)
                            btn43.setEnabled(true)
                            btn44.setEnabled(true)
                            btn45.setEnabled(true)
                            newbet = (newbet * 2.5).toInt()
                            bet.setText("$newbet")

                        } else if(winOrLose == "lose"){
                            btn31.setEnabled(false)
                            btn32.setEnabled(false)
                            btn33.setEnabled(false)
                            btn34.setEnabled(false)
                            btn35.setEnabled(false)
                            bet.text = null
                            start.setEnabled(true)
                            newbet = 0
                            withdraw.setEnabled(true)
                            withdraw.visibility = VISIBLE

                        }

                    }
                    4 -> {
                        if (winOrLose == "win"){
                            btn41.setEnabled(false)
                            btn42.setEnabled(false)
                            btn43.setEnabled(false)
                            btn44.setEnabled(false)
                            btn45.setEnabled(false)
                            newbet = (newbet * 4)
                            bet.setText("$newbet")

                        } else if(winOrLose == "lose"){
                            btn41.setEnabled(false)
                            btn42.setEnabled(false)
                            btn43.setEnabled(false)
                            btn44.setEnabled(false)
                            btn45.setEnabled(false)
                            bet.text = null
                            start.setEnabled(true)
                            newbet = 0
                            withdraw.visibility = VISIBLE
                            withdraw.setEnabled(true)

                        }
                    }
                }

            }


            start.setOnClickListener {
                if (!(bet.getText().toString().equals("")) && bet.text.toString().toInt() != 0) {
                    newbet = bet.text.toString().toInt()
                    if (newbet <= bal) {
                        start()
                        start.apply {
                            setEnabled(false)
                            visibility = INVISIBLE
                        }
                        bal -= newbet
                        balance.text = ("Balance: $bal")
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
                bal = newbet + bal
                balance.text = "Balance: $bal"
                lose()
                start.setEnabled(true)
                start.visibility = VISIBLE
                bet.text = null
                bet.setEnabled(true)
            }

            btn11.setOnClickListener {
                if (rand(st, end) != 1) {
                    lineActive("win",1)
                    btn11.getBackground()
                        .setColorFilter(Color.parseColor("#21DA03"), PorterDuff.Mode.MULTIPLY)

                } else {
                    lineActive("lose",1)

                    btn11.visibility = INVISIBLE
                    img11.visibility = VISIBLE
                }
            }
            btn12.setOnClickListener {
                if (rand(st, end) != 1) {
                    lineActive("win",1)
                    btn12.getBackground()
                        .setColorFilter(Color.parseColor("#21DA03"), PorterDuff.Mode.MULTIPLY)

                } else {
                    lineActive("lose",1)

                    btn12.visibility = INVISIBLE
                    img12.visibility = VISIBLE
                }
            }
            btn13.setOnClickListener {
                if (rand(st, end) != 1) {
                    lineActive("win",1)

                    btn13.getBackground()
                        .setColorFilter(Color.parseColor("#21DA03"), PorterDuff.Mode.MULTIPLY)

                } else {
                    lineActive("lose",1)

                    btn13.visibility = INVISIBLE
                    img13.visibility = VISIBLE
                }
            }
            btn14.setOnClickListener {
                if (rand(st, end) != 1) {

                    lineActive("win",1)

                    btn14.getBackground()
                        .setColorFilter(Color.parseColor("#21DA03"), PorterDuff.Mode.MULTIPLY)

                } else {

                    lineActive("lose",1)

                    btn14.visibility = INVISIBLE
                    img14.visibility = VISIBLE
                }
            }
            btn15.setOnClickListener {
                if (rand(st, end) != 1) {

                    lineActive("win",1)

                    btn15.getBackground()
                        .setColorFilter(Color.parseColor("#21DA03"), PorterDuff.Mode.MULTIPLY)

                } else {
                    lineActive("lose",1)

                    btn15.visibility = INVISIBLE
                    img15.visibility = VISIBLE
                }
            }
            btn21.setOnClickListener {
                if (rand(st, end) != 1 && rand(st, end) != 2) {
                    lineActive("win",2)

                    btn21.getBackground()
                        .setColorFilter(Color.parseColor("#21DA03"), PorterDuff.Mode.MULTIPLY)


                } else {
                    lineActive("lose",2)


                    btn21.visibility = INVISIBLE
                    img21.visibility = VISIBLE
                }
            }
            btn22.setOnClickListener {
                if (rand(st, end) != 1 && rand(st, end) != 2) {
                    lineActive("win",2)

                    btn22.getBackground()
                        .setColorFilter(Color.parseColor("#21DA03"), PorterDuff.Mode.MULTIPLY)


                } else {
                    lineActive("lose",2)


                    btn22.visibility = INVISIBLE
                    img22.visibility = VISIBLE
                }
            }
            btn23.setOnClickListener {
                if (rand(st, end) != 1 && rand(st, end) != 2) {
                    lineActive("win",2)

                    btn23.getBackground()
                        .setColorFilter(Color.parseColor("#21DA03"), PorterDuff.Mode.MULTIPLY)


                } else {
                    lineActive("lose",2)


                    btn23.visibility = INVISIBLE
                    img23.visibility = VISIBLE
                }
            }
            btn24.setOnClickListener {
                if (rand(st, end) != 1 && rand(st, end) != 2) {
                    lineActive("win",2)

                    btn24.getBackground()
                        .setColorFilter(Color.parseColor("#21DA03"), PorterDuff.Mode.MULTIPLY)


                } else {
                    lineActive("lose",2)


                    btn24.visibility = INVISIBLE
                    img24.visibility = VISIBLE
                }
            }
            btn25.setOnClickListener {
                if (rand(st, end) != 1 && rand(st, end) != 2) {
                    lineActive("win",2)

                    btn25.getBackground()
                        .setColorFilter(Color.parseColor("#21DA03"), PorterDuff.Mode.MULTIPLY)


                } else {
                    lineActive("lose",2)


                    btn25.visibility = INVISIBLE
                    img25.visibility = VISIBLE
                }
            }
            btn31.setOnClickListener {
                if (rand(st, end) != 1 && rand(st, end) != 2 && rand(st, end) != 3) {
                    lineActive("win", 3)

                    btn31.getBackground()
                        .setColorFilter(Color.parseColor("#21DA03"), PorterDuff.Mode.MULTIPLY)
                } else {
                    lineActive("lose", 3)

                    btn31.visibility = INVISIBLE
                    img31.visibility = VISIBLE
                }
            }
            btn32.setOnClickListener {
                if (rand(st, end) != 1 && rand(st, end) != 2 && rand(st, end) != 3) {
                    lineActive("win", 3)

                    btn32.getBackground()
                        .setColorFilter(Color.parseColor("#21DA03"), PorterDuff.Mode.MULTIPLY)
                } else {
                    lineActive("lose", 3)

                    btn32.visibility = INVISIBLE
                    img32.visibility = VISIBLE
                }
            }
            btn33.setOnClickListener {
                if (rand(st, end) != 1 && rand(st, end) != 2 && rand(st, end) != 3) {
                    lineActive("win", 3)

                    btn33.getBackground()
                        .setColorFilter(Color.parseColor("#21DA03"), PorterDuff.Mode.MULTIPLY)
                } else {
                    lineActive("lose", 3)

                    btn33.visibility = INVISIBLE
                    img33.visibility = VISIBLE
                }
            }
            btn34.setOnClickListener {
                if (rand(st, end) != 1 && rand(st, end) != 2 && rand(st, end) != 3) {
                    lineActive("win", 3)

                    btn34.getBackground()
                        .setColorFilter(Color.parseColor("#21DA03"), PorterDuff.Mode.MULTIPLY)
                } else {
                    lineActive("lose", 3)

                    btn34.visibility = INVISIBLE
                    img34.visibility = VISIBLE
                }
            }
            btn35.setOnClickListener {
                if (rand(st, end) != 1 && rand(st, end) != 2 && rand(st, end) != 3) {
                    lineActive("win", 3)

                    btn35.getBackground()
                        .setColorFilter(Color.parseColor("#21DA03"), PorterDuff.Mode.MULTIPLY)
                } else {
                    lineActive("lose", 3)

                    btn35.visibility = INVISIBLE
                    img35.visibility = VISIBLE
                }
            }
            btn41.setOnClickListener {
                if (rand(st, end) != 1 && rand(st, end) != 2 && rand(st, end) != 3 && rand(
                        st,
                        end
                    ) != 4
                ) {
                    lineActive("win", 4)

                    btn41.getBackground()
                        .setColorFilter(Color.parseColor("#21DA03"), PorterDuff.Mode.MULTIPLY)

                } else {
                    lineActive("lose", 4)

                    btn41.visibility = INVISIBLE
                    img41.visibility = VISIBLE
                }
            }
            btn42.setOnClickListener {
                if (rand(st, end) != 1 && rand(st, end) != 2 && rand(st, end) != 3 && rand(
                        st,
                        end
                    ) != 4
                ) {
                    lineActive("win", 4)

                    btn42.getBackground()
                        .setColorFilter(Color.parseColor("#21DA03"), PorterDuff.Mode.MULTIPLY)

                } else {
                    lineActive("lose", 4)

                    btn42.visibility = INVISIBLE
                    img42.visibility = VISIBLE
                }
            }
            btn43.setOnClickListener {
                if (rand(st, end) != 1 && rand(st, end) != 2 && rand(st, end) != 3 && rand(
                        st,
                        end
                    ) != 4
                ) {
                    lineActive("win", 4)

                    btn43.getBackground()
                        .setColorFilter(Color.parseColor("#21DA03"), PorterDuff.Mode.MULTIPLY)

                } else {
                    lineActive("lose", 4)

                    btn43.visibility = INVISIBLE
                    img43.visibility = VISIBLE
                }
            }
            btn44.setOnClickListener {
                if (rand(st, end) != 1 && rand(st, end) != 2 && rand(st, end) != 3 && rand(
                        st,
                        end
                    ) != 4
                ) {
                    lineActive("win", 4)

                    btn44.getBackground()
                        .setColorFilter(Color.parseColor("#21DA03"), PorterDuff.Mode.MULTIPLY)

                } else {
                    lineActive("lose", 4)

                    btn44.visibility = INVISIBLE
                    img44.visibility = VISIBLE
                }
            }
            btn45.setOnClickListener {
                if (rand(st, end) != 1 && rand(st, end) != 2 && rand(st, end) != 3 && rand(
                        st,
                        end
                    ) != 4
                ) {
                    lineActive("win", 4)

                    btn45.getBackground()
                        .setColorFilter(Color.parseColor("#21DA03"), PorterDuff.Mode.MULTIPLY)

                } else {
                    lineActive("lose", 4)

                    btn45.visibility = INVISIBLE
                    img45.visibility = VISIBLE
                }
            }
        }


    }
}



