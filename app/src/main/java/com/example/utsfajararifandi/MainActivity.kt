package com.example.utsfajararifandi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val motorterbaruList = listOf<Motorterbaru>(
            Motorterbaru(
                R.drawable.gambar_motor_all_new_honda_scoopy,
                "All New Honda Scoopy",
                "Bagi masbro yang mencari motor matic terbaru dengan desain stylish dan klasik, maka masbro bisa membeli All New Honda Scoopy. Desain motor ini sangat keren, dan cocok bagi para wanita yang selalu ingin tampil stylus. Honda juga melengkapinya dengan teknologi eSP (Enhanced Smart Power), sehinga konsumsi bahan bakar motor matic terbaru ini sangat irit. Tercatat All New Scoopy memiliki konsumsi BBM 59km/liter saat diuji dengan pengetesan Euro 3. Fitur Idling Stop System dan Combi Brake System juga dimilikinya. Selain itu, All New Scoopy memiliki layar depan LED Projecor yang memberikan pencahayaan lebih terang dimalam hari. Sedangkan untuk mesinnya memiliki kapasitas 108.2 PS dengan keluaran tenaga sebesar 9.1 PS pada 7.500 rpm dan torsi 9.4 Nm pada 6.000 rpm."
            ),

            Motorterbaru(
                R.drawable.gambar_motor_honda_beat_street,
                "Honda Beat Street",
                "Hadirnya Honda Beat Street menambah jajaran motor matic Honda yang dipasarkan di Indonesia. Motor ini memiliki desain berbeda dibandingkan All New Beat eSP ataupun Beat Pop. Yang paling mencolok adalah pemakaian stang adventure dan speedometer full digital. Motor matic terbaru ini juga dibalut streeping bergaya extreme street. Lalu ada pula ban tubeless dan beberapa fitur andalan Honda, seperti Idling Stop System, Combi Brake System, dan bagasi luas 11 liter. Sayangnya Honda Beat Street belum bisa menandingkan Yamaha X-Ride 125, karena motor ini masih mengandalkan mesin 110cc denan keluaran enaga 6.38 kw pada 7.500 rpm dan torsi 9.01 Nm pada 6.500 rpm."
            ),

            Motorterbaru(
                R.drawable.gambar_motor_honda_sh150i,
                "Honda SH150i",
                "Yamaha memiliki motor matic premium yang diimport langsung dari luar negeri, yaitu Honda SH150i. Harganya melebihi 40 Juta Rupiah, dan menawarkan desain modern yang berbeda dari motor matic pada umumnya. Beragam fitur canggih juga dimiliki motor matic terbaru Honda yang satu ini, seperti fitur Smart Key System atau sistem penguncian keyless. Pada bagian depan juga terpasang headlamp LED dan disediakan Power Charger untuk mempermudah pengisian baterai smartphone. Sedangkan untuk mesinnya mengusung mesin 153cc dengan keluaran tenaga sebesar 10.9 KW pada 8.250 rpm dan torsi sebesar 13.9 Nm pada 6.500 rpm. Tenaga yang dikeluarkan cukup besar, jadi wajar apabila harga motor matic terbaru ini cukup mahal."
            ),

            Motorterbaru(
                R.drawable.gambar_motor_suzuki_address_playful,
                "Suzuki Address Playful",
                "Motor matic terbaru yang satu ini memiliki desain penuh gaya untuk mencerminkan semangat kaum muda-mudi yang energjik, ceria, dan dinamis. Tersedia 10 pilihan warna Suzuki Address Playful yang bisa diplih sesuai dengan selera masyarakat Indonesia. Sedangkan untuk mesinnya memiliki kapasitas 113cc yang dioptimalkan sistem pembakaran Fuel Injection. Mesin bertipe SOHC tersebut dioptimalkan oleh sistem pending udara dan transmisi CVT. Pemakaian teknologi Fuel Injection membuat Address Playful semakin irit dan bisa mengeluarkan tenaga lebih besar. Bobot motor matic terbaru ini juga ringan, yaitu seberat 97 kg. Alhasil Address Playful tergolong motor yang lincah saat diajak bermanuver."
            ),

            Motorterbaru(
                R.drawable.gambar_motor_yamaha_aerox155,
                "Yamaha Aerox 155",
                "Tersedia tiga varian Yamaha Aerox 155, yaitu versi standar, R-Version, dan S-Version. Motor matic terbaru ini menjadi lawan tangguh bagi Honda Vario 150. Namun secara keseluruhan Aerox 155 lebih baik dibandingkan Vario 150. Hal ini tidak lepas dari bodi bongsor yang membuatnya terlihat lebih sporty. Walaupun tidak selincah Vario 150, namun tenaga yang dimiliki Aerox 155 jauh lebih besar. Kemampuan ini berkat mesin 155cc yang dilengkapi teknologi Variable Valve Actuation (VVA) untuk membuat tarikan mesin lebih bertenaga. Lalu ada pula teknologi Blue Core dan Forged Piston & DiAsil Cylinder. Perpaduan tersebut membuat Aerox 155 bisa mengeluarkan tenaga sebesar 11.0 kw pada 8.000 rpm dan torsi 13.8 Nm pada 6.250 rpm."
            ),

            Motorterbaru(
                R.drawable.gambar_motor_yamaha_fino_grande,
                "Yamaha Fino Grande",
                "Motor matic terbaru ini memiliki desain berbeda dibandingkan Yamaha Fino 2017 tipe Sport dan Premium. Pasalnya motor ini telah dilengkapi lampu depan LED dengan desain elegan yang membuat penerangan semakin maksimal dan lebih focus. Balutan warna Royal Blue dan jok stylish menambah kemewanan motor matic Yamaha tersebut. Selain itu, Yamaha Fino Grande telah menggunakan ban bertipe Tubeless dengan tapak lebih. Sedangkan untuk mesinnya memiliki kapasitas 125cc dengan teknologi Blue Core yang membuat konsumsi bahan bakar semakin efisien, dan kinerja mesin menjadi halus. Mesin tersebut bisa memproduksi tenaga sebesar 9.52 PS dan torsi 9.6 Nm."
            ),

            Motorterbaru(
                R.drawable.gambar_motor_yamaha_tmax_dx,
                "Yamaha TMAX DX",
                "amaha segera memasarkan Yamaha TMAX DX di Indonesia. Motor ini bisa menjadi solusi bagi konsumen yang hobi mengendarai Moge. Desain keren yang membalut setiap sisi TMAX DX membuatnya menjadi salah satu motor matic Yamaha dengan kualitas terbaik. Jangan heran apabila harganya melebihi 200 Juta Rupiah, karena motor ini memiliki mesin 2 silinder berkapasitas 530cc. Motor matic terbaru ini juga memiliki fitur Cruise Control dan D-Mode dengan dua pilihan mode berkendara, yaitu City atau Sport. Lebih hebatnya lagi, TMAX DX juga memiliki suspensi depan Upside Down, Traction Control System (TCS) dan sistem pengereman ABS."
            ),

            Motorterbaru(
                R.drawable.gambar_motor_yamaha_xmax250,
                "Yamaha XMAX 250",
                "Yamaha memiliki motor matic terbaru bernama XMAX. Salah satu keistimewaan motor ini adalah mesin 250cc yang dimilikinnya. Mesin tersebut dioptimalkan oleh teknologi TCS (Traction Control System) yang akan mengurangi resiko ban belakang selip. Selain itu, Yamaha XMAX 250 telah dilengkapi sistem pengereman ABS (Anti-Lock Breaking System) dan double disk brake, sehingga kontrol pengereman lebih maksimal. Desain XMAX juga sangat keren, dan terlihat jauh lebih besar dibandingkan NMAX ataupun Aerox. Mesin 250cc yang dipakainya juga mampu mengeluarkan tenaga mencapai 16.8 KW pada 7.000 rpm dan torsi 24.3 Nm pada 5.500 rpm."
            ),

            Motorterbaru(
                R.drawable.gambar_motor_yamaha_x_ride125,
                "All New Yamaha X Ride 125",
                "Yamaha XMAX 250 layak disebut sebagai motor matic terbaru dengan kualitas terbaik di Indonesia. Namun masih ada satu lagi motor matic terbaru dari Yamaha, yaitu X-Ride 125. Motor ini memadukan dirancang sebagai motor matic Adventure dengan desain lebih agresif dibandingkan motor matic pada umumnya. Terlebih Yamaha X-Ride 125 telah dilengkapi stang bergaya adventure yang memiliki dimensi lebih lebar, sehingga semakin mantap dalam melentasi berbagai medan jalan. Sedangkan untuk mesinnya ditenagai mesin 125cc dengan keluaran tenaga dan torsi sama persis seperti Yamaha Fino Grande, yaitu mencapai 7.0 kw pada 8.000 rpm dan torsi 9.6 Nm pada 5.500 rpm."
            ),

            Motorterbaru(
                R.drawable.mio_s125bluecore,
                "Yamaha Mio S 125 Blue Core",
                "Ban tubeless dengan tapak lebar menjadi daya tarik motor matic terbaru ini. Yamaha melengkapi Mio S dengan ban depan berukuran 80/80-14M/C 43P dan ban belakang 100/70-14M/C 51P yang membuat berkendara lebih nyaman dan stabil. Bodinya juga ramping serta ringan, sehingga Yamaha Mio S lebih mudah bermanuver di kemacentan. Sedangkan untuk mesinnya memiliki kapasitas 125cc yang dioptimalkan teknologi Blue Core agar irit dan bisa mengeluarkan tenaga mencapai 7.0 KW pada 8.000 rpm. Sedangkan torsinya mencapai 9.6 Nm pada 5.500 rpm. Lalu ada pula fitur Answer Back System sebagai salah satu kelebihan motor matic terbaru ini."
            ),
        )


        val recyclerView = findViewById<RecyclerView>(R.id.rv_motor)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = MotorterbaruAdapter(this, motorterbaruList) {
            val intent = Intent(this, DetailMotorTerbaruActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }

}