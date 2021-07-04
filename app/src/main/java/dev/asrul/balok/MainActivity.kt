package dev.asrul.balok

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    companion object {
        private const val STATE_HASIL = "state_hasil"
    }
    private lateinit var edtPanjang: EditText
    private lateinit var edtLebar: EditText
    private lateinit var edtTinggi: EditText
    private lateinit var btnHitung: Button
    private lateinit var tvHasil: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // disebut ngecast atu menghungkan layout dan logic
        edtPanjang = findViewById(R.id.edt_panjang)
        edtLebar = findViewById(R.id.edt_lebar)
        edtTinggi = findViewById(R.id.edt_tinggi)
        btnHitung = findViewById(R.id.btn_hitung)
        tvHasil = findViewById(R.id.tv_hasil)

        btnHitung.setOnClickListener(this)

        if (savedInstanceState != null) {
            val hasil = savedInstanceState.getString(STATE_HASIL)
            tvHasil.text = hasil
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(STATE_HASIL, tvHasil.text.toString())
    }

    override fun onClick(v: View) {
        if (v.id == R.id.btn_hitung) {
            val inputPanjang = edtPanjang.text.toString().trim()
            val inputLebar = edtLebar.text.toString().trim()
            val inputTinggi = edtTinggi.text.toString().trim()

            var isEmptyField = false
            if (inputPanjang.isEmpty()) {
                isEmptyField = true
                edtPanjang.error = "Kolom panjang harus diisi"
            }
            if (inputLebar.isEmpty()) {
                isEmptyField = true
                edtLebar.error = "Kolom lebar harus diisi"
            }
            if (inputTinggi.isEmpty()) {
                isEmptyField = true
                edtTinggi.error = "Kolom tinggi harus diisi"
            }

            if (!isEmptyField) {
                val volume = inputPanjang.toDouble() * inputLebar.toDouble() * inputTinggi.toDouble()
                tvHasil.text = volume.toString()
            }
        }
    }
}