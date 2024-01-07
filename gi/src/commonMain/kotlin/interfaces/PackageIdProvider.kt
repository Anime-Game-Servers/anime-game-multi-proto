package interfaces

interface PackageIdProvider {
    fun getPackageId(packageName:String) : Int
    fun getPackageName(packageId:Int) : String?
}