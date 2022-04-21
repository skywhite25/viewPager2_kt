package com.example.viewPager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

/*    private val MIN_SCALE = 0.85F // 뷰가 몇 퍼센트로 줄어드는지
    private val MIN_ALPHA = 0.5f // 어두워지는 정도?*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager_icon.adapter = ViewPagerAdapter(getIconList()) // create adapter
        viewPager_icon.orientation = ViewPager2.ORIENTATION_HORIZONTAL // 방향 가로
    }

    // 뷰페이지에 들어갈 아이템
    private fun getIconList(): ArrayList<Int> {
        return arrayListOf<Int>(R.drawable.icon1, R.drawable.icon2, R.drawable.icon3)
    }
}