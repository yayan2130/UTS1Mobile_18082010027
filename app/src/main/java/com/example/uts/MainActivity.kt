package com.example.uts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.uts.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data = createFac()
        rv_list_main.layoutManager = LinearLayoutManager(this)
        rv_list_main.setHasFixedSize(true)
        rv_list_main.adapter = adapter_fak(data, { onItem: data_fak ->
            onItemClicked(onItem) })
    }
    private fun onItemClicked(onItem: data_fak) {
        val showDetailActivityIntent = Intent(this, detail_fak::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, onItem.imgFac)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE, onItem.nameFac)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, onItem.descFac)
        showDetailActivityIntent.putExtra(Intent.EXTRA_SUBJECT, onItem.descDet)
        startActivity(showDetailActivityIntent)
    }
    private fun createFac(): List<data_fak> {
        val rvList = ArrayList<data_fak>()
        rvList.add(
            data_fak(
                R.drawable.logo,
                "Fakultas Ilmu Komputer",
                "Fakultas Ilmu Komputer\n" +
                        "adalah satu dari dari 7\n" +
                        "program studi di UPN\n" +
                        "VETERAN JATIM",
                "1. Teknik Informatika\n" +
                        "2. Sistem Informasi"
            )
        )
        rvList.add(
            data_fak(
                R.drawable.logo,
                "Fakultas Teknik",
                "Fakultas Teknik\n" +
                        "merupakan salah satu dari 7\n" +
                        "Fakultas 'Veteran' Jawa\n" +
                        "Timur. Yang terdiri dari program\n" +
                        "studi: ",
                "1. Teknik Kimia\n" +
                        "2. Teknik Industri\n" +
                        "3. Teknik Sipil\n" +
                        "4. Teknik Lingkungan\n" +
                        "5. Teknologi Pangan"
            )
        )
        rvList.add(
            data_fak(
                R.drawable.logo,
                "Fakultas Ekonomi dan Bisnis",
                "Fakultas Ekonomi dan Bisnis\n" +
                        "merupakan salah satu dari 7\n" +
                        "Fakultas 'Veteran' Jawa\n" +
                        "Timur. Yang terdiri dari program\n" +
                        "studi: ",
                "1. Ekonomi Pembangunan\n" +
                        "2. Akuntansi\n" +
                        "3. Manajemen"
            )
        )
        rvList.add(
            data_fak(
                R.drawable.logo,
                "Fakultas Pertanian",
                "Fakultas Pertanian\n" +
                        "merupakan salah satu dari 7\n" +
                        "Fakultas 'Veteran' Jawa\n" +
                        "Timur. Yang terdiri dari program\n" +
                        "studi: ",
                "1. Agroteknologi\n" +
                        "2. Agribisnis"
            )
        )
        rvList.add(
            data_fak(
                R.drawable.januar,
                "Short Profile",
                "Nama : Muhammad Januar Pribadi\n"+
                        "Tempat Tanggal Lahir : Surabaya, 20 Januari 2000\n" +
                        "Alamat : PBI Blok H-12\n" +
                        "No. Telepon : 085155306005\n" +
                        "Email : yayan2130@gmail.com\n" +
                        "Github : https://github.com/yayan2130\n",
                "Riwayat Pendidikan : \n" +
                        "\t\t 1. SD Al Kautsar \n" +
                        "\t\t 2. SMPI Al - Mizan \n" +
                        "\t\t 3. SMA Wijaya Putra \n\n" +
                        "Penghargaan : \n" +
                        "none"
            )
        )
        return rvList
    }
}