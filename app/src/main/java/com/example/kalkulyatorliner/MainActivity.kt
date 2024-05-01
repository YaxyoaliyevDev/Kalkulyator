package com.example.kalkulyatorliner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import com.example.kalkulyatorliner.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var birinchison: String = ""
    var ikkinchison: String = ""
    var amal = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.raqam7.setOnClickListener {
            if (amal == "") {
                birinchison = birinchison + "7"
                binding.text1.text = birinchison
            } else if (amal == "+" || amal == "-" || amal == "*" || amal == "/") {
                ikkinchison = ikkinchison + 7
                binding.text1.text = ikkinchison
            }
            anim(binding.raqam7)
        }
        binding.raqam8.setOnClickListener {
            if (amal == "") {
                birinchison = birinchison + "8"
                binding.text1.text = birinchison
            } else if (amal == "+" || amal == "-" || amal == "*" || amal == "/") {
                ikkinchison = ikkinchison + 8
                binding.text1.text = ikkinchison
            }
            anim(binding.raqam8)
        }
        binding.raqam9.setOnClickListener {
            if (amal == "") {
                birinchison = birinchison + 9
                binding.text1.text = birinchison
            } else if (amal == "+" || amal == "-" || amal == "*" || amal == "/") {
                ikkinchison = ikkinchison + 9
                binding.text1.text = ikkinchison
            }
            anim(binding.raqam9)
        }
        binding.raqam4.setOnClickListener {
            if (amal == "") {
                birinchison = birinchison + 4
                binding.text1.text = birinchison
            } else if (amal == "+" || amal == "-" || amal == "*" || amal == "/") {
                ikkinchison = ikkinchison + 4
                binding.text1.text = ikkinchison
            }
            anim(binding.raqam4)
        }
        binding.raqam5.setOnClickListener {
            if (amal == "") {
                birinchison = birinchison + 5
                binding.text1.text = birinchison
            } else if (amal == "+" || amal == "-" || amal == "*" || amal == "/") {
                ikkinchison = ikkinchison + 5
                binding.text1.text = ikkinchison
            }
            anim(binding.raqam5)
        }
        binding.raqam6.setOnClickListener {
            if (amal == "") {
                birinchison = birinchison + 6
                binding.text1.text = birinchison
            } else if (amal == "+" || amal == "-" || amal == "*" || amal == "/") {
                ikkinchison = ikkinchison + 6
                binding.text1.text = ikkinchison
            }
            anim(binding.raqam6)
        }
        binding.raqam1.setOnClickListener {
            if (amal == "") {
                birinchison = birinchison + 1
                binding.text1.text = birinchison
            } else if (amal == "+" || amal == "-" || amal == "*" || amal == "/") {
                ikkinchison = ikkinchison + 1
                binding.text1.text = ikkinchison
            }
            anim(binding.raqam1)
        }
        binding.raqam2.setOnClickListener {
            if (amal == "") {
                birinchison = birinchison + 2
                binding.text1.text = birinchison
            } else if (amal == "+" || amal == "-" || amal == "*" || amal == "/") {
                ikkinchison = ikkinchison + 2
                binding.text1.text = ikkinchison
            }
            anim(binding.raqam2)
        }
        binding.raqam3.setOnClickListener {
            if (amal == "") {
                birinchison = birinchison + 3
                binding.text1.text = birinchison
            } else if (amal == "+" || amal == "-" || amal == "*" || amal == "/") {
                ikkinchison = ikkinchison + 3
                binding.text1.text = ikkinchison
            }
            anim(binding.raqam3)
        }
        binding.raqam0.setOnClickListener {
            if (amal == "") {
                birinchison = birinchison + 0
                binding.text1.text = birinchison
            } else if (amal == "+" || amal == "-" || amal == "*" || amal == "/") {
                ikkinchison = ikkinchison + 0
                binding.text1.text = ikkinchison
            }
            anim(binding.raqam0)
        }
        binding.AC.setOnClickListener {
            binding.text1.text = ""
            birinchison = ""
            ikkinchison = ""
            amal = ""
            anim(binding.AC)
        }
        binding.qoshuv.setOnClickListener {
            binding.text1.text = ""
            amal = "+"
            anim(binding.qoshuv)
        }
        binding.teng.setOnClickListener {
            if (amal == "+") {
                binding.text1.text = "${birinchison.toInt() + ikkinchison.toInt()}"
            } else if (amal == "*") {
                binding.text1.text = "${birinchison.toInt() * ikkinchison.toInt()}"
            } else if (amal == "/") {
                binding.text1.text = "${birinchison.toInt() / ikkinchison.toInt()}"
            } else if (amal == "-") {
                binding.text1.text = "${birinchison.toInt() - ikkinchison.toInt()}"
            }
            anim(binding.teng)
        }
        binding.kopaytiruv.setOnClickListener {
            binding.text1.text = ""
            amal = "*"
            anim(binding.kopaytiruv)
        }
        binding.boluv.setOnClickListener {
            binding.text1.text = ""
            amal = "/"
            anim(binding.boluv)
        }

        binding.ayiruv.setOnClickListener {
            binding.text1.text = ""
            amal = "-"
            anim(binding.ayiruv)
        }
    }

    private fun anim(view: View) {
        val anim = AnimationUtils.loadAnimation(this, R.anim.alpha)
        view.startAnimation(anim)
    }
}