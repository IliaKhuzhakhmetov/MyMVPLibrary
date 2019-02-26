

interface BaseView<out T : BasePresenter<*>> {

    val presenter: T

}