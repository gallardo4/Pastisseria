class Pasta {
    private var nom: String = ""
    private var preu: Float = 0f
    private var pes: Float = 0f
    private var kcal: Float = 0f

    constructor(pNom: String, pPreu: Float, pPes: Float, pKcal: Float) {
        this.nom = pNom
        this.preu = pPreu
        this.pes = pPes
        this.kcal = pKcal
    }

    fun getNom(): String {
        return nom
    }

    fun setNom(pNom: String) {
        this.nom = pNom
    }

    fun getPreu(): Float {
        return preu
    }

    fun setPreu(pPreu: Float) {
        this.preu = pPreu
    }

    fun getPes(): Float {
        return pes
    }

    fun setPes(pPes: Float) {
        this.pes = pPes
    }

    fun getKcal(): Float {
        return kcal
    }

    fun setKcal(pKcal: Float) {
        this.kcal = pKcal
    }

    override fun toString(): String {
        return "Pasta" +
                "\nNom: $nom" +
                "\nPreu: $preu€" +
                "\nPes: ${pes}g" +
                "\nKcal: ${kcal}kcal"
    }
}