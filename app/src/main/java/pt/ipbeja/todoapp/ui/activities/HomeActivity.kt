package pt.ipbeja.todoapp.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import pt.ipbeja.todoapp.R

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        window.navigationBarColor = getColor(R.color.home_activity_bottom_nav_color)
    }
}