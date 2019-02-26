
interface BasePresenter<T> {

    fun stop()

    var view: T
}