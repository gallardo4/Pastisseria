class Beguda {
    private var nom: String = ""
    private var preu: Float = 0f
    private var incrementSucre: Boolean = false

    constructor(pNom: String, pPreu: Float, pIncrementSucre: Boolean){
        this.nom = pNom
        this.preu = pPreu
        this.incrementSucre = pIncrementSucre
    }

    fun getNom():String{
        return nom
    }

    fun setNom(pNom: String){
        this.nom = pNom
    }

    fun getPreu():Float{
        return preu
    }

    fun setPreu(pPreu: Float){
        this.preu = pPreu
    }

    fun getIncrementSucre():Boolean{
        return incrementSucre
    }

    fun setIncrementSucre(pIncrementSucre: Boolean){
        this.incrementSucre = pIncrementSucre
    }

    override fun toString(): String {
        return if (incrementSucre){
            "$nom $preu€ $incrementSucre - Té sucre"
        } else {
            "$nom $preu€ $incrementSucre - No té sucre"
        }
    }
}