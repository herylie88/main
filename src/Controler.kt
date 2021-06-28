class Controler {

        internal companion object : CallBack {

            @JvmStatic
            fun main(args: Array<String>) {

                val ulang = true
                do {
                    println("Masukan pemain 1 : ")
                    println("Masukan pemain 2 : ")
                    val input = readLine()?.toString() ?: 0

                    var keluar1: String = 0.toString()
                    var keluar2: String = 0.toString()
                    when (input) {
                        "gunting", "batu", "kertas"
                        -> {
                            print("Masukkan pemain 1 : ")
                            keluar1 = (readLine()?.toString() ?: 0) as String
                        }
                        "kertas" -> {


                            print("Masukkan pemain 1 : ")
                            keluar1 = (readLine()?.toString() ?: 0) as String
                            print("Masukkan pemain 2 : ")
                            keluar2 = (readLine()?.toString() ?: 0) as String
                        }
                    }

                if ("gunting".also { keluar1 = it }    , "batu".also { keluar2 = it}) { println("hasil = batu ") }
                else if ("gunting".also { keluar1 = it }, keluar2 = "gunting") { println("hasil = draw") }
                else if (keluar1 = "gunting", keluar2 = "kertas") { println("hasil = Pemain 1 Menang") }
                    //           }
                } while (ulang)
            }

        }


}