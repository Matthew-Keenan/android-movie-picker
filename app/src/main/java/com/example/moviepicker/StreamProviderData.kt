package com.example.moviepicker


import com.google.gson.annotations.SerializedName

data class StreamProviderData(
    @SerializedName("id")
    val id: Int,
    @SerializedName("results")
    val results: Results
) {
    data class Results(
        @SerializedName("AR")
        val aR: AR,
        @SerializedName("AT")
        val aT: AT,
        @SerializedName("AU")
        val aU: AU,
        @SerializedName("BE")
        val bE: BE,
        @SerializedName("BG")
        val bG: BG,
        @SerializedName("BO")
        val bO: BO,
        @SerializedName("BR")
        val bR: BR,
        @SerializedName("CA")
        val cA: CA,
        @SerializedName("CH")
        val cH: CH,
        @SerializedName("CL")
        val cL: CL,
        @SerializedName("CO")
        val cO: CO,
        @SerializedName("CR")
        val cR: CR,
        @SerializedName("CZ")
        val cZ: CZ,
        @SerializedName("DE")
        val dE: DE,
        @SerializedName("DK")
        val dK: DK,
        @SerializedName("EC")
        val eC: EC,
        @SerializedName("EE")
        val eE: EE,
        @SerializedName("ES")
        val eS: ES,
        @SerializedName("FI")
        val fI: FI,
        @SerializedName("FR")
        val fR: FR,
        @SerializedName("GB")
        val gB: GB,
        @SerializedName("GR")
        val gR: GR,
        @SerializedName("GT")
        val gT: GT,
        @SerializedName("HK")
        val hK: HK,
        @SerializedName("HN")
        val hN: HN,
        @SerializedName("HU")
        val hU: HU,
        @SerializedName("ID")
        val iD: ID,
        @SerializedName("IE")
        val iE: IE,
        @SerializedName("IN")
        val iN: IN,
        @SerializedName("IT")
        val iT: IT,
        @SerializedName("JP")
        val jP: JP,
        @SerializedName("KR")
        val kR: KR,
        @SerializedName("LT")
        val lT: LT,
        @SerializedName("LV")
        val lV: LV,
        @SerializedName("MX")
        val mX: MX,
        @SerializedName("MY")
        val mY: MY,
        @SerializedName("NL")
        val nL: NL,
        @SerializedName("NO")
        val nO: NO,
        @SerializedName("NZ")
        val nZ: NZ,
        @SerializedName("PE")
        val pE: PE,
        @SerializedName("PH")
        val pH: PH,
        @SerializedName("PL")
        val pL: PL,
        @SerializedName("PT")
        val pT: PT,
        @SerializedName("PY")
        val pY: PY,
        @SerializedName("RU")
        val rU: RU,
        @SerializedName("SE")
        val sE: SE,
        @SerializedName("SG")
        val sG: SG,
        @SerializedName("TH")
        val tH: TH,
        @SerializedName("TR")
        val tR: TR,
        @SerializedName("TW")
        val tW: TW,
        @SerializedName("US")
        val uS: US,
        @SerializedName("VE")
        val vE: VE,
        @SerializedName("ZA")
        val zA: ZA
    ) {
        data class AR(
            @SerializedName("link")
            val link: String,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>,
            @SerializedName("buy")
            val buy: List<Buy>
        ) {
            data class Rent(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Flatrate(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Buy(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )
        }

        data class AT(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("rent")
            val rent: List<Rent>
        ) {
            data class Flatrate(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Buy(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Rent(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )
        }

        data class AU(
            @SerializedName("link")
            val link: String,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Buy(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Rent(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Flatrate(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )
        }

        data class BE(
            @SerializedName("link")
            val link: String,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>,
            @SerializedName("buy")
            val buy: List<Buy>
        ) {
            data class Rent(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Flatrate(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Buy(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )
        }

        data class BG(
            @SerializedName("link")
            val link: String,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>,
            @SerializedName("rent")
            val rent: List<Rent>
        ) {
            data class Buy(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Flatrate(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Rent(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )
        }

        data class BO(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Flatrate(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )
        }

        data class BR(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Flatrate(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )
        }

        data class CA(
            @SerializedName("link")
            val link: String,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Buy(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Rent(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Flatrate(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )
        }

        data class CH(
            @SerializedName("link")
            val link: String,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Rent(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Buy(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Flatrate(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )
        }

        data class CL(
            @SerializedName("link")
            val link: String,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Rent(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Buy(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Flatrate(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )
        }

        data class CO(
            @SerializedName("link")
            val link: String,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>,
            @SerializedName("rent")
            val rent: List<Rent>
        ) {
            data class Buy(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Flatrate(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Rent(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )
        }

        data class CR(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Flatrate(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )
        }

        data class CZ(
            @SerializedName("link")
            val link: String,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("rent")
            val rent: List<Rent>
        ) {
            data class Buy(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Rent(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )
        }

        data class DE(
            @SerializedName("link")
            val link: String,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Buy(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Rent(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Flatrate(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )
        }

        data class DK(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("buy")
            val buy: List<Buy>
        ) {
            data class Flatrate(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Rent(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Buy(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )
        }

        data class EC(
            @SerializedName("link")
            val link: String,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>,
            @SerializedName("buy")
            val buy: List<Buy>
        ) {
            data class Rent(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Flatrate(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Buy(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )
        }

        data class EE(
            @SerializedName("link")
            val link: String,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("buy")
            val buy: List<Buy>
        ) {
            data class Rent(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Buy(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )
        }

        data class ES(
            @SerializedName("link")
            val link: String,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>,
            @SerializedName("rent")
            val rent: List<Rent>
        ) {
            data class Buy(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Flatrate(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Rent(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )
        }

        data class FI(
            @SerializedName("link")
            val link: String,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Buy(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Rent(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Flatrate(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )
        }

        data class FR(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("rent")
            val rent: List<Rent>
        ) {
            data class Flatrate(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Buy(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Rent(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )
        }

        data class GB(
            @SerializedName("link")
            val link: String,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Rent(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Buy(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Flatrate(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )
        }

        data class GR(
            @SerializedName("link")
            val link: String,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("rent")
            val rent: List<Rent>
        ) {
            data class Buy(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Rent(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )
        }

        data class GT(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Flatrate(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )
        }

        data class HK(
            @SerializedName("link")
            val link: String,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Buy(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Rent(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Flatrate(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )
        }

        data class HN(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Flatrate(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )
        }

        data class HU(
            @SerializedName("link")
            val link: String,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("rent")
            val rent: List<Rent>
        ) {
            data class Buy(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Rent(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )
        }

        data class ID(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("buy")
            val buy: List<Buy>
        ) {
            data class Flatrate(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Rent(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Buy(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )
        }

        data class IE(
            @SerializedName("link")
            val link: String,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Rent(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Buy(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Flatrate(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )
        }

        data class IN(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("rent")
            val rent: List<Rent>
        ) {
            data class Flatrate(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Buy(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Rent(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )
        }

        data class IT(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("buy")
            val buy: List<Buy>
        ) {
            data class Flatrate(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Rent(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Buy(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )
        }

        data class JP(
            @SerializedName("link")
            val link: String,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Rent(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Buy(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Flatrate(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )
        }

        data class KR(
            @SerializedName("link")
            val link: String,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Buy(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Flatrate(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )
        }

        data class LT(
            @SerializedName("link")
            val link: String,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>,
            @SerializedName("rent")
            val rent: List<Rent>
        ) {
            data class Buy(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Flatrate(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Rent(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )
        }

        data class LV(
            @SerializedName("link")
            val link: String,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("rent")
            val rent: List<Rent>
        ) {
            data class Buy(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Rent(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )
        }

        data class MX(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Flatrate(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )
        }

        data class MY(
            @SerializedName("link")
            val link: String,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>,
            @SerializedName("rent")
            val rent: List<Rent>
        ) {
            data class Buy(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Flatrate(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Rent(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )
        }

        data class NL(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("rent")
            val rent: List<Rent>
        ) {
            data class Flatrate(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Buy(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Rent(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )
        }

        data class NO(
            @SerializedName("link")
            val link: String,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>,
            @SerializedName("buy")
            val buy: List<Buy>
        ) {
            data class Rent(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Flatrate(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Buy(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )
        }

        data class NZ(
            @SerializedName("link")
            val link: String,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Buy(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Rent(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Flatrate(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )
        }

        data class PE(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("rent")
            val rent: List<Rent>
        ) {
            data class Flatrate(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Buy(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Rent(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )
        }

        data class PH(
            @SerializedName("link")
            val link: String,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("rent")
            val rent: List<Rent>
        ) {
            data class Buy(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Rent(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )
        }

        data class PL(
            @SerializedName("link")
            val link: String,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Buy(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Rent(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Flatrate(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )
        }

        data class PT(
            @SerializedName("link")
            val link: String,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Rent(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Buy(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Flatrate(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )
        }

        data class PY(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Flatrate(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )
        }

        data class RU(
            @SerializedName("link")
            val link: String,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>,
            @SerializedName("buy")
            val buy: List<Buy>
        ) {
            data class Rent(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Flatrate(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Buy(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )
        }

        data class SE(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("rent")
            val rent: List<Rent>
        ) {
            data class Flatrate(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Buy(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Rent(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )
        }

        data class SG(
            @SerializedName("link")
            val link: String,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>,
            @SerializedName("rent")
            val rent: List<Rent>
        ) {
            data class Buy(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Flatrate(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Rent(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )
        }

        data class TH(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("rent")
            val rent: List<Rent>
        ) {
            data class Flatrate(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Buy(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Rent(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )
        }

        data class TR(
            @SerializedName("link")
            val link: String,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("rent")
            val rent: List<Rent>
        ) {
            data class Buy(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Rent(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )
        }

        data class TW(
            @SerializedName("link")
            val link: String,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Rent(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Buy(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Flatrate(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )
        }

        data class US(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("free")
            val free: List<Free>
        ) {
            data class Flatrate(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Rent(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Buy(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Free(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )
        }

        data class VE(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("buy")
            val buy: List<Buy>
        ) {
            data class Flatrate(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Rent(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Buy(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )
        }

        data class ZA(
            @SerializedName("link")
            val link: String,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("buy")
            val buy: List<Buy>
        ) {
            data class Rent(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )

            data class Buy(
                @SerializedName("display_priority")
                val displayPriority: Int,
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String
            )
        }
    }
}