package com.example.laptopku

object LaptopTerbaruData {
    internal val laptopNames= arrayOf("ASUS TUF FX506II",
        "Lenovo Legion 5","ASUS COBA 1", "ASUS COBA 2", "ASUS COBA 3")

    private val laptopPrices = arrayOf("Rp13.999.000",
        "Rp16.899.000","RpXX.XXX.XXX", "RpXX.XXX.XXX", "RpXX.XXX.XXX")

    internal val laptopImages = intArrayOf(R.drawable.ic_asustuf,
        R.drawable.ic_lenovolegion,
        R.drawable.ic_asustuf1,
        R.drawable.ic_asustuf2,
        R.drawable.ic_asustuf3)

    val listData: ArrayList<LaptopTerbaru>
        get(){
            val list = arrayListOf<LaptopTerbaru>()
            for (position in laptopNames.indices){
                val laptopTerbaru = LaptopTerbaru()
                laptopTerbaru.name = laptopNames[position]
                laptopTerbaru.price = laptopPrices[position]
                laptopTerbaru.photo = laptopImages[position]
                list.add(laptopTerbaru)
            }
            return list
        }
}